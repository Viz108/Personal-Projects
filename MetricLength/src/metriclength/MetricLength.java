/* MetricLength - converts inches to centimeters
Chapter 2 Programming Activity 1 
 */
package metriclength;

public class MetricLength {

    public static void main(String[] args) 
    {
        final double CM_PER_INCH = 2.54;
        double inches = 5.2;
        
        double centimeters = inches * CM_PER_INCH;
        
        System.out.println(inches + " inches are equivalent to " 
                + centimeters + " centimeters.");
    }
    
}
