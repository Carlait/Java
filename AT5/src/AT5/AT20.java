//Feita por Nathan Ramos 22/05
//Algoritmo le 80 números e encontra o maior e menor e suas posições no vetor
package AT5;

import java.util.Scanner;

public class AT20{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 80;
        int[] vetor = new int[tamanho];
        int menor = Integer.MAX_VALUE; // Inicializa com o maior valor possível
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int posicaoMenor = -1;
        int posicaoMaior = -1;

        // Leitura dos elementos
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o %dº elemento: ", i + 1);
            vetor[i] = ler.nextInt();

            // Verifica se é o menor ou o maior elemento
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
ler.close();
        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.printf("Menor elemento: %d (posição %d)\n", menor, posicaoMenor);
        System.out.printf("Maior elemento: %d (posição %d)\n", maior, posicaoMaior);
    }
}

