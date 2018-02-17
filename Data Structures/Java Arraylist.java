import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Idea: Use a '2-dimensional' array list.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();
        
        for (int i = 0; i < n; i++)
        {
            int d = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
        
        
        for (int j = 0; j < d; j++)
        {
            row.add(scanner.nextInt());
        }
        
            
        table.add(row);    
            
        }
        
        int q = scanner.nextInt();
        
        for (int i = 0; i < q; i++)
        {
            int col = scanner.nextInt();
            int row = scanner.nextInt();
            
            try
            {
                System.out.println(table.get(col-1).get(row-1));
                
            }
            
            catch(IndexOutOfBoundsException exception)
            {
                String err = "ERROR!";
                System.out.println(err);
            }
        }
        
        
    }
}