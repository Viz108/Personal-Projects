
package aptest;

public class APTest 
{

    
        //Question 1
        //a
        public void updateRecentlyUsedApps()
        {
            for(App current : allApps)
            {
                if(current.getUsed())
                {
                    current.setNumTimes(current.getNumTimes() + 1);
                }
            }
        }
        
        //b
        public ArrayList<App> updateAppStatus()
        {
            ArrayList<App> output = new ArrayList<App>();
            for(App current: allApps)
            {
                if(current.getNumTimes() > 5)
                {
                    current.setRemovable(false);
                }
                else if(current.getNumTimes() <= 5)
                {
                    current.setRemovable(true);
                    output.add(current);
                }
            }
            return output;
        }
        
        //c
        /*
        Method Header: public App getMostExpensiveApp()
        getMostExpensiveApp would be a method included in the phone class. The first 
        most important change needed for the method to function would be the addition
        of a private double price variable in the App class, along with an accessor method,
        public int getPrice(),but no mutator method. 
        The value of price would be set in the app constructor, with
        App(double newPrice) setting price to new price and App() setting price to 0.0. 
        getMostExpensive app would use a for loop to iterate through each App in the 
        allApps ArrayList, testing each App's price value with the getPrice method and
        finding the one with the greatest value, returning that App.
        */
    
        
        //Question 2
        //a
        public static int bagApples(double targetWeight, double allowedVariation)
        {
            double currentWeight = 0.0;
            int numApples = 0;
            while(currentWeight <= (targetWeight - allowedVariation))
            {
                currentWeight += getApple();
                numApples++;
            }
            return numApples;
        }
        
        //b
        /*
        The first change that would have to be made would be in the bagApples method. The
        parameter allowedVariation is removed.
        Then, the weight returned by the first call to getApple is stored in a double variable, 
        firstWeight. firstWeight is added to currentWeight, and numApples starts at 1.
        firstWeight is then multiplied by 0.2 so that it is 20% of itself. It then takes
        the place of allowedVariation in the check statement of the while loop, 
        so that the while loop is now written as while(currentWeight <= (targetWeight - firstWeight).
        */
    
}
