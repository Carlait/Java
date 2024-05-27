//Feita por Nathan Ramos 22/05
//Algoritmo le 10 números inteiros e coloca em ordem descrescente
package AT5;

import java.util.Scanner;

public class AT19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];

        // Preenchendo o vetor com números inteiros
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número inteiro para a posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        // Ordenando o vetor em ordem decrescente usando Bubble Sort
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Exibindo os dois vetores
        System.out.println("\nVetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor ordenado em ordem decrescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            ler.close();
        }
    }
}

