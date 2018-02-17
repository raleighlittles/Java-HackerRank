import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        BitSet[] bitsets = new BitSet[3];
        
        bitsets[1] = B1;
        bitsets[2] = B2;
        
        for (int i = 0; i < M; i++)
        {
            String operation = scanner.next();
            int param1 = scanner.nextInt();
            int param2 = scanner.nextInt();
            
            switch (operation)
            {
                case "AND":
                    bitsets[param1].and(bitsets[param2]);
                    break;
                    
                case "OR":
                    bitsets[param1].or(bitsets[param2]);
                    break;
                    
                case "XOR":
                    bitsets[param1].xor(bitsets[param2]);
                    break;
                    
                case "FLIP":
                    bitsets[param1].flip(param2);
                    break;
                
                case "SET":
                    bitsets[param1].set(param2);
            }
            
            System.out.println(Integer.toString(bitsets[1].cardinality()) + " " + Integer.toString(bitsets[2].cardinality()));
        }
        
        
    }
}