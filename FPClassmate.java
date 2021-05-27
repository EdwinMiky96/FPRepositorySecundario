import java.util.Scanner;

public class FPClassmate {
    static Scanner teclado=new Scanner(System.in);

    public static void NumerosPositivosNegativosONulos() {

        double numero;
        System.out.print("Ingresa un numero: ");
        numero = teclado.nextDouble();
        teclado.nextLine();
        if(numero<0)
            System.out.println("Negativo");
        if(numero==0)
            System.out.println("Nulo");
        if(numero>0)
            System.out.println("Positivo");
    }

    public static void Temperatura() {
        int temperatura = 0;
        System.out.print("Ingresa la temperatura: ");
        temperatura = teclado.nextInt();
        if (temperatura>25) {
            System.out.println("Puedes ir a la Playa: ");
        }
        else if (temperatura >15) {
            System.out.println("Puedes ir a la Montaña: ");
        }
        else {
            System.out.println("Mejor abrigate y descanasa: ");
        }

    }

    public static void SueldoDeUnaPersona() {
        float sueldo;
    	System.out.println("Ingrese el sueldo:");
    	sueldo=teclado.nextFloat();
    	if (sueldo>5000) {
    	    System.out.println("La persona debe pagar impuestos");
        }
        else {
            System.out.println("La persona no debe pagar impuestos");
        
        }   
    }

    public static void ElMayorDeDosNumeros() {
        int n1, n2;
        System.out.println("Ingrese el primer numero: ");
        n1=teclado.nextInt();
        System.out.println("Ingrese otro numero distinto del primero: ");
        n2=teclado.nextInt();
        if (n1>n2) {
            System.out.println("El mayor es: "+ n1);
        }
        else {
            System.out.println("El mayor es: " +n2);
        }
        
    }

    public static void TresNotasDeUnAlumno() {
        double nota_1, nota_2, nota_3, promedio;
        System.out.print("Ingresa el valor de nota 1: ");
        nota_1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingresa el valor de nota 2: ");
        nota_2 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingresa el valor de nota 3: ");
        nota_3 = teclado.nextDouble();
        teclado.nextLine();
        promedio=(nota_1+nota_2+nota_3)/3;
        if(promedio>=17) {
            System.out.println("Felicitaciones: ");
        }
        else if (promedio>=13) {
            System.out.println("Aprobaste: ");
        }
        else {
            System.out.println("Esfuérzate más a la siguiente: ");
        }
        System.out.println("Tu promedio es: " + promedio);
    }

    public static void CantidadDeDigitos() {
        int num;
        System.out.println("Ingrese un numero entero de 1 o 2 digitos: ");
        num = teclado.nextInt();
        if (num<10) {
            System.out.println("El Numero tiene un Digitos: ");
        }
        else {
            System.out.println("El numero iene dos Digitos: ");
        }
    }

    public static void OfertaEnUnSupermercado() {
        double costo_por_unidad, docenas_del_producto, monto_a_pagar, monto_de_la_compra, monto_del_descuento;
        double unidades_de_obsequio;
        System.out.print("Ingresa el valor de costo por unidad: ");
        costo_por_unidad = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingresa el valor de docenas del producto: ");
        docenas_del_producto = teclado.nextDouble();
        teclado.nextLine();
        monto_de_la_compra=costo_por_unidad*docenas_del_producto*12;
        monto_del_descuento=docenas_del_producto>3?monto_de_la_compra*0.15:monto_de_la_compra*0.1;
        monto_a_pagar=monto_de_la_compra-monto_del_descuento;
        unidades_de_obsequio=docenas_del_producto>3?docenas_del_producto-3:0;
        System.out.println("Valor de monto a pagar: " + monto_a_pagar);
        System.out.println("Valor de monto de la compra: " + monto_de_la_compra);
        System.out.println("Valor de monto del descuento: " + monto_del_descuento);
        System.out.println("Valor de unidades de obsequio: " + unidades_de_obsequio);
    }

    public static void main(String[] args) {
        //NumerosPositivosNegativosONulos();
        //Temperatura();
        //SueldoDeUnaPersona();
        //ElMayorDeDosNumeros();
        //TresNotasDeUnAlumno();
        //CantidadDeDigitos();
        OfertaEnUnSupermercado();
    }

}