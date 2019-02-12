public class CookingMama extends NewCharacters 
{
    private boolean isSheMadAtYou;
    
    public CookingMama(int num, boolean a, double s, boolean n, boolean i)
    {
        super(4, false, 5.2, true, "angry");
        isSheMadAtYou = i;
    } 
    
    public String toString ()
    {
        super.toString();
        
        String output = "This character is from a cooking video game called CookingMama";
        
        return output;
    }
}