public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;
    private String documentoIdentidad;
    private String nit;

    public Persona(String nombre, String apellido, int edad, String genero, String direccion, String telefono, String documentoIdentidad, String nit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.documentoIdentidad = documentoIdentidad;
        this.nit = nit;
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void cambiarApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    public void calcularEdad() {
        // Implementar lógica para calcular la edad a partir de la fecha de nacimiento
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Género: " + this.genero);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Documento de Identidad: " + this.documentoIdentidad);
        System.out.println("NIT: " + this.nit);
    }
}
