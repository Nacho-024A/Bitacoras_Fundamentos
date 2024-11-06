public class Main {
    public static void main(String[] args) {

        int p1=20;
        int p2=10;

        System.out.println("El resultado de la suma " + p1 + " + " + p2 + " es igual a: " + sumar(p1,p2));

        System.out.println("El resultado de la resta " + p1 + " - " + p2 + " es igual a: " + restar(p1,p2));

        System.out.println("El resultado de la multiplicación " + p1 + " * " + p2 + " es igual a: " + multiplicar(p1,p2));

        System.out.println("El resultado de la divicion " + p1 + " / " + p2 + " es igual a: " + dividir(p1,p2));
    }

    public static int sumar(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static int restar(int a, int b) {
        int c;
        c = a - b;
        return c;
    }

    public static int multiplicar(int a, int b) {
        int c;
        c = a * b;
        return c;
    }

    public static int dividir(int a, int b) {
        int c=0;
        if (b!=0){
            c = a / b;

        }else System.out.println("Division por 0 no permitida");
        return c;
    }
}
