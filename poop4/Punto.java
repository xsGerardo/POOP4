package poop4;

public class Punto {
    int x, y;
   
    public Punto(){
    }
   
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
   
    public void imprimirPunto(){
        System.out.println("x = " + x + ", y = " + y);
    }
}
