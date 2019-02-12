public class Sunflower extends NewCharacters
{
    private int amountOfLightProduced;
    
    public Sunflower (int num, boolean a, double s, boolean n, String pT, int l)
    {
        super(0, false, 3.0, true, "happy");
        amountOfLightProduced = l;
    }
    
    public String toString ()
    {
        super.toString();
        
        String output = "This sunflower is from the game 'Plants vs Zombies'";
        
        return output;
    }
}