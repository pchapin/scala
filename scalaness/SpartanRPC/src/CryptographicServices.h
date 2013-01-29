// FILE   : CryptographicServices.h
// SUMMARY: Definition of various types that are needed by components manipulating crypto objects.

#ifndef CRYPTOGRAPHICSERVICES_H
#define CRYPTOGRAPHICSERVICES_H

#include "ECC.h"

typedef uint8_t octet_t;

// Various sizes in bytes. These sizes reflect storage requirements in the certificate. Use
// the sizeof operator on the structures below to measure storage requirements in memory. Right
// now only 160-bit ECC keys are supported.
//
#define PUBLIC_KEY_SIZE  40   // x||y
#define PRIVATE_KEY_SIZE 20
#define SIGNATURE_SIZE   42   // r||s
#define SESSION_KEY_SIZE 16

// Multi-byte integers are stored in little endian form in memory.

struct PublicKey {
    Point value;
};

struct PrivateKey {
    octet_t value[PRIVATE_KEY_SIZE];
};

struct Signature {
    NN_DIGIT r[NUMWORDS];
    NN_DIGIT s[NUMWORDS];
};

// Right now only 128-bit AES keys are supported.
struct SessionKey {
    octet_t value[SESSION_KEY_SIZE];
};

#endif

