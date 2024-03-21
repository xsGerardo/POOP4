package poop4;

public class POOP4 {

    public static void main(String[] args) {
        Punto punto = new Punto();
        int a = 7;
        System.out.println(a);
        System.out.println(punto);
        punto.imprimirPunto();
        Punto punto1 = new Punto(5,8);
        punto1.imprimirPunto();
        punto.x = 12;
        punto.y = 33;
        punto.imprimirPunto();
       
        Profesor profesor = new Profesor();
        System.out.println(profesor.nombre);
        System.out.println(profesor.carrera);
        System.out.println(profesor.materia);
        System.out.println(profesor.profesion);
        System.out.println(profesor.genero);
       
        Profesor profesor2 = new Profesor("Luis", "Computacion", "POO", "Ingeniero", 'M');
        profesor2.imprimirProfesor();
        System.out.println("");
       
        Profesor profesor3 = new Profesor();
        profesor3.nombre = "Juan";
        profesor3.carrera = "Telecomunicaciones";
        profesor3.materia = "Ciencias";
        profesor3.profesion = "Maestro";
        profesor3.genero = 'M';
        profesor3.imprimirProfesor();
        System.out.println("");
        profesor3.darClase();
        profesor3.aplicarExamen();
        profesor3.dejarTareas();
        profesor3.calificarTrabajo();
        profesor3.resolverDudas();
        System.out.println("");
        
        Alumno alumno = new Alumno("Jose", "Computacion", 20, 'M', 320180091);
        System.out.println(alumno.toString());
        alumno.estudiar();
        alumno.asistirClase();
        alumno.presentarExamen();
        alumno.realizarTareas();
        alumno.preguntarDudas();
        
        System.out.println("");
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(20.5, 25.8, 32.7, 65.66, 75.85);
        System.out.println(trianguloRectangulo.toString());
        trianguloRectangulo.calcularPerimetro();
        trianguloRectangulo.calcularArea();
        trianguloRectangulo.calcularHipotenusa();
        trianguloRectangulo.calcularAngulos();
        trianguloRectangulo.encontrarLadoMayor();
        
        System.out.println("");
        Perro perro = new Perro ("Zeus", "Dobermann", "Negro", "Azul", 3);
        System.out.println(perro.toString());
        perro.dormir();
        perro.comer();
        perro.ladrar();
        perro.correr();
        perro.aullar();
        
        System.out.println("");
        Coche coche = new Coche ("Audi", "RS7", "Rojo", 4, 21);
        System.out.println(coche.toString());
        coche.encender();
        coche.apagar();
        coche.avanzar();
        coche.frenar();
        coche.prenderLuces();
    }
}
