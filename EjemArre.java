import java.util.*;

public class EjemArre{
    public static void main(String[] args) {       
          int f,c,ls,li;
          Scanner sc = new Scanner(System.in);
          System.out.print("Ingresar numero de filas: ");
          f = sc.nextInt();
          System.out.print("Ingresar numero de columnas: ");
          c = sc.nextInt();
          System.out.print("Ingresa valor minimo: ");
          li = sc.nextInt();
          System.out.print("Ingresa valor máximo: ");
          ls = sc.nextInt();
          Auxiliar a = new Auxiliar();
          a.Init(f, c);
          int y[][]=new int[f][c];
          int r[][]=new int[f][c];
          a.llenaArreglo(li, ls);
          a.imprimeArreglo();
          Auxiliar b = new Auxiliar();
          b.Init(f, c);
          b.llenaArreglo(li, ls);
          System.out.println();
          b.imprimeArreglo();
          y=b.obtenerMatriz();
          r=a.sumaMatrices(y);
          System.out.println();
          imprimeArreglo(r);

    }
    public static void imprimeArreglo(int[][]x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j]+"\t");
            System.out.println();
        }
    }
}

class Auxiliar{
    private int f,c;
    private int[][]x;
    
    public void Auxiliar(){
        
    }
        
    public void Init(int f, int c){
        this.f = f;
        this.c = c;
        this.x = new int[this.f][this.c];
    }
    
    public void llenaArreglo(int min, int max){
        for (int i = 0; i < this.x.length; i++)
            for (int j = 0; j < this.x[i].length; j++)
                this.x[i][j]=(int)(Math.random()*(max-min+1)+min);
    }
    
    public void imprimeArreglo(){
        for (int i = 0; i < this.x.length; i++){
            for (int j = 0; j < this.x[i].length; j++)
                System.out.print(this.x[i][j]+"\t");
            System.out.println();
        }
    }
    
   public int[][] sumaMatrices(int[][]y){
       
       int[][]z=new int[this.x.length][this.x[0].length];
       for (int i = 0; i < this.x.length; i++)
            for (int j = 0; j < this.x[i].length; j++)
                z[i][j]=x[i][j] + y[i][j];
       
       return z;
   }
   
   public int[][] obtenerMatriz(){
       int[][]z=new int[this.x.length][this.x[0].length];
       for (int i = 0; i < this.x.length; i++)
            for (int j = 0; j < this.x[i].length; j++)
                z[i][j]=x[i][j];
       return z;
   }
}


