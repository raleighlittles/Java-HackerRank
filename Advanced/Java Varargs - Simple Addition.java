
class Add {
     void add(int ...a)
    {
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++)
        {
            int current = a[i];
            sum += current;
            System.out.print(Integer.toString(a[i]) + "+");
        }
         int last = a[a.length - 1];
         sum += last;
         System.out.print(Integer.toString(last) + "=" + Integer.toString(sum));
         System.out.print("\n");
        
         
    }
}