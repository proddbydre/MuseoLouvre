package louvre;

public class Main 
{
    public static void main(String[] args) 
    {
       Monitor monitor = new Monitor();

       for(int i=1; i<=7; i++)
        {
            Turisti v = new Turisti(i, monitor);
            v.start();
        }
    }
}