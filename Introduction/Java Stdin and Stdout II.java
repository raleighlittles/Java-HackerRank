import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        
        double d = scan.nextDouble();
        scan.nextLine(); // needed to clear the input buffer. see explanation in problem!
        String s = scan.nextLine();
        
       
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
