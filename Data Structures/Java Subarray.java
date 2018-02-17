import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String[] tokens = scanner.nextLine().split(" ");
        
        // ugly ass way of parsing a space-separated string of integers into an integer array
        // https://stackoverflow.com/questions/26313497/whats-the-simplest-way-to-convert-a-string-array-to-an-int-array-using-java-8
        int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        
        int negative_arrays = 0;
        for (int i = 0; i < A.length; i++)
        {
            int sum = 0;
            for (int j = i; j < A.length; j++)
            {
               sum += A[j];
                if (sum < 0)
                {
                    negative_arrays++;
                }
                
            }
        }
        
        System.out.println(negative_arrays);
        
        
    }
}