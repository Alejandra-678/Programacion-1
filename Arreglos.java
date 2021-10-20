//31-08-2021
//Arreglos

import java.util.Scanner;

public class Arreglos{
	public static void main(String agrs[]){

		Scanner ingr = new Scanner(System.in);
		int []x;
		int n;
		int suma=0;
		//int [] x= new int[10];
		System.out.println("Ingrese el tamaño del arreglo");
		n= ingr.nextInt();
		x= new int [n];
		for(int i=0; i<x.length; i++){
			//x[i]=x;
			//x[i]=i;	//Numeros fijos
			x[i]=(int)(Math.random()*99.0)+1;	//Numeros aleatorios

		}
		for(int i=0; i<x.length; i++){
			System.out.println("x ["+ i +"] : " +x[i]);
			suma +=x[i]; 	//Suma = suma +x[i]
		}
		System.out.println("Suma: "+ suma);
		
	}
}