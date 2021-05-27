import java.io.*;

public class borrador {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int c;
		double f;
		int n;
		double signo;
		double sx;
		double x;
		System.out.println("Ingresa las repeticiones de la serie");
		n = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingresa el valor de x");
		x = Double.parseDouble(bufEntrada.readLine());
		signo = 1;
		sx = x;
		for (a=3;a<=n;a+=2) {
			c = 1;
			f = 1;
			while (c<=a) {
				f = f*c;
				c = c+1;
			}
			if (signo%2==1) {
				sx = sx-((Math.pow(x,a))/f);
			} else {
				sx = sx+((Math.pow(x,a))/f);
			}
			signo = signo+1;
		}
		System.out.println("El resultado de la funcion seno es: "+sx);
	}


}
