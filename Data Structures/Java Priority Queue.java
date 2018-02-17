import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
class Student
{
    int identification;
    String student_name;
    double cumulative_gpa;
    public Student(int id, String name, double cgpa)
    {
        identification = id;
        student_name = name;
        cumulative_gpa = cgpa;
    }
    
    int getID()
    {
        return identification;
    }
    
    String getName()
    {
        return student_name;
    }
    
    double getCGPA()
    {
        return cumulative_gpa;
    }
}

class Priorities {
    public List <Student> getStudents(List <String> events)
    {
        // sort on GPA first, then name, then ID #
        PriorityQueue <Student> students_queue = new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
                                                                     
       List<Student> students = new ArrayList<Student>();
       
       for (String event: events)
       {
           Scanner scanner = new Scanner(event);
           String e = scanner.next();
           if (e.equals("ENTER"))
           {
               String name = scanner.next();
               float cgpa = scanner.nextFloat();
               int id = scanner.nextInt();
               
               Student new_student = new Student(id, name, cgpa);
               students_queue.add(new_student);
               
           }
           
          
           else if (e.equals("SERVED"))
           {
               Student first_student = students_queue.poll();
               scanner.close();
           }
       }
        
        Student first_student = students_queue.poll();
        if (first_student == null)
        {
            return students;
        }
        
        else
        {
            while (first_student != null)
            {
                students.add(first_student);
                first_student = students_queue.poll();
            }
            
            return students;
        }
                                                                     
       
                                                                    
                                                                     
                                                                     
    }
}