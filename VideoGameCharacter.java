public class VideoGameCharacter
{
    private int numLimbs;
    private boolean isItAnAnimal;
    private double size;
    private boolean isItNew;
    
    public VideoGameCharacter (int num, boolean a, double s, boolean n)
    {
        numLimbs = num;
        isItAnAnimal = a;
        size = s;
        isItNew = n;
    }
    
    public String toString ()
    {
        String output = new String();
        
        output = ("How many arms and/or legs does this character have?" + numLimbs +
        "Is this character an animal?" + isItAnAnimal +
        "How tall is this character?" + size + 
        "Was this character made recently?" + isItNew);
        
        return output;
    }
    
    public void Jump ()
    {
        // character jumps
    }
    
    public void defeatBadGuys ()
    {
        // character defeats bad guys
    }
}