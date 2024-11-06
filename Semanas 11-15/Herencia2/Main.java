public class Main {
    public static void main(String[] args) {
        // Crear una persona física
        Persona personaFisica = new PersonaFisica(
            "Juan",
            "Pérez",
            35,
            "Masculino",
            "Calle 123, Ciudad",
            "555-1234",
            "12345678"
        );
        personaFisica.imprimir();
        System.out.println();

        // Crear una persona jurídica
        Persona personaJuridica = new PersonaJuridica(
            "Acme Corp",
            "Acme",
            0,
            "N/A",
            "Avenida 456, Ciudad",
            "555-5678",
            654321
        );
        personaJuridica.imprimir();
        System.out.println();
    }
}
