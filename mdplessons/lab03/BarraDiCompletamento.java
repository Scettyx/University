package lab03;

public class BarraDiCompletamento {

    private double percentuale;

    public BarraDiCompletamento(double percentualeIniziale) {
        percentuale = percentualeIniziale;
    }
    
    public BarraDiCompletamento incrementa(double incremento) {
        percentuale += incremento;
        if (percentuale > 100.0) {
            percentuale = 100.0;
        }
        return this;
    }

    public String toString() {
        return Math.round(this.percentuale) + "%";
    }

    public static void main(String[] args) {
        BarraDiCompletamento barra = new BarraDiCompletamento(0);
        barra.incrementa(20).incrementa(10).incrementa(5);
        System.out.println(barra.toString());
    }
}