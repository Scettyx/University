package lab10;

public class CronometroPreciso extends Cronometro {
    private int millisecondi;

    public CronometroPreciso(int maxSecondi) {
        super(maxSecondi);
        this.millisecondi = 0;
    }

    @Override
    public void tick() {
        if (this.secondi >= maxSecondi) {
            return;
        }

        millisecondi += 100;
        if (millisecondi >= 1000) {
            super.tick();
            millisecondi = 0;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ": " + millisecondi + "ms";
    }
}