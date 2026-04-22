package lab08;

public class MainTest {
    public static void main(String[] args) {
        Parlante[] a = new Parlante[2];
        a[0] = new Persona("Cosmin");
        a[1] = new AI("Kimi");

        for (int i = 0; i < a.length; i++) {
            a[i].parla();
        }
    }
    
}
