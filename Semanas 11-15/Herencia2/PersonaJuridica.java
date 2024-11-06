public class PersonaJuridica extends Persona {
    private int nit;

    public PersonaJuridica(String nombre, String apellido, int edad, String genero, String direccion, String telefono, int nit) {
        super(nombre, apellido, edad, genero, direccion, telefono);
        this.nit = nit;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("NIT: " + this.nit);
    }
}
