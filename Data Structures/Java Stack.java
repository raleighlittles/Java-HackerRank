import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
        
       
      while (sc.hasNext()) {
         String input=sc.next();
            // Main idea: iterate through the string, pushing each opening set of parenthesis to the stack. When a closing parenthesis is found, pop that parenthesis from the stack. The string is only balanced if the stack is empty at the end
          
          // make 3 stacks, one for each of the parenthesis types (square, curly, regular)
          
          Stack<Character> stack = new Stack();
          
         
      for (int i = 0; i < input.length(); i++)
      {
          if (stack.isEmpty() == false)
          {
              switch(input.charAt(i))
              {
                  case '}':
                      if (stack.peek() == '{')
                      {
                          stack.pop();
                      }
                      break;
                      
                  case ']': 
                      if (stack.peek() == '[')
                      {
                          stack.pop();
                      }
                      
                      break;
                      
                  case ')': 
                      if (stack.peek() == '(')
                      {
                          stack.pop();
                      }
                      break;
                      
                  default:
                      stack.push(input.charAt(i));
              }
          }
          
          else
          {
              stack.push(input.charAt(i));
              
          }
  
          
      }
       System.out.println(stack.isEmpty());
          
      
          
      }
       
   }
    
}
