public class Mario extends ClassicCharacters
{
    private int numberOfMushroomsSquished;
    
    public Mario (int num, boolean a, double s, boolean n, String c, int m)
    {
        super(4, false, 5.1, false, "Let's-a go!");
        numberOfMushroomsSquished = m;
    }
    
    public String toString ()
    {
        super.toString();
        
        String output = "Mario is one of the most well-known video game characters ever";
        
        return output;
    }
}
