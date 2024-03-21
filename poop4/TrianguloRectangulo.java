package poop4;

public class TrianguloRectangulo {
    double longCatA, longCatB, longHip, angCatA, angCatB;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(double longCatA, double longCatB, double longHip, double angCatA, double angCatB) {
        this.longCatA = longCatA;
        this.longCatB = longCatB;
        this.longHip = longHip;
        this.angCatA = angCatA;
        this.angCatB = angCatB;
    }
    
    
    public void calcularPerimetro(){
        System.out.println("Calculando el perimetro");
    }
    
    public void calcularArea(){
        System.out.println("Calculando el area");
    }
    
    public void calcularHipotenusa(){
        System.out.println("Calculando la hipotenusa");
    }
    
    public void calcularAngulos(){
        System.out.println("Calculando los angulos de los catetos A y B");
    }
    
    public void encontrarLadoMayor(){
        System.out.println("El lado mayor es B");
    }

    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "longCatA=" + longCatA + ", longCatB=" + longCatB + ", longHip=" + longHip + ", angCatA=" + angCatA + ", angCatB=" + angCatB + '}';
    }
    
    
    
}
