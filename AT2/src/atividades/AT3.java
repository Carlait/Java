//Algoritmo que armazena letras digitadas e as imprimi separadas
package atividades;
import java.util.Scanner;

public class AT3 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite as letras a sua escolha:");
			String letra1 = ler.nextLine(), letra2 = ler.nextLine(), letra3 = ler.nextLine(), letra4 = ler.nextLine(), letra5 = ler.nextLine();
			System.out.println("Letras digitadas foram: " + letra1 + letra2 + letra3 + letra4 + letra5);
			System.out.println("Letras separadas: \n" +letra1 + "\n" +letra2 + "\n" + letra3 + "\n" +letra4 +"\n"+ letra5 +"\n");
		}
	}

}
