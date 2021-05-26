import java.util.Scanner;

public class ejercicios02 {
    static Scanner teclado=new Scanner(System.in);

    public static void IncrementoAlSalarioDeUnProfesor() {
        int i;
        double salario_inicial, salario_recibido, year;
        for (i=1; i<=6; i++) {
            System.out.print("PROCESO " + i);
            salario_inicial=1500;
            year=i;
            salario_recibido=salario_inicial*Math.pow(1.1,year);
            System.out.println("Valor de salario inicial: " + salario_inicial);
            System.out.println("Valor de salario recibido: " + salario_recibido);
            System.out.println("Valor de year: " + year);
            System.out.println();
        }
    }

    public static void pagoHamburgesas() {
        
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
    
        while (contador<=3){
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }

        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }

    public static void CantidadesCeroMenoresYMayores() {

        int cantidades_cero, i, mayores_a_cero, menores_a_cero, n;
        double cantidad;
        cantidades_cero = 0;
        menores_a_cero = 0;
        mayores_a_cero = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de cantidad: ");
            cantidad = teclado.nextDouble();
            teclado.nextLine();
            if(cantidad==0)
                cantidades_cero=cantidades_cero+1;
            if(cantidad<0)
                menores_a_cero=menores_a_cero+1;
            if(cantidad>0)
                mayores_a_cero=mayores_a_cero+1;
            System.out.println();
        }
        System.out.println("Valor de cantidades cero: " + cantidades_cero);
        System.out.println("Valor de menores a cero: " + menores_a_cero);
        System.out.println("Valor de mayores a cero: " + mayores_a_cero);
    }

    public static void FabricaDeFocos() {

        int color, focos_blancos, focos_rojos, focos_verdes, i;
        int n;
        focos_verdes = 0;
        focos_blancos = 0;
        focos_rojos = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.println("Selecciona el valor de color.");
            System.out.println("1.- verde");
            System.out.println("2.- blanco");
            System.out.println("3.- rojo");
            System.out.print(": ");
            do {
                color = teclado.nextInt();
                teclado.nextLine();
                if (color<1||color>3)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (color<1||color>3);
            if(color==1)
                focos_verdes=focos_verdes+1;
            if(color==2)
                focos_blancos=focos_blancos+1;
            if(color==3)
                focos_rojos=focos_rojos+1;
            System.out.println();
        }
        System.out.println("Valor de focos verdes: " + focos_verdes);
        System.out.println("Valor de focos blancos: " + focos_blancos);
        System.out.println("Valor de focos rojos: " + focos_rojos);
    }

    public static void AhorroDiarioYAnual() {
        int i;
        double ahorro_anual, ahorro_diario;
        ahorro_anual = 0;
        for (i=1; i<=365; i++) {
            System.out.print("PROCESO " + i);
            ahorro_anual=ahorro_anual+0.01*Math.pow(3,i);
            ahorro_diario=ahorro_anual;
            System.out.println("Valor de ahorro diario: " + ahorro_diario);
            System.out.println();
        }
        System.out.println("Valor de ahorro anual: " + ahorro_anual);
    }

    public static void PagoPorNArticulos() {
        int i, n;
        double costo, descuento, pago_por_todo, precio;
        pago_por_todo = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de precio: ");
            precio = teclado.nextDouble();
            teclado.nextLine();
            descuento=precio*0.1;
            if(precio>=200)
                descuento=precio*0.15;
            if(precio>100&&precio<200)
                descuento=precio*0.12;
            costo=precio-descuento;
            pago_por_todo=pago_por_todo+costo;
            System.out.println("Valor de costo: " + costo);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println();
        }
        System.out.println("Valor de pago por todo: " + pago_por_todo);
    }
    
    public static void ClienteDeUnBanco() {
        int i, n;
        double cantidad_01_enero, cantidad_02_febrero, cantidad_03_marzo, cantidad_04_abril, cantidad_05_mayo;
        double cantidad_06_junio, cantidad_07_julio, cantidad_08_agosto, cantidad_09_septiembre, cantidad_10_octubre;
        double cantidad_11_noviembre, cantidad_12_diciembre, intereses, inversion_final, total;
        total = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de cantidad 01 enero: ");
            cantidad_01_enero = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 02 febrero: ");
            cantidad_02_febrero = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 03 marzo: ");
            cantidad_03_marzo = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 04 abril: ");
            cantidad_04_abril = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 05 mayo: ");
            cantidad_05_mayo = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 06 junio: ");
            cantidad_06_junio = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 07 julio: ");
            cantidad_07_julio = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 08 agosto: ");
            cantidad_08_agosto = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 09 septiembre: ");
            cantidad_09_septiembre = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 10 octubre: ");
            cantidad_10_octubre = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 11 noviembre: ");
            cantidad_11_noviembre = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de cantidad 12 diciembre: ");
            cantidad_12_diciembre = teclado.nextDouble();
            teclado.nextLine();
            intereses=total*0.1;
            total=total+intereses+cantidad_01_enero+cantidad_02_febrero+cantidad_03_marzo+cantidad_04_abril+cantidad_05_mayo+cantidad_06_junio+cantidad_07_julio+cantidad_08_agosto+cantidad_09_septiembre+cantidad_10_octubre+cantidad_11_noviembre+cantidad_12_diciembre;
            inversion_final=total;
            System.out.println("Valor de intereses: " + intereses);
            System.out.println("Valor de inversion final: " + inversion_final);
            System.out.println();
        }
        System.out.println("Valor de total: " + total);
    }

    public static void FuncionExponencial() {
        int i, n;
        double ex, factorial, x;
        ex = 0;
        factorial = 0;
        System.out.print("Ingresa el valor de x: ");
        x = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            if(i==1)
            {
                ex=1;
                factorial=1;
            }
            factorial=factorial*i;
            ex=ex+Math.pow(x,i)/factorial;
            System.out.println();
        }
        System.out.println("Valor de ex: " + ex);
        System.out.println("Valor de factorial: " + factorial);
    }

    public static void TotalDeUnaCajaRegistradora() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ej. 4.12: TotalDeUnaCajaRegistradora ");
        System.out.println("---------------------------------------------------------------");
        int billetes_de_10, billetes_de_20, billetes_de_50, billetes_de_100, billetes_de_200;
        int monedas_de_1, monedas_de_2;
        int monedas_de_5, total;
        System.out.print("Ingresa el valor de billetes de S/ 10: ");
        billetes_de_10 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de billetes de S/ 20: ");
        billetes_de_20 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de billetes de S/ 50: ");
        billetes_de_50 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de billetes de S/ 100: ");
        billetes_de_100 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de billetes de S/ 200: ");
        billetes_de_200 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de monedas de S/ 1: ");
        monedas_de_1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de monedas de S/ 2: ");
        monedas_de_2 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de monedas de S/ 5: ");
        monedas_de_5 = teclado.nextInt();
        teclado.nextLine();
        total=billetes_de_200*200+billetes_de_100*100+billetes_de_50*50+billetes_de_20*20+billetes_de_10*10+monedas_de_5*5+monedas_de_2*2+monedas_de_1;
        System.out.println("---------------------------------------------------------------");
        System.out.println("Valor deL total es: S/ " + total);
        System.out.println("---------------------------------------------------------------");
    }

    public static void TotalDeNVentas() {
        int i, n, ventas_de_0_a_10000, ventas_de_10000_a_20000;
        double monto_global, monto_ventas_de_0_a_10000, monto_ventas_de_10000_a_20000, venta;
        ventas_de_0_a_10000 = 0;
        ventas_de_10000_a_20000 = 0;
        monto_ventas_de_0_a_10000 = 0;
        monto_ventas_de_10000_a_20000 = 0;
        monto_global = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de venta: ");
            venta = teclado.nextDouble();
            teclado.nextLine();
            if(venta<=10000)
            {
                ventas_de_0_a_10000=ventas_de_0_a_10000+1;
                monto_ventas_de_0_a_10000=monto_ventas_de_0_a_10000+venta;
            }
            if(venta>10000&&venta<=20000)
            {
                ventas_de_10000_a_20000=ventas_de_10000_a_20000+1;
                monto_ventas_de_10000_a_20000=monto_ventas_de_10000_a_20000+venta;
            }
            monto_global=monto_global+venta;
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Valor de ventas de 0 a 10000: " + ventas_de_0_a_10000);
        System.out.println("Valor de ventas de 10000 a 20000: " + ventas_de_10000_a_20000);
        System.out.println("Valor de monto ventas de 0 a 10000: " + monto_ventas_de_0_a_10000);
        System.out.println("Valor de monto ventas de 10000 a 20000: " + monto_ventas_de_10000_a_20000);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Valor de monto global: " + monto_global);
        System.out.println("---------------------------------------------------------------");
    }

    public static void AprobadosYReprobados() {
        int aprobados, i, n, reprobados;
        double calificacion, calificacion_aprobatoria;
        aprobados = 0;
        reprobados = 0;
        System.out.print("Ingresa el valor de calificacion aprobatoria: ");
        calificacion_aprobatoria = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de calificacion: ");
            calificacion = teclado.nextDouble();
            teclado.nextLine();
            if(calificacion>=calificacion_aprobatoria)
                aprobados=aprobados+1;
            else
                reprobados=reprobados+1;
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Alumnos Aprobados: " + aprobados);
        System.out.println("Alumnos Reprobados: " + reprobados);
        System.out.println("---------------------------------------------------------------");
    }

    public static void SueldoSemanalDeNTrabajadores() {
        int i, n;
        double descuento, horas_trabajadas, sueldo_por_hora, sueldo_semanal;
        String nombre_del_trabajador;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el nombre del trabajador: ");
            nombre_del_trabajador = teclado.nextLine();
            System.out.print("Ingresa el valor de horas trabajadas: ");
            horas_trabajadas = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de sueldo por hora: ");
            sueldo_por_hora = teclado.nextDouble();
            teclado.nextLine();
            teclado.nextLine();
            sueldo_semanal=horas_trabajadas*sueldo_por_hora;
            descuento=0;
            if(sueldo_semanal>0&&sueldo_semanal<=150)
                descuento=sueldo_semanal*0.05;
            if(sueldo_semanal>150&&sueldo_semanal<=300)
                descuento=sueldo_semanal*0.07;
            if(sueldo_semanal>300&&sueldo_semanal<=450)
                descuento=sueldo_semanal*0.09;
            sueldo_semanal=sueldo_semanal-descuento;
            System.out.println("Nombre del trabajador: " + nombre_del_trabajador);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println("Valor de sueldo semanal: " + sueldo_semanal);
            System.out.println();
        }
    }

    public static void CuboDeUnGrupoDeNumeros() {
        double cubo, un_numero;
        String tecla_repetir;
        do {
            System.out.print("Ingresa el valor de un numero: ");
            un_numero = teclado.nextDouble();
            teclado.nextLine();
            cubo=un_numero*un_numero*un_numero;
            System.out.println("Valor de cubo: " + cubo);
            System.out.println();
            do {
                System.out.print("Deseas repetir el proceso? (S/N): ");
                tecla_repetir = teclado.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }

    public static void TablaDeMultiplicar() {
        int i, numero, resultado;
        System.out.println("Ingrese un Número: ");
        numero = teclado.nextInt();
        System.out.println();
        System.out.println("La Tabla de Multiplicar del Número Ingresado es: ");
        System.out.println();
        for (i=1; i<=12; i++) {
            resultado = i*numero;
            System.out.println(numero+"x"+i+"="+resultado);
        }
        System.out.println();
    }

    public static void TablaDeMultiplicarOtroMetodo() {
        boolean comprobar = true;
        int n;
        while (comprobar == true) {
            System.out.println("Ingrese un Número entero positivo: ");
            n=teclado.nextInt();
            if (n>0) {
                for (int i = 1;i<=12;i++) {
                    System.out.println(n+"x"+i+"="+n*i);
            
                }
                comprobar = false;
            } 
        
            else {
                System.out.println("El Número ingresado no es correcto."
                + "Intentelo nuevamente.");

            }
        }
    }

    public static void TierrasVendidasEn1961() {
        double Pago, ahorros, porcentajeAnual, añosTranscurridos;
        añosTranscurridos=2021-1961;
        Pago=1500.0;
        porcentajeAnual=15.0/100.0;
        ahorros=Pago*Math.pow(1.0+porcentajeAnual,añosTranscurridos);
        System.out.println("Valor de Pago: " + Pago);
        System.out.println("Valor de Porcentaje Anual: " + porcentajeAnual);
        System.out.println("Valor de Años Transcurridos: " + añosTranscurridos);
        System.out.println("Valor de Ahorros a la Actualidad: " + ahorros);
    }

    public static void ImpuestoPorAutomoviles() {
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de clave: ");
            clave = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de costo: ");
            costo = teclado.nextDouble();
            teclado.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }

    public static void CantidadDeDineroEnUnMonedero() {
        int billetes_de_cincuenta, billetes_de_diez, billetes_de_veinte, cantidad_de_dinero, monedas_de_cinco;
        int monedas_de_diez, monedas_de_un_peso;
        System.out.print("Ingresa el valor de billetes de cincuenta: ");
        billetes_de_cincuenta = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de billetes de diez: ");
        billetes_de_diez = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de billetes de veinte: ");
        billetes_de_veinte = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de monedas de cinco: ");
        monedas_de_cinco = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de monedas de diez: ");
        monedas_de_diez = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingresa el valor de monedas de un peso: ");
        monedas_de_un_peso = teclado.nextInt();
        teclado.nextLine();
        cantidad_de_dinero=monedas_de_diez*10+monedas_de_cinco*5+monedas_de_un_peso+billetes_de_diez*10+billetes_de_veinte*20+billetes_de_cincuenta*50;
        System.out.println("Valor de cantidad de dinero: " + cantidad_de_dinero);
    }

    public static void BancoBandidoDePelucheDeNClientes() {
        int i, n;
        double compras_realizadas, ganacia_por_intereses, intereses, multa, pago_del_corte_anterior;
        double pago_minimo, pago_para_no_generar_intereses, saldo_actual, saldo_anterior;
        ganacia_por_intereses = 0;
        System.out.print("Ingresa el valor de n: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de compras realizadas: ");
            compras_realizadas = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de pago del corte anterior: ");
            pago_del_corte_anterior = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingresa el valor de saldo anterior: ");
            saldo_anterior = teclado.nextDouble();
            teclado.nextLine();
            if(saldo_anterior*0.15>pago_del_corte_anterior) {
            
                intereses=saldo_anterior*0.12;
                multa=200;
            }
            else {
            
                intereses=0;
                multa=0;
            }
            saldo_actual=saldo_anterior+compras_realizadas-pago_del_corte_anterior+intereses+multa;
            pago_minimo=saldo_actual*0.15;
            pago_para_no_generar_intereses=saldo_actual*0.85;
            ganacia_por_intereses=ganacia_por_intereses+intereses;
            System.out.println("Valor de intereses: " + intereses);
            System.out.println("Valor de multa: " + multa);
            System.out.println("Valor de pago minimo: " + pago_minimo);
            System.out.println("Valor de pago para no generar intereses: " + pago_para_no_generar_intereses);
            System.out.println("Valor de saldo actual: " + saldo_actual);
            System.out.println();
        }
        System.out.println("Valor de ganacia por intereses: " + ganacia_por_intereses);
    }

    public static void main(String[] args) {
        //IncrementoAlSalarioDeUnProfesor();
        //pagoHamburgesas();
        //CantidadesCeroMenoresYMayores();
        //FabricaDeFocos();
        //AhorroDiarioYAnual();
        //PagoPorNArticulos();
        //ClienteDeUnBanco();
        //FuncionExponencial();
        //TotalDeUnaCajaRegistradora();
        //TotalDeNVentas();
        //AprobadosYReprobados();
        //SueldoSemanalDeNTrabajadores();
        //CuboDeUnGrupoDeNumeros();
        //TablaDeMultiplicar();
        //TablaDeMultiplicarOtroMetodo();
        //TierrasVendidasEn1961();
        //ImpuestoPorAutomoviles();
        //CantidadDeDineroEnUnMonedero();
        BancoBandidoDePelucheDeNClientes();
    }
}