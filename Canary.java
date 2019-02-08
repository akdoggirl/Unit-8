public class Canary extends Birds
{
    public Canary (double lbs, boolean d, boolean e)
    {
        super(0.001, true, false);
    }
    public String toString ()
    {
        super.toString();
        String output = "This is a canary";
        return output;
    }
}