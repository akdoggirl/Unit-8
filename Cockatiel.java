public class Cockatiel extends Birds
{
    public Cockatiel (double lbs, boolean d, boolean e)
    {
        super(0.033, true, false);
    }
    
    public String toString ()
    {
        super.toString();
        String output = "This is a cockatiel";
        return output;
    }
}