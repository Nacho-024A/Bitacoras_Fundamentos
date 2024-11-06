public class Rectangulo extends FiguraGeometrica {
    private double alto;
    private double ancho;

    public Rectangulo(String color, double alto, double ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        this.area = this.alto * this.ancho;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * (this.alto + this.ancho);
    }
}
