//Feita por Nathan Ramos 22/05
//Atividade armazena 5 números digitados em um vetor e os mesmo números +2 no segundo vetor e imprimi ambos no final
package AT5;

import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor1 = new int[5]; // Vetor para armazenar os números digitados
        int[] vetor2 = new int[5]; // Vetor para armazenar os números somados

        // Lê os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor1[i] = scan.nextInt();
        }

        // Adiciona 2 a cada número do primeiro vetor e armazena no segundo vetor
        for (int i = 0; i < 5; i++) {
            vetor2[i] = vetor1[i] + 2;
        }

        // Imprime os números do primeiro vetor
        System.out.println("Números do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println(); // Pula uma linha

        // Imprime os números do segundo vetor
        System.out.println("Números do segundo vetor (com soma de 2):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor2[i] + " ");
            scan.close();
        }
    }
}
