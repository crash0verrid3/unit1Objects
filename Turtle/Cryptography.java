import java.io.IOException;
import java.util.Random;
import java.math.BigInteger;
import java.security.MessageDigest;
/**
 * Creates an irreversible hash from any given message
 * 
 * @author Alex Anderson
 * @version 8/21/2015
 */
public class Cryptography
{
    public static int gSeed = (new Random(299792458)).nextInt(299792458) + 1;
    public static void main(String[] args) throws IOException, java.security.NoSuchAlgorithmException {
        String s = Input.prompt("> ");
        int prime = 0;
        int current = 0;
        char out = 0;
        String hash = "";
        String hash2 = "";
        for(int x=0; x<s.length(); x++){
            prime = Prime_Number_Generator.randomPrime();
            current = s.charAt(x) + prime;
            out += (current + (gSeed / prime) + (prime / gSeed)) + (Prime_Number_Generator.randomPrime() ^ 9) * x + x;
            hash += String.valueOf(out + gSeed + Prime_Number_Generator.randomPrime());
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hsh = digest.digest(hash.getBytes("UTF-8"));
            hash += new String(hsh);
            gSeed ++;
        }
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hsh = digest.digest(hash.getBytes("UTF-8"));
        hash2 += new String(hsh);
        digest = MessageDigest.getInstance("SHA-1");
        hsh = digest.digest(hash.getBytes("UTF-8"));
        hash2 += new String(hsh);
        digest = MessageDigest.getInstance("MD5");
        hsh = digest.digest(hash.getBytes("UTF-8"));
        hash2 += new String(hsh);
        digest = MessageDigest.getInstance("SHA-256");
        hsh = digest.digest(hash.getBytes("UTF-8"));
        hash2 = new String(hash2);
        System.out.println(hash2);
    }
    public static void loop() throws IOException, java.security.NoSuchAlgorithmException {
        while(true){
            Cryptography.main(new String[] {""});
            gSeed = (new Random(299792458)).nextInt(299792458) + 1;
        }
    }
}
