/*
 *
 * @author  Prof. prog I
 * @date    Sep. 21
 * @version 1.0
 */

/*
 * Un nombre narcisista és tot aquell nombre que és igual a la suma de cadascun dels seus mateixos dígits elevat al
 * nombre total de dígits. Per exemple el número 153 és narcisista ja que aquest posseeix 3 dígits i la suma de
 * cadascun dels seus dígits elevat a 3 és igual a 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. Altres exemples són els
 * nombres 370, 371 o el 407.
 * Escriu un mètode esNarcisista() que ens diu si un nombre de 3 xifres és narcisista o no ho és.
 * Al mètode main() has de sol·licitar per teclat un nombre en un interval (MIN=100, MAX=999) i mostrar un
 * missatge per pantalla dient si és o no nombre narcisista. Si l’usuari no introdueix un nombre en aquest interval, has
 * de tornar a sol·licitar el nombre tantes vegades com sigui necessari. No oblidis escriure la taula de tests que
 * s’indica avall.
 * Exemple d’execució (La entrada per teclat s’indica subrayat i en cursiva. La sortida del vostre programa ha de tenir
 * aquest mateix format):
 * Entra un nombre a l'interval [100,999]: -10
 * Entra un nombre a l'interval [100,999]: 200000
 * Entra un nombre a l'interval [100,999]: 153
 * El nombre 153 es un nombre narcisista
 */
import java.util.*;

public class Narcisista
{
   public static void main(String args[]){
      int n, sum = 0, r;
      final int MIN = 100, MAX = 999;

      Scanner sc = new Scanner(System.in);

      System.out.print("Entra un nombre a l'interval [100, 999]: ");
      n = sc.nextInt();
      while (!(n >= MIN && n<= MAX)){
        System.out.print("Entra un nombre a l'interval [100, 999]: ");
        n = sc.nextInt();
      }

      if ( esNarcisista(n))
         System.out.println("El número " + n + " es narcisista");
      else
         System.out.println("El número " + n + " no es narcisista");
   }
   
   /*
       n         retorna
 --------------------------
      153   |      true
       34   |      false
     
  */
   static boolean esNarcisista(int n){
    int r, sum = 0, temp;

    /*
      Primer: temp=n
      Seg (temp): temp/=10
      FiSeq: temp == 0
      Cerca: sum >= n
     */
    temp = n;
    while( temp != 0 && sum < n)
    {
         r = temp % 10;
         sum = sum + (r*r*r);
         temp = temp/10;
    }
    return sum == n;
  }
   
   

}


