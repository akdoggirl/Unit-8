public class Parrot extends Birds
{
    public Parrot (double lbs, boolean d, boolean e)
    {
        super(0.125, true, true);
    }
    public String toString ()
    {
        super.toString();
        String output = "This is a parrot";
        return output;
    }
}