public class Main {
    public static void stampa(Figura f) {
        System.out.println(f.area());
    }
    public static void main(String[] args) {
        Quadrato f = new Quadrato("Quadrato", 4);
        Triangolo t = new Triangolo("Triangolo", 3, 2);
        
        stampa(f);
        stampa(t);

        Figura[] a = new Figura[2];
        a[0] = f;
        a[1] = t;

        for ( int i = 0; i < 2; i++) {
            System.out.println(a[i].area());
        }
    }
}