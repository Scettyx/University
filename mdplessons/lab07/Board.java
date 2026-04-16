package lab07;

import java.util.Random;

public class Board {
    private char[][] griglia;
    private Pezzo pezzoCorrente;
    private final int RIGHE = 20;
    private final int COLONNE = 10;
    private Random random;

    public Board() {
        this.griglia = new char[RIGHE][COLONNE];
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                this.griglia[i][j] = ' ';
            }
        }
        this.random = new Random();
        this.generaPezzo();
    }

    public void generaPezzo() {
        int tipo = this.random.nextInt(5);
        switch (tipo) {
            case 0:
                this.pezzoCorrente = new PezzoL();
                break;
            case 1:
                this.pezzoCorrente = new PezzoT();
                break;
            case 2:
                this.pezzoCorrente = new PezzoSerpente();
                break;
            case 3:
                this.pezzoCorrente = new PezzoI();
                break;
            case 4:
                this.pezzoCorrente = new PezzoQuadrato();
                break;
        }

        this.pezzoCorrente.x = COLONNE / 2 - 1;
        this.pezzoCorrente.y = 0;
    }

    private boolean mossaValida(int dx, int dy, char[][] formaDaTestare) {
        if (this.pezzoCorrente == null) {
            return false;
        }

        int nuovaX = this.pezzoCorrente.x + dx;
        int nuovaY = this.pezzoCorrente.y + dy;

        for (int i = 0; i < formaDaTestare.length; i++) {
            for (int j = 0; j < formaDaTestare[i].length; j++) {
                if (formaDaTestare[i][j] == '*') {
                    int boardX = nuovaX + j;
                    int boardY = nuovaY + i;

                    if (boardX < 0 || boardX >= COLONNE || boardY >= RIGHE) {
                        return false;
                    }
                    if (boardY >= 0 && this.griglia[boardY][boardX] == '*') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void muoviSinistra() {
        if (mossaValida(-1, 0, this.pezzoCorrente.forma)) {
            this.pezzoCorrente.left();
        }
    }

    public void muoviDestra() {
        if (mossaValida(1, 0, this.pezzoCorrente.forma)) {
            this.pezzoCorrente.right();
        }
    }

    public void muoviGiu() {
        if (mossaValida(0, 1, this.pezzoCorrente.forma)) {
            this.pezzoCorrente.down();
        } else {
            fissaPezzo();
            generaPezzo();
        }
    }

    public void ruotaPezzo() {
        if (this.pezzoCorrente == null) {
            return;
        }

        char[][] vecchiaForma = this.pezzoCorrente.forma;
        this.pezzoCorrente.rotate();

        if (!mossaValida(0, 0, this.pezzoCorrente.forma)) {
            this.pezzoCorrente.forma = vecchiaForma;
        }
    }

    private void fissaPezzo() {
        for (int i = 0; i < this.pezzoCorrente.forma.length; i++) {
            for (int j = 0; j < this.pezzoCorrente.forma[i].length; j++) {
                if (this.pezzoCorrente.forma[i][j] == '*') {
                    int boardX = this.pezzoCorrente.x + j;
                    int boardY = this.pezzoCorrente.y + i;
                    if (boardY >= 0) {
                        this.griglia[boardY][boardX] = '*';
                    }
                }
            }
        }
    }
}