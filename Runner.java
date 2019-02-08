public class Runner
{
    public static void main (String [] args)
    {
        Honda a = new Honda(15000, 20000, "blue", true);
        Chevy b = new Chevy(20000, 50000, "red", true);
        Ford c = new Ford(30000, 250, "blue", true);
        Subaru d = new Subaru(12000, 15000, "red", true);
        Jeep e = new Jeep(25000, 500, "green", true);
        
        
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}