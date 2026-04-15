package lab07;

public class PezzoSerpente extends Pezzo {
    public PezzoSerpente() {
        this.forma = new char[][] {
            {' ', ' ', ' '},
            {' ', '*', '*'},
            {'*', '*', ' '}
        };
    }
}