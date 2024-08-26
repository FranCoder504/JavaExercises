package conversor_unidades;

import java.util.Scanner;

public class Conversor_Unidades {

   
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese la cantidad en metros: ");
       int metros = teclado.nextInt();
       
       System.out.println("=============================");
       System.out.println("     Ingrese una opcion      ");
       System.out.println("   1.- Metros a Kilometros   ");
       System.out.println("   2.- Metros a Centimetros  ");
       System.out.println("   3.- Metros a Milimetros   ");
       System.out.println("=============================");
       int opcion = teclado.nextInt();
       double conversion = 0;
       
       
       switch (opcion) {
           case 1 -> conversion = metros / 1000;
           case 2 -> conversion = metros * 100;
           case 3 -> conversion = metros * 1000;
           default -> System.out.println("Opcion invalida");
       }
       
       System.out.println("La conversion final es: "+ conversion);
               
               
       
       
       }
    }
    





