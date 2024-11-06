public class FiguraGeometrica {
    private String color;
    public double area;
    public double perimetro;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public void calcularArea() {
        //  Calculo de perimetro segun figura
    }

    public void calcularPerimetro() {
        // Calculo de perimetro segun figura
    }

    public void imprimir() {
        System.out.println("Color: " + this.color);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
