package lab1;

public class Multiples {
    public static void main(String[] args) {
    }
    public static int multiples(int n, int a, int b) {
        int i = 1;
        int j = 0;
        for (i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                j++;
            }
        }
        return j;
    }
}
