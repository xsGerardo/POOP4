package poop4;

public class Alumno {
    String nombre, carrera;
    int edad;
    char genero;
    int numCuenta;

    public Alumno() {
    }

    public Alumno(String nombre, String carrera, int edad, char genero, int numCuenta) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.genero = genero;
        this.numCuenta = numCuenta;
    }
   
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    public void asistirClase(){
        System.out.println("En camino a clases");
    }
    
    public void presentarExamen(){
        System.out.println("En examen...");
    }
    
    public void realizarTareas(){
        System.out.println("Realizando tarea de POO");
    }
    
    public void preguntarDudas(){
        System.out.println("No entendi este tema, podria explicar profesor?");
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + ", genero=" + genero + ", numCuenta=" + numCuenta + '}';
    }
}
