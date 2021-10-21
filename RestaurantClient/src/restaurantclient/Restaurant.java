package restaurantclient;

/*
 * @author Vishal
 */
public class Restaurant extends Store
{
    int peopleServed;
    double averagePrice;
    
    /*Overloaded Constructor*/
    
    public Restaurant(String newName, int newPeopleServed, double newAveragePrice)
    {
        super(newName);
        setPeopleServed(newPeopleServed);
        setAveragePrice(newAveragePrice);
    }
    
    /*Accessor Methods*/
     
    public int getPeopleServed()
    {
        return peopleServed;
    }
    
    public double getAveragePrice()
    {
        return averagePrice;
    }
    
    /*Mutator Methods*/
    
    public void setPeopleServed(int newPeopleServed)
    {
        if(newPeopleServed < 0)
        {
            System.out.println("Number of people served cannot be less than zero.");
        }
        else
        {
            peopleServed = newPeopleServed;
        }
    }
    
    public void setAveragePrice(double newAveragePrice)
    {
        if(newAveragePrice < 0.0)
        {
            System.out.println("Average price cannot be less than zero.");
        }
        else
        {
            averagePrice = newAveragePrice;
        }
    }
    
    /*toString and equals methods*/
    
    public String toString()
    {
        return "The restaurant name is " + name + ", it has served " + peopleServed
                + " people, and the average price is " + averagePrice + ".";
    }
    
    public boolean equals(Restaurant other)
    {
        if(name.equals(other.name) && peopleServed == other.peopleServed && 
                Math.abs(averagePrice - other.averagePrice) < 0.01)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /*averageTaxes method*/
    
    public double averageTaxes()
    {
        return (peopleServed * averagePrice) * TAX_RATE;
    }
}

