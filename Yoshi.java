public class Yoshi extends ClassicCharacters
{
private String color;

    public Yoshi (int num, boolean a, double s, boolean n, String pT, String c)
    {
        super(3, true, 5.6, true, "Yoshi!");
        color = c;
    }
    String toString ()
    {
        super.toString();
        String output = "Yoshi is a dinosaur-like figure in many Nintendo games";
        return output;
    }
}
