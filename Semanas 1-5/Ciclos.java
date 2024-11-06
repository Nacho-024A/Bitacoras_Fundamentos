
public class Main {
    public static void main(String[] args) {

        ParesFor();
        ParesWhile();

    }
    //Usando while
    public static void ParesWhile() {
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }

    //Usando for
    public static void ParesFor() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
