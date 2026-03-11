public class BarraDiCompletamento {

    private double percentuale;

    public BarraDiCompletamento(double percentualeIniziale) {
        this.percentuale = percentualeIniziale;
    }
    
    public BarraDiCompletamento incrementa(double incremento) {
        this.percentuale += incremento;
        if (this.percentuale > 100.0) {
            this.percentuale = 100.0;
        }
        return this;
    }

    public String toString() {
        return Math.round(this.percentuale) + "%";
    }

    public static void main(String[] args) {
        BarraDiCompletamento barra = new BarraDiCompletamento(0);
        barra.incrementa(20);
        System.out.println(barra.toString());
    }
}