//Algoritmo para divisão e resto
package atividades;
import java.util.Scanner;

public class AT9 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int divisao, resto;
		System.out.println("Digite os números: ");
		int n1 = ler.nextInt(), n2 = ler.nextInt();
		divisao = n1/n2;
		System.out.println("Divisão dos numeros: "+divisao+ "\n");
		resto = n1%n2;
		System.out.println("Resto: "+resto+"\n");		
		ler.close();
		
	}

}
