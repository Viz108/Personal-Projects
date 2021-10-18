package addlinenumbers;
import java.util.Scanner;
import java.io.*;

/*
 * @author Vishal
 */
public class AddLineNumbers 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String text;
        int lineNum = 0;
        
        try
        {
            Scanner scan = new Scanner(new File("dataInput.txt"));
            FileOutputStream fos = new FileOutputStream("dataOutput.txt", false);
            PrintWriter printer = new PrintWriter(fos);
            
            while(scan.hasNext())
            {
                lineNum++;
                text = lineNum + scan.nextLine();
                printer.println(text);
            }
            
            printer.close();
            System.out.println("Output printed to dataOutput.txt.");
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.\n" + 
                    "Output from getMessage: " + "\n" + fnfe.getMessage() + "\n" +
                    "Output from toString: " + "\n" + fnfe.toString() + "\n" +
                    "Output from printStackTracer: ");
            fnfe.printStackTrace();
        }
        catch(IOException ioe)
        {
            System.out.println("IO exception.\n" + 
                    "Output from getMessage: " + "\n" + ioe.getMessage() + "\n" +
                    "Output from toString: " + "\n" + ioe.toString() + "\n" +
                    "Output from printStackTracer: ");
            ioe.printStackTrace();
        }
       
                
    }
    
}
