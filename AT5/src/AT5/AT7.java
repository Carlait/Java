//Feita por Nathan Ramos 22/05
//Atividade para ler e armazenar 5 números e nos indices impares multplicar por 10
package AT5;

import java.util.Scanner;

public class AT7 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 5;
        int[] vetor = new int[tamanho];

        // Leitura dos números
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = ler.nextInt();
        }

        // Atualização dos números ímpares
        for (int i = 0; i < tamanho; i++) {
        	if (i % 2 == 0) {
        	    vetor[i] *= 10;
        	}
        }

        // Exibição do vetor atualizado
        System.out.println("\nVetor atualizado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
            ler.close();
        }
    }
}