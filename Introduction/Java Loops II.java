import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // # of testcases
        for(int i = 0; i < t ; i++ )
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String result = "";
            
         for (int j = 0; j < n; j++)
        {
            // notice that 2^0 + 2^1 + ... + 2^n = 2^(n+1) - 1
            String new_result = "";
            new_result = Integer.toString((int)(a + b*(Math.pow(2, j+1) - 1)));
            new_result = new_result + " ";
            result.concat(new_result);
             System.out.print(new_result);
        }
            System.out.println(result);
            
        }
        
        in.close();
    }
}
