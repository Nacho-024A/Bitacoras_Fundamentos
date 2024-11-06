public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Imprimir(arr);
        arr = Invertir(arr);
        Imprimir(arr);
    }

    public static int[] Invertir(int[] arr) {
        int izq = 0;
        int der = arr.length - 1;

        while (izq < der) {
            // Intercambiar los elementos en las posiciones left y right
            int temp = arr[izq];
            arr[izq] = arr[der];
            arr[izq] = temp;

            // Mover los punteros
            izq++;
            der--;
        }
        return arr;
    }

    private static void Imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
