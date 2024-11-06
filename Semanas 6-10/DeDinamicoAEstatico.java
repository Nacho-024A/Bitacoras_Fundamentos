import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> CrearArreglo(int n) {
        ArrayList<Integer> DinamicoArr = new ArrayList<>();

        // Llenar el arreglo dinámico con valores aleatorios entre 0 y 99
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            DinamicoArr.add(random.nextInt(100));
        }

        return DinamicoArr;
    }

    public static void ConvEstatico(ArrayList<Integer> DinamicoArr) {
        // Convertir el arreglo dinámico a un arreglo estático
        int[] permanentArray = new int[DinamicoArr.size()];
        for (int i = 0; i < DinamicoArr.size(); i++) {
            permanentArray[i] = DinamicoArr.get(i);
        }

        // Imprimir el arreglo estático
        System.out.print("Arreglo estático: ");
        for (int num : permanentArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Crear un arreglo dinámico de tamaño n
        int n = 10;
        ArrayList<Integer> DinamicoArr = CrearArreglo(n);

        // Convertir el arreglo dinámico a un arreglo estático
        ConvEstatico(DinamicoArr);
    }
}
