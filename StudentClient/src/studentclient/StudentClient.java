package studentclient;

/**
 * @author Vishal
 */
public class StudentClient 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Student s1, s2;
       s1 = new Student("Alice", "9999", 4.0);
       s2 = new Student("Bob", "1111", 3.5);
       
       System.out.println("Student 1's name is " + s1.getName() + 
               ", her social security number is " + s1.getSsn() +
               ", and her GPA is " + s1.getGpa());
       System.out.println(s2.toString());
       
       if(s1.equals(s2))
       {
           System.out.println("Student 1 is equal to student 2.");
       }
       else
       {
           System.out.println("Student 1 is not equal to student 2.");
       }
       
       s2.setName(s1.getName());
       s2.setSsn(s1.getSsn());
       s2.setGpa(s1.getGpa());
       
       if(s1.equals(s2))
       {
           System.out.println("Student 1 is equal to student 2.");
       }
       else
       {
           System.out.println("Student 1 is not equal to student 2.");
       }
       
        
    }
    
}
