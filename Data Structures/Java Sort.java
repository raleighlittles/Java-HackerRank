import java.util.*;
import java.lang.*;
// use the comparator interface technique: https://stackoverflow.com/questions/21626439/how-to-implement-the-java-comparable-interface
@SuppressWarnings("unsafe")
class Student implements Comparable
{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   
   public int compareTo(Object object)
   {
   Student s = (Student)object;
   // obey the matching requirements given in the problem
    if (cgpa == s.cgpa)
    {
        if (fname == s.fname)
        {
            return (id - s.id);
        }
        
        else
        {
            return fname.compareTo(s.fname);
        }
    }
    
    else
    {
        int result = (s.cgpa - cgpa > 0) ? 1 : -1;
        return result;
    }
    
   }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       
       Collections.sort(studentList);
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
