import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

import javax.crypto.KeyAgreement;
import org.bouncycastle.jce.ECNamedCurveTable;

public class Check {

    private static void display(byte[] data)
    {
        // This is hackish because it displays each value with a variable number of digits and
        // because it displays negative values with a negative sign. However for doing an
        // "eyeball" comparision of values it is adequate.
        //
        // TODO: Format each byte as exactly two digit hex values.
        //
        for (byte item : data) {
            System.out.print(item);
        }
        System.out.print("\n");
    }


    public static void main(String[] args) throws Exception
    {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        // We'll use a named curve instead.
        // EllipticCurve curve = new EllipticCurve(new ECFieldFp(new BigInteger(
        //     "fffffffffffffffffffffffffffffffeffffffffffffffff", 16)), new BigInteger(
        //     "fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger(
        //     "fffffffffffffffffffffffffffffffefffffffffffffffc", 16));

        // ECParameterSpec ecSpec = new ECParameterSpec(curve, new ECPoint(new BigInteger(
        //     "fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger(
        //     "fffffffffffffffffffffffffffffffefffffffffffffffc", 16)), new BigInteger(
        //     "fffffffffffffffffffffffffffffffefffffffffffffffc", 16), 1);

        // Could use more than 160 bits now since we aren't doing these calculations on the mote.
        org.bouncycastle.jce.spec.ECParameterSpec ecSpec =
            ECNamedCurveTable.getParameterSpec("secp160k1");

        // Make two key pairs for digital signatures.
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("ECDSA", "BC");
        keyGen.initialize(ecSpec, new SecureRandom());
        KeyPair aPair = keyGen.generateKeyPair();
        KeyPair bPair = keyGen.generateKeyPair();

        // Create two key agreement objects for Diffie-Hellman.
        KeyAgreement aKeyAgree = KeyAgreement.getInstance("ECDH", "BC");
        KeyAgreement bKeyAgree = KeyAgreement.getInstance("ECDH", "BC");

        // Execute the key agreement and hash the result to 160 bits with SHA1.
        aKeyAgree.init(aPair.getPrivate());
        bKeyAgree.init(bPair.getPrivate());
        aKeyAgree.doPhase(bPair.getPublic(), true);
        bKeyAgree.doPhase(aPair.getPublic(), true);
        MessageDigest hash = MessageDigest.getInstance("SHA1", "BC");        
        byte[] aSecret = hash.digest(aKeyAgree.generateSecret());
        byte[] bSecret = hash.digest(bKeyAgree.generateSecret());

        // Output the result to verify that both A and B computed the same secret value.
        display(aSecret);
        display(bSecret);
    }
}
