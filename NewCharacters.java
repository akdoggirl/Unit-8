public class NewCharacters extends VideoGameCharacter
{
    private String personalityType;
    
    public NewCharacters (int num, boolean a, double s, boolean n, String pT)
    {
        super(4, false, 5.5, true);
        personalityType = pT;
    }
    
    public String toString ()
    {
        super.toString();
        
        String output = "These characters are newer";
        
        return output;
    }
}