package lab08;

public class MainFigure {
    public static void main(String[] args) {
        Figura[] figure = new Figura[2];

        figure[0] = new Cerchio(7.5);
        figure[1] = new Rettangolo(4.0, 5.0);

        for (Figura f : figure) {
            System.out.println(f.area());
            System.out.println(f.perimetro());
        }
    }
}