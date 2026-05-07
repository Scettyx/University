package lab10;

public class Cronometro {
    protected int secondi;
    protected int maxSecondi;

    public Cronometro(int maxSecondi) {
        this.maxSecondi = maxSecondi;
        this.secondi = 0;
    }

    public void tick() {
        if (secondi < maxSecondi) {
            secondi++;
        }
    }
    
    @Override
    public String toString() {
        return String.format("[%02d/02d]", secondi, maxSecondi);
    }
}