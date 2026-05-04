package tema5;

public class Recursiva3 {
    public static void main(String[] args) {
        fibonacci(0, 0, 1);
    }

    public static void fibonacci(int i, int n, int n2) {
        if (i == 6) {
        
        } else {
            fibonacci(i + 1, n + n2, n);
            System.out.println(n + " ");
        }
    }
}
