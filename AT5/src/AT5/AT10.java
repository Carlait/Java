//Feita por Nathan Ramos 22/05
//Atividade para armazenar em 20 números no total e somar eles
package AT5;

import java.util.Scanner;

public class AT10 {

    public static void main(String[] args) {
        // Declara e inicializa dois vetores com 10 elementos cada
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[10]; // Vetor para armazenar a soma

        // Cria um objeto Scanner para leitura da entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Preenchendo o primeiro vetor
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = ler.nextInt();
        }

        // Preenchendo o segundo vetor
        System.out.println("Digite 10 números inteiros para o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = ler.nextInt();
        }

        // Realizando a soma dos elementos e armazenando no terceiro vetor
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        // Imprimindo o vetor resultante
        System.out.println("Vetor resultante da soma:");
        for (int elemento : vetorSoma) {
            System.out.print(elemento + " ");
            ler.close();
        }
    }
}
