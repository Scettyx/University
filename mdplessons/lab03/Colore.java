package lab03;

public class Colore {
    @SuppressWarnings("unused")
    private int r;

    @SuppressWarnings("unused")
    private int g;

    @SuppressWarnings("unused")
    private int b;

    public static final Colore BIANCO = new Colore(255, 255, 255);
    public static final Colore NERO = new Colore(0, 0, 0);
    
    public Colore(int r, int g, int b) {
        this.r = Math.max(0, Math.min(255, r));
        this.g = Math.max(0, Math.min(255, g));
        this.b = Math.max(0, Math.min(255, b));
    }
}