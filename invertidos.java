import java.util.*;

public class invertidos{
    public static void main(String[] args) {       
          int f,c,ls,li;
          int a[][]=null;
          Scanner sc = new Scanner(System.in);

          System.out.print("Ingresar numero de columnas: ");
          f = sc.nextInt();
          System.out.print("Ingresar numero de filas: ");
          c = sc.nextInt();
         // System.out.print("Ingresa valor minimo: ");
          //li = sc.nextInt();
          //System.out.print("Ingresa valor máximo: ");
          //ls = sc.nextInt();
          //Metodos
          a=new int [f][c];
          llenaArreglo(a);
          imprimeArreglo(a);
          System.out.println("Matriz invertida");
          System.out.println();
          invierte(a);
          imprimeArreglo(a);
       
    }
            
      public static void llenaArreglo(int[][]x){
        int in=0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                x[i][j]=in++;
        }
    }   
    public static void imprimeArreglo(int[][]x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j]+"\t");
            System.out.println();
        }
    }
    
    public static void invierte(int[][]arreglo){
      int [][] tem= new int [arreglo.length][arreglo[0].length];
    for(int i = 0; i <arreglo.length; i++) {
      for(int j = 0; i <arreglo[i].length; j++) 
            tem[i][j]=arreglo[i][j];
        }
        for(int i = 0; i <arreglo.length; i++) {
          for(int j = 0; i <arreglo[i].length; j++) 
            arreglo[i][j] = tem[arreglo.length-i-1][arreglo[0].length-j-1];
      }
       // arreglo[i] = arreglo[arreglo.length - i - 1];
        //arreglo[arreglo.length - i - 1] = temp;
    }
}
   /* public static void invierte(int[][]x){
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
  }
*/




