public class Metaknight extends ClassicCharacters
{
private boolean hasSword;

    public Metaknight(int num, boolean a, double s, boolean n, String c, boolean s)
    {
        super(4, false, 4.8, false, "hahaa");
        hasSword = s;
    }
    public String toString ()
    {
        super.toString();
        String output = "Metaknight is one of Kirby's plas in many Kirby games";
        return output;
    }
}
