
RTAdmin Requirements
====================

In the context of the Scalaness implementation of SpartanRPC, RTAdmin is a library providing RT
trust management services. It is not intended to be a standalone program. It would be possible
to create a command shell for the RTAdmin library in a similar manner as the RTAdmin program
developed for Sprocket. However, such a command shell is not a priority requirement.

The RTAdmin library provides local-only services. It is not responsible for any network
communications, for example with remote programs holding RT certificates. If the application
requires such communication it must be handled outside of RTAdmin. However, RTAdmin is
responsible for storing RT related data structures; indeed this is one of its principle
functions as detailed below. In addition RTAdmin is responsible for doing various cryptographic
and RT trust management computations.

RT Credential Format
--------------------

RTAdmin must store and manipulate RT_0 credentials. Since the RT trust management system
identifies entities by their keys, the RT credentials should be stored in a manner that reflects
this. The use of names for entities is purely a local decision with no bearing on the
credentials themsleves of the cryptographic tokens associated with them.

The format of the credentials is as follows: The first byte is an integer 1 .. 4 to specify the
credential type. Each type is formatted slightly differently.

1. Membership Credential (A.r <- E).
   [ 1   ]   Identifier byte is one.
   [ K_A ]   The 160 bit ECC public key of the credential issuer.
   "r"       A null terminated role name.
   [ K_E ]   The 160 bit ECC public key of the role member.

2. Inclusion Credential (A.r <- B.s)
   [ 2   ]   Identifier byte is two.
   [ K_A ]   The 160 bit ECC public key of the credential issuer.
   "r"       A null terminated role name.
   [ K_B ]   The 160 bit ECC public key of the inclusion specifier.
   "s"       A null terminated role name.

3. Linked Credential (A.r <- B.s.t)
   [ 3   ]   Identifier byte is three.
   [ K_A ]   The 160 bit ECC public key of the credential issuer.
   "r"       A null terminated role name.
   [ K_B ]   The 160 bit ECC public key of the indirection manager.
   "s"       A null terminated role name.
   "t"       A null terminated role name.

4. Intersection Credential (A.r <- B.s ^ C.t)
   [ 4   ]   Identifier byte is four.
   [ K_A ]   The 160 bit ECC public key of the credential issuer.
   "r"       A null terminated role name.
   [ K_B ]   The 160 bit ECC public key of the first inclusion specifier.
   "s"       A null terminated role name.
   [ K_C ]   The 160 bit ECC public key of the second inclusion specifier.
   "t"       A null terminted role name.

RTAdmin Databases
-----------------

The RTAdmin library must maintain two data storage areas.

1. Key Storage: A bidirectional mapping between keys and user specified names. It should be
   possible to look up a key given a name or look up a name given a key. The user specified
   names are not sigifnicant to the system; they exist only as a convenience to the user. For
   some keys the private key may also be available.

2. Credential Storage: It should be possible to parse a string form of credential (replacing the
   entity names with appropriate keys) or generate the string form from the binary form
   (replacing the keys with appropriate entity names).

Operations
----------

RTAdmin should have a notion of "current entity." The current entity must have a private key
available. It is possible for there to be no current entity (for example when an application
first starts).

The following methods should be provided

* Generate a public/private key pair and optionally name the corresponding entity.
* Set the current entity.
* Get the current entity (by name or by key).

* Adding a key (optionally with a name) to key storage.
* Adding or changing the name on an existing key.
* Enumerating the keys in key storage.
* Removing a key (either directly or by name) from key storage. This should not be allowed if
  there are credentials in credential storage using the key.

* Adding a certificate to the credential storage. The certificate is immediately verified and
  rejected if it is invalid. This should cause the keys used in the credential to be
  automatically added to key storage.
* Adding a credential to the credential storage. The credential must be in string form and
  issued by the current entity. It is immediately signed.
* Enumerating the credentials in storage.
* Removing a credential.
