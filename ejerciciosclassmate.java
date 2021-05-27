import java.util.Scanner;

public class ejerciciosclassmate {
    static Scanner teclado=new Scanner(System.in);

    public static void ÁreaDeUnTriangulo() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ejercicio 01: Área de un Triangulo");
        System.out.println("---------------------------------------------------------------");
        double altura, area, base;
        System.out.print("Ingresa el valor de altura: ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingresa el valor de base: ");
        base = teclado.nextDouble();
        teclado.nextLine();
        area=base*altura/2;
        System.out.println("---------------------------------------------------------------");
        System.out.println("El Área es: " + area);
        System.out.println("---------------------------------------------------------------");

    }

    public static void main(String[] args) {
        ÁreaDeUnTriangulo();
        
    }

}