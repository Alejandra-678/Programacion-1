//package Ejercicios;
//26-08-2021
import java.util.Scanner;

public class piramide2{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa nombre");
        String str = scan.nextLine();
        System.out.println("Ingresa el tamaño");
        int x=scan.nextInt();
 

    	for (int i=x; i>=0; i--){ //decrementa de 2 en 2 
    		for(int y=0; y<x; y++)
                if(y<i )System.out.print(" ");
    			else System.out.print("*");
    		System.out.println();

        }
        System.out.println("Hasta luego "+ str);
        
    }
}