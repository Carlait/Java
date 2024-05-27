//Feita por Nathan Ramos 22/05
//Algoritmo le 10 números inteiros e ordena em ordem crescente
package AT5;

import java.util.Scanner;
import java.util.Arrays;

public class AT18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];

        // Preenchendo o vetor com números inteiros
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número inteiro para a posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        // Ordenando o vetor em ordem crescente
        Arrays.sort(vetor);

        // Exibindo os dois vetores
        System.out.println("\nVetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            ler.close();
        }
    }
}

