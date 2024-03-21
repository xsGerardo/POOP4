package poop4;

public class Coche {
    String marca, modelo, color;
    int numeroPuertas, tamanoRin;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numeroPuertas, int tamanoRin) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.tamanoRin = tamanoRin;
    }
    
    public void encender(){
        System.out.println("Encendiendo el coche");
    }
    
    public void apagar(){
        System.out.println("Apagando el coche");
    }
    
    public void avanzar(){
        System.out.println("El coche esta avanzando");
    }
    
    public void frenar(){
        System.out.println("Frenando...");
    }
    
    public void prenderLuces(){
        System.out.println("Esta obscuro, prendiendo las luces");
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numeroPuertas=" + numeroPuertas + ", tamanoRin=" + tamanoRin + '}';
    }
    
}
