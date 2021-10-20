//07-09-2021
//Arreglos 2 con clases
import java.util.Scanner;
public class Strings{//Clase 


	public static void main(String[] args) {
		String str1="Hola Mundo jovenes de ICO";
		String str2=", hoy es una dia soleado";
		String str3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cadena 1: ");
		str1=scan.nextLine();
		System.out.println("Ingrese la cadena 2: ");
		str2=scan.nextLine();
		Auxiliar aux = new Auxiliar();
		str3 = aux.concatenar(str1,str2);
		//aux.concatenar(str1,str2);
		System.out.println(str3);
		str3=aux.invertirCadena(str1);
		System.out.println(str3);
		str3=aux.invertirCase(str1);
		System.out.println(str3);
		str3=aux.toUpperCase(str2);
		System.out.println(str3);
		str3=aux.toLowerCase(str2);
		System.out.println(str3);
		str3=aux.sinEspacios(str2);
		System.out.println(str3);
		
		str1=aux.toLowerCase(str1);
		str1=aux.sinEspacios(str1);
		if(aux.esPalindromo(str1))
			System.out.println("Es Palindromo");
		else System.out.println("No es Palindromo");


		str1=aux.sinVocales(str1);
		System.out.println(str1);

		if(aux.esIgual(str1,str2)){
			System.out.println("Son cadenas Iguales");
		}
		else{
			System.out.println("Son cadenas Distintas");
		}
		
		//System.out.println(str1.toLowerCase());
		//System.out.println(str1.toUpperCase());

	}
}
   
class Auxiliar{
	private String c1;
	private String c2;
	private String c3;


	public void Auxiliar(){	//Constructor

	}
	public String concatenar(String str1, String str2){
		char c1[] = new char[str1.length()];
		char c2[] = new char[str2.length()];
		char c3[] = new char[str1.length()+ str2.length()];
		int i;
		c1=str1.toCharArray();
		c2=str2.toCharArray();
		
		for(i=0; i<str1.length(); i++)
			c3[i] = c1[i];

		for(int j=0; j<str2.length(); j++,i++)
			c3[i]=c2[j];

		return String.valueOf(c3);
	}
	public String invertirCadena(String str){
		char c1[]= new char[str.length()];
		char c2[]= new char[str.length()];
		c1=str.toCharArray();
		int j=str.length()-1;
		//for(int i=0; int j=(str.length()-1); i<str.length(); i++,j--)
		for(int i=0; i<str.length(); i++,j--)
			c2[j]=c1[i];

		return String.valueOf(c2);

	}
	public String invertirCase(String str){
		int offset='a'- 'A';
		//System.out.println(offset);	//valor de las pala
		char c1[]=new char[str.length()];
		c1=str.toCharArray();
		for(int i=0; i<str.length(); i++)
			if(c1[i]>'A' && c1[i]<='Z') c1[i]+=offset;
			else if(c1[i]>='a' && c1[i]<='z') c1[i]-=offset;
			else continue;
			return String.valueOf(c1);
	}
	public String toUpperCase(String str){
   		//rreglo de caracteres de la cadena str
   		char c1[] = new char[str.length()];
   		c1=str.toCharArray();
   		for(int i=0; i<str.length(); i++)
   			if(c1[i]>='a' && c1[i]<='z') c1[i]-=('a'-'A');	//  
    	return String.valueOf(c1);
	}
	public String toLowerCase(String str){
   		//rreglo de caracteres de la cadena str
   		char c1[] = new char[str.length()];
   		c1=str.toCharArray();
   		for(int i=0; i<str.length(); i++)
   			if(c1[i]>='A' && c1[i]<='Z') c1[i]+=('a'-'A');	//  
    	return String.valueOf(c1);
	}

	public String sinEspacios(String str){
		char c1[] = new char[str.length()];
   		c1=str.toCharArray();
   		int ctr =0;
   		for(int i=0; i<str.length(); i++)
   			if(c1[i]==' ')ctr++;

   		char c2[]= new char[str.length()-ctr];
   		for(int i=0, j=0; i<str.length();i++)
   			if(c1[i]==' ')continue;
   			else {
   				c2[j]=c1[i];
   				j++;
   			}
   		return String.valueOf(c2);
	}
	public boolean esPalindromo(String str){
		char c[]= new char[str.length()];
		c=str.toCharArray();
		for(int i=0, j=str.length()-1; i<str.length(); i++,j--)
			if(c[i]==c[j])continue;
		else return false;
		return true;
	}
	public String sinVocales(String str){
		char c1[] = new char[str.length()];
   		c1=str.toCharArray();
   		int ctr =0;
   		for(int i=0; i<str.length(); i++)
   			if(c1[i]== 'a' || c1[i]=='e' || c1[i]=='i'|| c1[i]=='o'|| c1[i]=='u' ||
   				c1[i]=='A' || c1[i]=='E' || c1[i]=='I'|| c1[i]=='O'|| c1[i]=='U')ctr++;

   		char c2[]= new char[str.length()-ctr];
   		for(int i=0, j=0; i<str.length();i++)
			if(c1[i]=='a' || c1[i]=='e' || c1[i]=='i'|| c1[i]=='o'|| c1[i]=='u' ||
   				c1[i]=='A' || c1[i]=='E' || c1[i]=='I'|| c1[i]=='O'|| c1[i]=='U')continue;
   			else {
   				c2[j]=c1[i];
   				j++;
   			}
   		return String.valueOf(c2);
	}
	public boolean esIgual(String s1, String s2){

		if(s1.length()!=s2.length())
			return false;
		char c1[]= new char[s1.length()];
		char c2[]= new char[s2.length()];
		c1=s1.toCharArray();
		c2=s2.toCharArray();
		
		for(int i=0; i<s1.length(); i++)
			if(c1[i]==c2[i])continue;
		else return false;
		return true;
	}

}
