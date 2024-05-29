//Algoritmo de somas parciais 
package atividades;
import java.util.Scanner;
public class AT6 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		float soma1, soma2, soma3, soma4;
		System.out.println("Digite os numeros: ");
		float n1 = ler.nextFloat(), n2 = ler.nextFloat(), n3 = ler.nextFloat();
		soma1 = n1+n2;
		System.out.println("Soma Parcial 1: " + soma1 + "\n");
		soma2 = n1+n3;
		System.out.println("Soma Parcial 2: " + soma2 + "\n");
		soma3 = n2+n3;
		System.out.println("Soma Parcial 3: " + soma3 + "\n");
		soma4 = n1+n2+n3;
		System.out.println("Soma Parcial 4: " + soma4 + "\n");
		ler.close();
	
	}

}
