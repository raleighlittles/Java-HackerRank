import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++)
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] arr = new int[n];
            boolean[] win = new boolean[n];
            for (int j=0; j<n; j++)
            {
                arr[j] = scan.nextInt();
            }
            
            for (int j=n-1; j>=0; j--)
            {
                if (arr[j]==0 && (j+Math.max(1,m) >=n || win[j+1] || win[j+m]))
                {
                    win[j] = true;
                    int k = j+1;
                    while (k < n-1 && arr[k]==0 && win[k] == false)
                    {
                        win[k] = true;
                        k++;
                    }
                }
            }
            
            System.out.println(win[0]?"YES":"NO");
        }
        scan.close();
        
    }
    
}