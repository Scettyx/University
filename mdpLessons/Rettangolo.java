public class Rettangolo {

    private int x;
    private int y;
    private int larghezza;
    private int altezza;
    private Colore colore;

    public Rettangolo(int x, int y, int larghezza, int altezza) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.colore = Colore.NERO;
    }

    public void Trasla(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public Colore getColore() {
        return this.colore;
    }

    @Override
    public String toString() {
        int x2 = this.x + this.larghezza;
        int y2 = this.y + this.altezza;
        return "(%s, %s) -> (%s, %s)".formatted(this.x, this.y, x2, y2);
    }
    
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(0, 0, 10, 20);
        r.Trasla(10, 5);
        System.out.println(r.toString());
    }
}