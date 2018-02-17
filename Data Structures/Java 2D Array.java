import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (i > 3 || j > 3)
                {
                    continue;
                }
                // parenthesis denotes groups of the same row!
                current_sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) + (arr[i+1][j+1]) + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                
                if (current_sum > maximum_sum) maximum_sum = current_sum;
            }
        }
        
        System.out.println(maximum_sum);
    }
}
