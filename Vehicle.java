public class Vehicle
{
    private int cost;
    private double miles;
    private String color;
    private boolean doesItRun;
    
    public Vehicle (int c, double m, String color, boolean r)
    {
        cost = c;
        miles = m;
        color = color;
        doesItRun = r;
    }
    
    public String toString()
    {
        String output = new String();
        output = ("The number of miles that the vehicle has is:" + cost +
        ". The miles that the vehicle has is: " + miles + ". The vehicle is:" + color +
        ". Does the vehicle run?" + doesItRun);
        
        return output;
    }
}