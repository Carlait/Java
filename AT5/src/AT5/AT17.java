//Feita por Nathan Ramos 22/05
//Algoritmo que le 20 números e revele quantos números pares existem entre os escolhidos
package AT5;

import java.util.Scanner;



public class AT17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[20];
        int qtdeNumerosPares = 0;

        // Preenchendo o vetor com números inteiros
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número inteiro para a posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        // Contando os valores pares
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                qtdeNumerosPares++;
            }
        }

        // Exibindo o resultado
        System.out.println("Quantidade de valores pares no vetor: " + qtdeNumerosPares);
        ler.close();
    }
}
