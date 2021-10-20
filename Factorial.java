//Factorial de un numero
//26-08-2021
//package factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*Calcular el factorial de un numero
		Ejemplo el fact de 4!= 4*3*2*1=24
		5!=5*4*3*2*1=120
		10!=36282800
		*/
		//con un for ingresando el numero
		Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int x=scan.nextInt();
        int fac=1;
        for (int i=1; i<=x; i++){
        	fac = fac * i;
        }
        System.out.println("El factorial de "+ x + " es : " + fac);
    }
}

