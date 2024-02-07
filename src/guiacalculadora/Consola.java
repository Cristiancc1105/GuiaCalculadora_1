package GuiaCalculadora;

import java.util.Scanner;

public class Consola {
 

    public static void main(String[] args) {
        int sel;
        Scanner teclado = new Scanner(System.in);
         Calculadora cal1 =new Calculadora();
         boolean salir = false;
     do{
        System.out.println("Seleccione la operacion que desea realizar (Ingrese el numero de la operacion):");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz enesima");
        System.out.println("9. Potencia enesima");
        System.out.println("10. Calcular el porcentaje del IVA %");
        System.out.println("11. Salir");
        
        sel=teclado.nextInt();
        System.out.println("Ingrese el numero:");
        double a = teclado.nextDouble();
        cal1.num1 = a;

        if (sel >= 1 && sel <= 4||sel>8 && sel<=10) {
        System.out.println("Ingrese el segundo numero:");
        double b = teclado.nextDouble();
        cal1.num2 = b;
        }
         
        switch(sel) {
            case 1 -> {
                cal1.suma();
                System.out.println("La suma de los numeros es:"+cal1.result);
                }
            case 2 -> {
                cal1.resta();
                System.out.println("La resta de los numeros es:"+cal1.result);
                }
            case 3 -> {
                cal1.multiplicacion();
                System.out.println("La multiplicacion de los numeros es:"+cal1.result);
                }
            case 4 -> {
                cal1.division();
                double b = teclado.nextDouble();
                cal1.num2 = b;
                if(b!=0){
                    System.out.println("La division de los numeros es:"+cal1.result);
                }else{
                    System.out.println("Error: No se puede dividir por cero.");
                }
                }

            case 5 -> {
                cal1.seno(a);
                System.out.println("El seno del numero 1 es:"+cal1.seno);
                }
                
            case 6 -> {
                cal1.coseno(a);
                System.out.println("El coseno del numero 1 es:"+cal1.coseno);
                }
                
            case 7 -> {
                cal1.tangente(a);
                System.out.println("La tangente del numero es:"+cal1.tangente);
                }
                
            case 8 -> {
                cal1.raizEnesima();
                System.out.println("La raiz del numero es:"+cal1.result);
                }
                
            case 9 -> {
                cal1.potenciaEnesima();
                System.out.println("La potencia del numero es:"+cal1.result);
                }
                
            case 10 -> {
                cal1.CIVA();
                System.out.println("El valor total del producto:"+cal1.total);
                System.out.println("El valor del IVA :"+cal1.iva);
                }
            case 11 -> {
                salir = true;
                
            }
            default -> System.out.println("Operacion no valida. Por favor, seleccione una operacion valida.");
        }
        
     }while(!salir); 
}
    
}
