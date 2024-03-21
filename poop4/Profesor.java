package poop4;

public class Profesor {
    String nombre, carrera, materia, profesion;
    char genero;
   
    public Profesor(){
    }
   
    public Profesor(String nombre, String carrera, String materia, String profesion, char genero){
        this.nombre = nombre;
        this.carrera = carrera;
        this.materia = materia;
        this.profesion = profesion;
        this.genero = genero;
    }
   
    public void darClase(){
        System.out.println("Estoy dando clase");
    }
   
    public void aplicarExamen(){
        System.out.println("El viernes hay examen");
    }
   
    public void dejarTareas(){
        System.out.println("Entreguen sus tareas");
    }
   
    public void calificarTrabajo(){
        System.out.println("Tu calificacion es de 9");
    }
   
    public void resolverDudas(){
        System.out.println("Hay dudas?");
    }
   
    public void imprimirProfesor(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Materia: " + this.materia);
        System.out.println("Profesion: " + this.profesion);
        System.out.println("Genero: " + this.genero);
    }
}
