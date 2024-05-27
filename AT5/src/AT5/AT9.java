//Feita por Nathan Ramos 22/05
//Atividade para armazenar 5 números e encontrar em qual posição o número está
package AT5;

import java.util.Scanner;

public class AT9 {

    public static void main(String[] args) {
        // Declara e inicializa vetor de inteiros com 5 elementos
        int[] vetor = new int[5];

        // Lê 5 valores inteiros do teclado e armazena no vetor
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        // Solicita ao usuário a digitação do número a ser buscado
        System.out.println("Digite o número que deseja buscar:");
        int numeroBuscado = entrada.nextInt();

        // Variável para armazenar a posição do número encontrado (inicializada com -1)
        int posicao = -1;

        // Percorre o vetor em busca do número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                posicao = i;
                break; // Sai do loop ao encontrar o número
            }
        }

        // Verifica se o número foi encontrado
        if (posicao != -1) {
            System.out.println("O número " + numeroBuscado + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado no vetor.");
            entrada.close();
        }
    }
}


