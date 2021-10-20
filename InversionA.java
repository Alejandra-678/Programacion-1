import java.util.*;

public class InversionA{
public static void main(String[] args) {
		int i=0;
		int p=0;
		int a[][]=new int [4][4];
		int s[][]=new int[4][4];
 
		for(i=0;i<a.length;i++){
 
			for(p=0;p<a.length;p++){
				a[i][p]=(int)(Math.random()*10+1);
				System.out.print(a[i][p] +"\t");
 
			}
			System.out.println();
		}
 
		System.out.println();
 
 
		int x=s.length-1;
		int y=s.length-1;
 
		System.out.println("A continuación se muestra la matriz al mismo tiempo que la invertimos.");
		System.out.println("Debido a eso, va a parecer que no se ha invertido nada.");
		System.out.println();
 
		for(int d=0;d<a.length;d++){
			for(int e=0;e<a.length;e++){
 
				s[x][y]=a[d][e];
 
				System.out.print(s[x][y] +"\t");
				y--; //Decrementamos y
 
			}
			y = s.length-1; //Reiniciamos y
			x--; //Decrementamos x
			System.out.println();
		}
 
		System.out.println();
		System.out.println("Ahora la volvemos a mostrar, tras haber finalizado la inversión.");
		System.out.println("Esta vez, sí se apreciarán los cambios.");
		System.out.println();
 
		for (x = 0; x < s.length; x++) {
			for (y = 0; y < s[0].length; y++)
				System.out.print(s[x][y] + "\t");
 
			System.out.println();
		}
 
	}
}