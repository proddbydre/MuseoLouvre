package louvre;

public class Turisti extends Thread
{
    private int matricola;
    private Monitor monitor;

    public Turisti(int matricola, Monitor monitor)
    {
        this.matricola = matricola;
        this.monitor = monitor;
    }

    
    public int getMatricola() 
    {
        return matricola;
    }
    public void setMatricola(int matricola) 
    {
        this.matricola = matricola;
    }

    @Override
    public void run() 
    {

        // Entra nel giardino
        try
        {
            monitor.entra(matricola);

            //Aspetta un tempo compreso tra i 2 secondi e i 5 secondi
            int tempo = 2000  + (int) Math.random() * 5000;
            sleep(tempo);
        

            // Esce dal giardino
            monitor.esci(matricola);

        }catch (InterruptedException e){

            e.printStackTrace();
        }
    }
}
