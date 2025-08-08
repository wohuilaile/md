import java.security.*;
import java.util.Base64;

public class ShortRSAKeyGen {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(512); // 512位，短密钥
        KeyPair keyPair = keyGen.generateKeyPair();

        String publicKey = Base64.getEncoder().encodeToString(keyPair.getPublic().getEncoded());
        String privateKey = Base64.getEncoder().encodeToString(keyPair.getPrivate().getEncoded());

        System.out.println("Public Key:\n" + publicKey);
        System.out.println("Private Key:\n" + privateKey);
    }
}