/*
 * Autor:Honggang wu
 * Data:   dd/mm/aa
 * Versió: 1.0
 */

/*
 * P1 - Prog 25-26
 * Exercici 26.	Feu un programa que indiqui si una paraula entrada per teclat és palíndrom.
 * No es pot suposar que totes les lletres de la paraula s’escriuen en minúscula.
 * Recorda que hi ha un mètode toLowerCase() de la classe String.
 * Per exemple: la paraula “Refer” ha de sortir com palíndrom, i “ahir”
 * ha de sortir com no palíndrom (Palindrom.java)
 */

/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
         Refer       | es palindrom
         ahir        | no es palindrom
                     |
  		             |
*/
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
	String frase,fraseLimpia;
        Scanner teclat=  new Scanner(System.in);
	System.out.println("Entra una frase");
	frase=teclat.nextLine();
	fraseLimpia=limpiarFrase(frase);
	System.out.println(fraseLimpia);
    }
    public static boolean palindrom(String cadena){
        int n= cadena.length();
	for(int i=0;i<(n/2);i++){
	if(cadena.charAt(i)==cadena.charAt(n-1-i)){
		return true;
		}
   	}
	return false;
    }

    public static String limpiarFrase(String cadena){
    	int n=cadena.length();
	String lletres="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i=0; i<n;i++){
			char c= cadena.charAt(i);
			if (lletres.indexOf(c)!=-1){
				
			}
		}
	return cadena;
    }

    public float vocals(String cadena){
    	int primeravocal=-1;
	float contvocal=0;
        String vocals="aeiouAEIOU";
        int n=cadena.length();
        for(int i=0;i<n;i++){
                char c=cadena.charAt(i);
                if (vocals.indexOf(c)!=-1){
                        contvocal++;
			if(cont==1){
				primeravocal=i;
			}
		
                }
        }

	String lletres="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        float cont	
	for (int i=0; i<n;i++){
                        char c= cadena.charAt(i);
                        if (lletres.indexOf(c)!=-1){
                           	cont++;     
                        }
                }
	System.out.println("Posicio de la primera vocal: "+ primeravocal);
	System.out.println("Posicio de la ultima vocal: "+ contvocal)
        float
		return cont;

    }
	
	   
}
