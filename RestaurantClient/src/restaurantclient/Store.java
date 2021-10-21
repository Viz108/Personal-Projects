package restaurantclient;

/*
 * @author Vishal
 */
public class Store 
{
    String name;
    final double TAX_RATE = 0.0725;
    
    /*Overloaded Constructor*/
    
    public Store(String newName)
    {
        setName(newName);
    }
    
    /*Accessor methods*/
    
    public String getName()
    {
        return name;
    }
    
    /*Mutator methods*/
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    /*toString and equals methods*/
    
    public String toString()
    {
        return "The name of the store is " + name + " and the tax rate is" + TAX_RATE 
                + ".";
    }
    
    public boolean equals(Store other)
    {
        if((name.equals(other.name)) && (Math.abs(TAX_RATE - other.TAX_RATE)) < 0.001)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
