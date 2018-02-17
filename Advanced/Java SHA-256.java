import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        try{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(key.getBytes());
        
        byte[] digest = md.digest();
        
        StringBuffer stringbuffer = new StringBuffer();
        for (byte b: digest)
        {  // needed to print it in hexadecimal format
            stringbuffer.append(String.format("%02x", b));
        }
        
        System.out.println(stringbuffer.toString());
        
        }
        
        catch (NoSuchAlgorithmException exception)
        {
            System.out.println(exception);
        }
        
    }
}