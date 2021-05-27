import java.util.Scanner;

public class borrador03 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        int i, n;
        double factorial;
        factorial = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            if(i==1)
                factorial=1;
            else
                factorial=factorial*i;
            System.out.println();
        }
        System.out.println("Valor de factorial: " + factorial);
    }

}