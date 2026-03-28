/*
 * Autor:  Nom Cognom1 Cognom2
 * Data:   dd/mm/aa
 * Versió: 1.0
 */

/*
 * Feu un programa per gestionar
 * l'assignació d'estudiants a grups de pràctiques. El programa ha de
 * llegir un nombre natural n (nombre d'estudiants) i tot seguit llegir
 * una seqüència de n estudiants, cadascun identificat pel seu nom (una
 * paraula) i la seva nota d'entrada (un nombre enter entre 0 i 100).
 * El programa ha de distribuir els estudiants en 3 grups seguint aquest
 * criteri:
 *
 * Grup A: Estudiants amb nota >= 70
 * Grup B: Estudiants amb nota entre 40 i 69 (inclosos)
 * Grup C: Estudiants amb nota < 40
 *
 * Després de la distribució, el programa ha de:
 *
 * 1. Mostrar quants estudiants hi ha a cada grup
 * 2. Mostrar els noms dels estudiants de cada grup
 *
 * Per resoldre l'exercici, haureu d'implementar els mètodes
 * següents:
 *
 * - static int[][] distribuirEstudiants(String[] noms, int[] notes, int n)
 *   Aquest mètode rep els arrays de noms i notes dels estudiants, i el
 *   nombre n d'estudiants. Retorna una matriu d'enters de dimensió 3xn
 *   on les files 0, 1 i 2 contenen els índexs dels estudiants dels
 *   grups A, B i C, respectivament. Els índexs no utilitzats en cada
 *   fila tenen el valor -1.
 *
 * - static int comptarEstudiants(int[] grup)
 *   Compta quants estudiants hi ha en un grup, donat el array amb els
 *   índexs dels estudiants del grup.
 *
 * - static void mostrarGrup(String[] noms, int[] grup, String nomGrup)
 *   Mostra per pantalla els estudiants d'un grup, donat l'Array amb els
 *   noms dels estudiants, l'Array amb els índexs dels estudiants del
 *   grup i un String amb el nom del grup que volem que es visualitzi
 *   (A, B o C).
 *
 * (GestioGrups.java)
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el nombre d'estudiants:");
        int n = sc.nextInt();

        String[] noms = new String[n];
        int[] notes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nom de l'estudiant " + (i + 1) + ":");
            noms[i] = sc.next();

            System.out.println("Nota d'entrada (0-100):");
            notes[i] = sc.nextInt();
        }

        int[][] grups = distribuirPerNOm(noms, n);


        mostrarGrup(noms, grups[0], "A");

	int notaGrupA=notaMaxima(notes,grups[0]);
	System.out.println(notaGrupA);

        mostrarGrup(noms, grups[1], "B");
	int notaGrupB=notaMaxima(notes,grups[1]);
	System.out.println(notaGrupB);

        mostrarGrup(noms, grups[2], "C");
	int notaGrupc=notaMaxima(notes,grups[2]);
	System.out.println("La nota maxima es "+ notaGrupc);

	System.out.println("Introdueix el nom de la persona a cercar: ");
	String nomBuscar=sc.nextLine();
    }
    public static int[][] distribuirPerNOm(String[] noms, int n) {
        int[][] grups = new int[3][n];
        char primeraLletra;
        int numLLetra;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                grups[i][j] = -1;
            }
        }
        int posA = 0, posB = 0, posC = 0;

        for(int i=0;i<n;i++){
            primeraLletra= noms[i].charAt(0);
            numLLetra = (int)primeraLletra;

            if(numLLetra >=65 && numLLetra <=72){
                grups[0][posA] = i;
                posA++;
            }
            else if(numLLetra >=73 && numLLetra <=80){
                grups[1][posB] = i;
                posB++;
            }else {
                grups[2][posC] = i;
                posC++;
            }
        }

        return grups;
    }

    public static int notaMaxima(int[] notes, int[] grup) {
        int notaMax = -1;
        for (int i = 0; i < grup.length; i++) {
            if (notes[i] > notaMax) {
                notaMax = notes[i];
            }
        }
        return notaMax;
    }

    public static String grupDeEstudiant(String[]noms, int[][] distribucio, String nomBuscat) {
       return null;
    }

    public static int comptarEstudiants(int[] grup) {
        int count = 0;
        for (int idx : grup) {
            if (idx != -1) count++;
        }
        return count;
    }

    public static void mostrarGrup(String[] noms, int[] grup, String nomGrup) {
        System.out.println("Grup " + nomGrup);

        for (int idx : grup) {
            if (idx != -1) {
                System.out.println(noms[idx]);
                
            }
        }
    }
}
