//02-09-2021
//Arreglos 2 con clases

import java.util.Scanner;
//import java.util.Scanner;
public class Arreglo2{//Clase HolaMundo
   
    
    public static void main(String[] args) { //Método main
        Scanner scan = new Scanner(System.in);
        int n;
        final int inf=1,sup=6;
        System.out.print("Ingresa tamaño del arreglo: ");
        n = scan.nextInt();
        Arreglo a = new Arreglo();
        a.setArraySize(n);
        a.setFreqSize(sup+1);
        a.llenarArreglo(inf, sup);
        a.imprimeArreglo();
        System.out.println("Media: " + a.mediaAritmetica());
        a.ordenamientoBurbuja();
        a.imprimeArreglo();
        System.out.println("Mediana: " + a.mediana());
        a.frecuencias();
    }    
}

class Arreglo{
    private int x;
    private int[] array;
    private int[] freqs;
    
    public void Arreglo(){//Constructor
        
    }
    
    public void setArraySize(int x){
        this.x = x;
        this.array = new int[this.x];
    }
    
    public void setFreqSize(int x){
        this.freqs = new int[x];
    }
    
    public void llenarArreglo(int inf,int sup){
        for(int i=0;i<this.array.length;i++){
            this.array[i] = (int)(Math.random()*sup) + inf;
        }
    }
    
    public void imprimeArreglo(){
        for(int i=0;i<this.array.length;i++){
            if(i%10 == 0)System.out.println();
            System.out.print(this.array[i]+"  ");
        }            
        System.out.println();
    }
    
    public double mediaAritmetica(){
        double suma=0.0;
        for(int i=0;i<this.array.length;i++){
            suma = suma + this.array[i];
        }
        return suma/this.array.length;
    } 
    
    public void ordenamientoBurbuja(){
        int tmp;
        for(int i=1;i<=this.array.length;i++)
            for(int j=0;j<=this.array.length-i-1;j++)
                if(this.array[j]>this.array[j+1]){
                    tmp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = tmp;
                }
    }
    // 1 2 3 4 5 mediana=3, n=5 impar
    // 1 2 3 4 5 6 mediana=(3+4)/2=3.5, n=6 par
    public double mediana(){
        double mediana;
        this.ordenamientoBurbuja();
        if(this.array.length%2 == 0){//numero par de elementos
            mediana = (this.array[this.array.length/2 - 1]+this.array[this.array.length/2])/2.0;
        }else{
            mediana = (double)(this.array[(this.array.length-1)/2]);
        }
        return mediana;
    }
    
    public void frecuencias(){
        int mayor,n=0;
        for(int i=0;i<this.freqs.length;i++)//inicializamos freqs con ceros
            freqs[i]=0;
        
        for(int i=0;i<this.array.length;i++){//se hace conteo
            this.freqs[this.array[i]]++;
        }
        
        System.out.println("Frecuencias");
        for(int i=1;i<this.freqs.length;i++){
            System.out.println(i+": "+freqs[i]);
        }
        
        mayor = freqs[0];
        for(int i=1;i<this.freqs.length;i++)
            if(mayor<freqs[i]){
                mayor = freqs[i];
                n=i;
            }
        System.out.println("La moda es "+n+" con "+mayor);
    }
    
}
