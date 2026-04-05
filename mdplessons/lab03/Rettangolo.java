package lab03;

public class Rettangolo {
    private int x, y, larghezza, altezza;
    private Colore colore;

    public Rettangolo(int x, int y, int larghezza, int altezza) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
        colore = Colore.NERO;
    }

    public void trasla(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public Colore getColore() {
        return colore;
    }

    @Override
    public String toString() {
        int x2 = x + larghezza;
        int y2 = y + altezza;
        return "(%s, %s) -> (%s, %s)".formatted(x, y, x2, y2);
    }
    
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(0, 0, 10, 20);
        r.trasla(10, 5);
        System.out.println(r.toString());
    }
}