//Algoritmo básico para digitar "arara"
package atividades;
import java.util.Scanner;

public class AT7 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println(" Digite as letras a e r: ");
		String a = ler.nextLine(), r = ler.nextLine();
		System.out.println(a+r+a+r+a);
		ler.close();
				
	}

}
