public class Ciclo2 {
     
    public static void main(String[] args) {
        
    	int a=5;
        for(int x= 0, y= (a*2)-1; y>0; x++, y-= 2){
            for(int i=0; i <x; i++){
                System.out.print(" ");
            }
            for(int j=y; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}