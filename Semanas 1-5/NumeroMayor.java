public class Main {
    public static void main(String[] args) {

        Max(6,2,10);
    }
    public static int Max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
