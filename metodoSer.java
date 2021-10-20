import java.util.Scanner;
public class metodoSer {
    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        int n,m,x;
        int matriz[][];
       
        //Tamaño del array
        System.out.print("Ingrese cantidad  filas: ");
        n = teclado.nextInt();
        System.out.print("Ingrese cantidad columnas: ");
        m = teclado.nextInt();
        matriz = new int [n][m];
       
        //llenar array
        x = n*m;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length -1; j >= 0; j--) {
                matriz [i][j] = x;
                x--;
            }
        }
       
        //Mostrar matriz
       
        for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(matriz [i][j]+" ");
          }
          System.out.println();
        }      
    }
}