import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        try
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println(z);
        }
        
        
        catch (InputMismatchException | ArithmeticException exception)
        {
            
                //System.out.println(exception);
            if ((exception.getClass().getName()).equals("java.util.InputMismatchException"))
            {
                System.out.println("java.util.InputMismatchException"); // not ideal..
            }
            
            
            else
            {
                System.out.println(exception);
            }
        }
        
    }
}