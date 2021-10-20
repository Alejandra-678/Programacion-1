import java.util.*;
public class operaMat {


    public static void main(String[] args) {
        int a[][]=null;
        int b[][]=null;
    
        int f,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar numero de filas: ");
        f = sc.nextInt();
        System.out.print("Ingresar numero de columnas: ");
        c = sc.nextInt();
        a= new int[f][c];
        b= new int [f][c];
        System.out.println("Matriz A ");
        llenarArreglo(a);
        imprimeArreglo(a);
        System.out.println();
        System.out.println("Matriz B ");
        llenarArreglo(b);
        imprimeArreglo(b);
        System.out.println();

        //Suma Matriz 
        System.out.println("Suma de Matrices ");
        int res[][] = suma(a,b);
        imprimeArreglo(res);

          //Suma Resta 
        System.out.println("Resta de Matrices ");
        int res1[][] = resta(a,b);
        imprimeArreglo(res1);

    }
    
    public static void imprimeArreglo(int[][]x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j]+"\t");
            System.out.println();
        }
    }
    
    public static void llenarArreglo(int[][]x){
        Random r= new Random();
       // int ctr=0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                x[i][j]=r.nextInt(10);
        }
    }
    public static int[][] suma(int[][] a, int[][] b){

        int[][] res;
        int f =a.length;
        int c = a[0].length;
        int f2 =b.length;
        int c2 = b[0].length;
         
        if(f== f2 && c == c2){
            res = new int[f][c];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    res[i][j] = a[i][j] + b[i][j];
                }
            }
                return res;
            
            }else {
            return null;
        }
    }
      public static int[][] resta(int[][] a, int[][] b){

        int[][] res;
        int f =a.length;
        int c = a[0].length;
        int f2 =b.length;
        int c2 = b[0].length;
         
        if(f== f2 && c == c2){
            res = new int[f][c];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    res[i][j] = a[i][j] - b[i][j];
                }
            }
                return res;
            
            }else {
            return null;
        }
    }
      
}


