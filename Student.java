
public class Student implements Musician, Athlete, Mathematician, Artist
{
    private String gender;
    private int age;
    private boolean fullTime;
    private int gradeLevel;
    
    public Student (String g, int a, boolean fT, int gL)
    {
        gender = g;
        age = a;
        fullTime = fT;
        gradeLevel = gL;
    }
    public void setgender (String newgender)
    {
        gender = newgender;
    }
    public String getgender ()
    {
        return gender;
    }
    public void setage (int newage)
    {
        age = newage;
    }
    public int getage ()
    {
        return age;
    }
    public void setfullTime (boolean newfullTime)
    {
        fullTime = newfullTime;
    }
    public boolean getfullTime ()
    {
        return fullTime;
    }
    public void setgradeLevel (int newgradeLevel)
    {
        gradeLevel = newgradeLevel;
    }
    public int getgradeLevel ()
    {
        return gradeLevel;
    }
    public void tuneInstrument ()
    {
        // student tunes their instrument
    }
    public void playScale ()
    {
        // student plays a scale
    }
    public void carryInstrument ()
    {
        // student can carry their instrument
    }
    public void drinkLotsOfWater ()
    {
        // student drinks lots of water 
    }
    public void maintainGrades ()
    {
        // student keeps a high GPA in order to play their sports
    }
    public void beATeamPlayer ()
    {
        // student works well with others
    }
    public void buyCalculator ()
    {
        // purchase expensive calculator
    }
    public void buyProtractor ()
    {
        // buy a nice calculator
    }
    public void graphStuff ()
    {
        // graph some cool stuff
    }
    public void memorizeFormulas ()
    {
        // memorize some formulas
    }
    public void buySupplies ()
    {
        // buy art supplies
    }
    public void bePoor()
    {
        // have little money, because art doesn't make much
    }
    public void createPortfolio()
    {
        // compile the best work
    }
    public void goToArtShows ()
    {
        // visit museums and galleries
    }
    public void createSelfPortrait ()
    {
        // create a picture, painting, or sculpture of themselves
    }
    public void collectPaycheck ()
    {
        // get your paycheck
    }
    public void talkToBoss ()
    {
        // see what tasks need to be done
    }
    public void workHard ()
    {
        // do your best work
    }
    public void getAlongWithCoworkers ()
    {
        // be a team player
    }
    public void helpCustomers ()
    {
        // help customers with their needs
    }
    public void listenToBoss ()
    {
        // absorb the words your boss says
    }
    
    public String toString ()
    {
        String output = "The student's gender is:" + gender +
        "The student is:" + age + "years old" + "Is the student a full-time student?" +
        fullTime + "What grade is the student in?";
        
        return output;
    }
}