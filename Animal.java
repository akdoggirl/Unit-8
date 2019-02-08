public class Animal
{
    private double lbsOfFoodEatenPerDay;
    private boolean areAnyDomesticated;
    private boolean areAnyEndangered;
    private boolean isHungry;
    
    public Animal (double lbs, boolean d, boolean e)
    {
        lbsOfFoodEatenPerDay = lbs;
        areAnyDomesticated = d;
        areAnyEndangered = e;
    }
    
    public String toString ()
    {
        String output = new String();
        
        output = ("How many pounds of food does this animal usually eat?" + lbsOfFoodEatenPerDay +
        "Are any animals of this type domesticated?" + areAnyDomesticated + 
        "Are any animals of this type endangered?" + areAnyEndangered);
        
        return output;
    }
    
    public String isHungry (boolean h)
    {
      String output = new String();
       if(isHungry == false)
       {
        output =  ("False");
       }
      else
      {
          output = ("True");
      }
      return output;
    }
}