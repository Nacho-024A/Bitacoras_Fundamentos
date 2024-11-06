import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un string: ");
        String Input = scanner.nextLine();
        System.out.println("El string ingresado al revés es: " + Reverso(Input));
    }

    private static String Reverso(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
