public class Calculadora {
    private double memoria;

    public double obtenerMemoria() {
        return this.memoria;
    }

    public void iniciarMemoria() {
        this.memoria = 0;
    }

    public void sumar(double a, double b) {
        this.memoria = a + b;
    }

    public void restar(double a, double b) {
        this.memoria = a - b;
    }

    public void multiplicar(double a, double b) {
        this.memoria = a * b;
    }

    public void dividir(double a, double b) {
        this.memoria = a / b;
    }
}
