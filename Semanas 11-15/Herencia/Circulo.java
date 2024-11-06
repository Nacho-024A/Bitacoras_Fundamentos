public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * this.radio * this.radio;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.radio;
    }
}
