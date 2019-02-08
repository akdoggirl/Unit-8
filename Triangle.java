public class Triangle extends TwoDShape
{
    private boolean equalSides;
    public Triangle (int s, boolean a, boolean m, boolean e)
    {
        super(3, false, false);
        equalSides = e;
    }
}