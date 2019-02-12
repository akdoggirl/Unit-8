public class ClassicCharacters extends VideoGameCharacter
{
    private String catchphrase;
    
    public ClassicCharacters (int num, boolean a, double s, boolean n, String c)
    {
        super(4, true, 6.0, false);
        catchphrase = c;
    }
    public String toString ()
    {
        super.toString();
        String output = "This is an older character";
        return output;
    }
}