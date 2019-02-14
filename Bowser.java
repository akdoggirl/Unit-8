public class Bowser extends ClassicCharacters 
{
private int numberOfSpikes;

    public Bowser (int num, boolean a, double s, boolean n, String pT, int spikes)
    {
        super(4, true, 4.0, true, "Bwahahaha");\
        numberOfSpikes = spikes;
    }
    String toString ()
    {
        super.toString();
        String output = "Bowser is the main villain in the Mario world";
    }
}
