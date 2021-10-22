package restaurantclient;
import java.text.DecimalFormat;
/*
 * @author Vishal
 */
public class RestaurantClient 
{
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Restaurant r1 = new Restaurant("Chili's", 1000, 20.00);
        Restaurant r2 = new Restaurant("Krispy Kreme", 500, 5.00);
        
        System.out.println(r1);
        System.out.println(r2);
        
        r2.setPeopleServed(r1.getPeopleServed());
        r2.setAveragePrice(r1.getAveragePrice());
        
        if(r1.equals(r2))
        {
            System.out.println("The two restaurants are equal.");
        }
        else
        {
            System.out.println("The two restaurants are not equal.");
        }
        
        r2.setName(r1.getName());
        
        if(r1.equals(r2))
        {
            System.out.println("The two restaurants are equal.");
        }
        else
        {
            System.out.println("The two restaurants are not equal.");
        }
        
        DecimalFormat taxes = new DecimalFormat("$0.00");
        System.out.println(taxes.format(r1.averageTaxes()));
    }
    
}
