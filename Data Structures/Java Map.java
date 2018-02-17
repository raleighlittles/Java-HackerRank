//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
       
       HashMap<String, Integer> phonebook = new HashMap<String, Integer>(n);
       
       // read in all the names and phones number
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
          
          phonebook.put(name, phone);
      }
       
       // this section is where the queries of the names show up
      while(in.hasNext())
      {
         String s=in.nextLine();
          

       Integer phonenumber = phonebook.get(s);

          
         if (phonenumber == null)
         {
             System.out.println("Not found");
         }
         
         else{
             System.out.println(s + "=" + Integer.toString(phonenumber));
         }
          
      }
   }
}
