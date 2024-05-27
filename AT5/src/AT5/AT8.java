//Feita por Nathan Ramos 22/05
//Atividade para ler 5 números e multiplicar por 10 quando for impar.
package AT5;

import java.util.Scanner;

public class AT8 {
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
            if (vetor[i] % 2 != 0) {
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
