public class PersonaFisica extends Persona {
    private String documento;

    public PersonaFisica(String nombre, String apellido, int edad, String genero, String direccion, String telefono, String documento) {
        super(nombre, apellido, edad, genero, direccion, telefono);
        this.documento = documento;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Documento de Identidad: " + this.documento);
    }
}
