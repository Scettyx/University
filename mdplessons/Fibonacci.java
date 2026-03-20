public class Fibonacci {

    public static void fibonacci (int a, int b, int N) {
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < N; i++) {
            int newValue = a + b;
            System.out.println(newValue);

            a = b;
            b = newValue;
        }
    }

    public static void main(String[] args) {
        fibonacci(2, 3, 6);
    }
}
