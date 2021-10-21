package studentclient;

/**
 *
 * @author Vishal
 */
public class Student 
{
    String name;
    String ssn;
    double gpa;
    
    /*Overloaded Constructor*/
    
    public Student(String newName, String newSsn, double newGpa)
    {
        setName(newName);
        setSsn(newSsn);
        setGpa(newGpa);
    }
    
    /*Accesor Methods*/
    public String getName()
    {
        return name;
    }
    
    public String getSsn()
    {
        return ssn;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    /*Mutator Methods*/
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setSsn(String newSsn)
    {
        ssn = newSsn;
    }
    
    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    }
    
    /*toString and equals methods*/
    public String toString()
    {
        return "Student name is " + name + ", their social security number is "
                + ssn + ", and their GPA is " + gpa + ".";
    }
    
    public boolean equals(Object other)
    {
        if(!( other instanceof Student))
        {
            return false;
        }
        else
        {
            Student objOther = (Student)other;
            if(name.equals(objOther.name) && ssn.equals(objOther.ssn) 
                    && (Math.abs(gpa - objOther.gpa) < 0.01))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
