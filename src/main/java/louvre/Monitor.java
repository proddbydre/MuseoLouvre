package louvre;

public class Monitor 
{
    private int ingressoMax = 5;
    
    public synchronized void entra(int matricola)
    {
        while(ingressoMax==0)
        {
            System.out.println("Il museo è pieno. Il visitatore n. " + matricola + " attende il suo turno");
            try 
            {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
            
        if(ingressoMax>0)
        {
            ingressoMax--;
                            
        }
        
        System.out.println("Il visitatore n. " + matricola + " entra dall'ingresso");
    }

    public synchronized void esci(int matricola)
    {   
        ingressoMax++;
        System.out.println("Il visitatore n. " + matricola + " esce dall'uscita");
        notify();
    }

}
