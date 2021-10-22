/*Temperature Conversion
Chapter 2 Programming Activity 2
 */
package temperatureconversion;

public class TemperatureConversion 
{

    public static void main(String[] args) 
    {
        int Farenheit = 1;
        
        double Celsius = (Farenheit - 32)*((double)5/9);
        System.out.println("Temperature in Celsius is " + Celsius);
        
        Farenheit = (int)(((double)9/5) * Celsius + 32);
        System.out.println("Temperature in Farenhiet is " + Farenheit);
    }
    
}
