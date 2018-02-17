import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
       // use the isprobableprime method. If we use 1, we get a 
       System.out.println(n.isProbablePrime(5) ? "prime" : "not prime");
      // Write your code here.
   }
}
