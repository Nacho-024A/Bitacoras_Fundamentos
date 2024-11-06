public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.sumar(2.5, 3.7);
        double resultado = calculadora.obtenerMemoria();
        System.out.println(resultado);// resultado = 6.2
        calculadora.restar(10.0, 4.0);
        resultado = calculadora.obtenerMemoria();
        System.out.println(resultado);  // resultado = 6.0
    }
}
