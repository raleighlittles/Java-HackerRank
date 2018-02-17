class Printer
{
   //Write your code here
    
    public static <E> void printArray(E[] inputArray)
    {
        for (E element : inputArray)
        {
            System.out.println(element);
        }
    }
 
}
