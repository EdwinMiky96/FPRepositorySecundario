package pe.edu.upeu.Util;

import java.io.*;

public class TecladoRead {

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
public int read(int valor, String msg) {
    System.out.println(msg);
    try {
        valor=Integer.parseInt(reader.readLine());
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;
}

public double read(double valor, String msg) {
    System.out.println(msg);
    try {
        valor=Double.parseDouble(reader.readLine());
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;    
}

public char read(char valor, String msg) {
    System.out.println(msg);
    try {
        valor=reader.readLine().charAt(0);
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;    
}

public String read(String valor, String msg) {
    System.out.println(msg);
    try {
        valor=reader.readLine();
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;      
}

public boolean read(boolean valor, String msg) {
    System.out.println(msg);
    try {
        valor=Boolean.parseBoolean(reader.readLine());
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=read(valor,msg);
    }
    return valor;        
}


}