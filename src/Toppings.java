/**
 * Created by Chad Reddick on 9/24/2015.
 */


public class Toppings
{
    private String Name;
    private double Price;
    /*
    Constructor
    @param N : Name of Topping
    @param P : Price of Topping
     */
    public Toppings(String N, double P)
    {
        Name = N;
        Price = P;
    }

    public String getName()
    {
        return Name;
    }

    public double getPrice()
    {
        return Price;
    }

}
