public class Estudiante {
    private String nombre;
    private double promedio;
    private int semestre;

    public Estudiante(String nombre, double promedio, int semestre) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Promedio: " + promedio + " | Semestre: " + semestre);
    }
}
