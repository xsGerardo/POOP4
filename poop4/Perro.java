package poop4;

public class Perro {
    String nombre, raza, colorPelaje, colorOjos;
    int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String colorPelaje, String colorOjos, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.colorOjos = colorOjos;
        this.edad = edad;
    }
    
    public void dormir(){
        System.out.println("ZZZ");
    }
    
    public void comer(){
        System.out.println("El perro esta comiendo");
    }
    
    public void ladrar(){
        System.out.println("Guaf Guaf");
    }
    
    public void correr(){
        System.out.println("El perro esta corriendo muy rapido");
    }
    
    public void aullar(){
        System.out.println("Auuuu");
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", colorPelaje=" + colorPelaje + ", edad=" + edad + ", colorOjos=" + colorOjos + '}';
    }
    
}
