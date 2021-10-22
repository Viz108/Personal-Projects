package coins;

/*
 @author Vishal
 */

    import java.util.Scanner;
    import java.text.DecimalFormat; 

public class Coins 
    {
    public static void main(String[] args) 
    {
        int nickels;
        int dimes;
        int quarters; 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Number of nickles: ");
        nickels = scan.nextInt();
        System.out.print("Number of dimes: ");
        dimes = scan.nextInt();
        System.out.print("Number of quarters ");
        quarters = scan.nextInt();
        
        double totalValue = (0.05 * nickels) + (0.10 * dimes) + (0.25 * quarters);
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");
        System.out.println("The total value of the coins is "
                            + moneyFormat.format(totalValue) + ".");
        
        
    }
    
}
