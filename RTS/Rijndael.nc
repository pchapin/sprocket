
interface Rijndael {

    command int SetupEncrypt
        (      unsigned long *rk,
         const unsigned char *key,
               int            keybits);

    command void Encrypt
        (const unsigned long *rk,
               int            nrounds,
         const unsigned char  plaintext[16],
               unsigned char  ciphertext[16]);
}
