import java.util.*;
public class trans {

    public static void main(String[] args) {
        int a[][]=null;
        int f,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar numero de filas: ");
        f = sc.nextInt();
        System.out.print("Ingresar numero de columnas: ");
        c = sc.nextInt();
        a= new int[f][c];
        llenarArreglo(a);
        imprimeArreglo(a);
        System.out.println();
        transpuesta(a);
        imprimeArreglo(a);
    }
    
    public static void imprimeArreglo(int[][]x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j]+"\t");
            System.out.println();
        }
    }
    
    public static void llenarArreglo(int[][]x){
        int ctr=0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                x[i][j]=ctr++;
        }
    }
    
    public static void invierteElementos(int[][]x){
        int[][]tmp=new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                tmp[i][j] = x[i][j];
        }
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                x[i][j] = tmp[x.length-i-1][x[0].length-j-1];
        }
    }
    
    public static void transpuesta(int[][] matriz){
  
        int aux;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){ if(i>j){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }
    }
}
  

    
    
//Arreglo debe ser cuadrado(filas=columnas):
//a b c
//d e f
//g h i
//transpuesta de una matriz:  
//a d g   
//b e h
//c f i 
//Implementar un método que efectúe la transpuesta de una matriz.    

