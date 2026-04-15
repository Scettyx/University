package lab07;

public abstract class Pezzo {
    protected int x;
    protected int y;
    protected char[][] forma;

    public void left() {
        this.x--;
    }

    public void right() {
        this.x++;
    }

    public void down() {
        this.y++;
    }

    public void rotate() {
        if (this.forma == null || this.forma.length == 0) {
            return;
        }

        int n = this.forma.length;
        char[][] nuovaForma = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; j++) {
                nuovaForma[j][n-1-i] = this.forma[i][j];
            }
        }
        this.forma = nuovaForma;
    }
}