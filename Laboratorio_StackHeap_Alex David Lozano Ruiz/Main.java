public class Main {

    public static void main(String[] args) {
        int cantidadBase = 10;
        double factorAjuste = 0.5;
        boolean activo = true;

        System.out.println("--- Variables primitivas ---");
        System.out.println("Cantidad base: " + cantidadBase + ", Factor: " + factorAjuste + ", Activo: " + activo);

        Estudiante estudiante1 = new Estudiante("Ana", 4.2, 3);
        Estudiante copiaEstudiante = estudiante1;

        Producto producto1 = new Producto("Laptop", 2500.0, 5);
        Producto producto2 = new Producto("Teclado Mecanico", 120.0, 20);

        System.out.println("\n--- Objetos iniciales ---");
        estudiante1.mostrarInfo();
        producto1.mostrarInfo();
        producto2.mostrarInfo();

        copiaEstudiante.setSemestre(4);

        System.out.println("\n--- Despues de cambiar semestre desde copiaEstudiante ---");
        estudiante1.mostrarInfo();
        copiaEstudiante.mostrarInfo();

        actualizarPrecio(producto2, 95.0);

        System.out.println("\n--- Despues de actualizarPrecio(producto2) ---");
        producto2.mostrarInfo();

        producto1 = null;
        copiaEstudiante = null;
        estudiante1 = null;

        System.out.println("\n--- Fin de la ejecucion ---");
    }

    public static void actualizarPrecio(Producto prod, double nuevoPrecio) {
        prod.setPrecio(nuevoPrecio);
    }
}