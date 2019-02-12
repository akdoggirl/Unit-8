public class Steve extends NewCharacters
{
    private int numberOfJumps;
    
    public Steve (int num, boolean a, double s, boolean n, String pT, int j)
    {
        super(4, false, 5.4, true, "boring");
        numberOfJumps = j;
    }
    
    public String toString ()
    {
        super.toString();
        
        String output = "Steve is the character you are on 'Minecraft'";
        
        return output;
    }
}