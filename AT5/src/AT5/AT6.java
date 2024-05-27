//Feita por Nathan Ramos 22/05
//Atividade armazena dois vetores com 10 números cada no terceiro vetor soma e mostra o resultado invertido
package AT5;

import java.util.Scanner;

public class AT6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor1 = new int[10]; // Primeiro vetor
        int[] vetor2 = new int[10]; // Segundo vetor
        int[] vetorResultado = new int[10]; // Terceiro vetor

        // Lê os 10 números para o primeiro vetor
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor1[i] = scan.nextInt();
        }

        // Lê os 10 números para o segundo vetor
        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor2[i] = scan.nextInt();
        }

        // Soma os elementos dos vetores e armazena no vetorResultado (invertido)
        for (int i = 0; i < 10; i++) {
            vetorResultado[9 - i] = vetor1[i] + vetor2[i];
        }

        // Imprime o vetor resultante
        System.out.println("Vetor resultante (invertido):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultado[i] + " ");
            scan.close();
        }
    }
}
