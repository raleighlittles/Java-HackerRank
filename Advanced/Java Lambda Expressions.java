   // Write your code here
   public PerformOperation is_odd()
   {
       return n-> (n % 2 > 0);
   }

    public PerformOperation is_prime()
    {
        return n-> IntStream.range(2, (int) Math.sqrt(n)).noneMatch(i -> n%i  == 0);
    }

    public PerformOperation is_palindrome()
    {
        return n ->  Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString());
    }