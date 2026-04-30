package lab09;

public class CollaudoMazzo {
    public static void main(String[] args) {
        
        MazzoDiCarte mazzo = new MazzoDiCarte();

        mazzo.mescola();

        for (Carta c : mazzo) {
            System.out.println(c);
        }
    }
}