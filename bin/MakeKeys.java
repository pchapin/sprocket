import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECPoint;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;

class MakeKeys {
    public static void main(String[] args)
        throws java.security.NoSuchProviderException,
               java.security.NoSuchAlgorithmException,
               java.security.InvalidAlgorithmParameterException
    {
        Security.addProvider(new BouncyCastleProvider());
        ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec("secp160k1");
        KeyPairGenerator generator = KeyPairGenerator.getInstance("ECDSA", "BC");
        generator.initialize(ecSpec, new SecureRandom());
        KeyPair pair = generator.generateKeyPair();
        
        ECPublicKey publicKey = (ECPublicKey)pair.getPublic();
        ECPrivateKey privateKey = (ECPrivateKey)pair.getPrivate();
        
        // Let's work on the public key first.
        ECPoint W = publicKey.getW();
        BigInteger X = W.getAffineX();
        BigInteger Y = W.getAffineY();
        
        System.out.println("Public key's point W in affine coordinates:");
        System.out.println("X = " + X.toString(16));
        System.out.println("Y = " + Y.toString(16));
        System.out.print("\n");
        
        // Now the private key.
        BigInteger S = privateKey.getS();
        
        System.out.println("Private key's value of S:");
        System.out.println("S = " + S.toString(16));
    }
}
