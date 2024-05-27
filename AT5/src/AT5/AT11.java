//Feita por Nathan Ramos 22/05
//Armazenar 10 números em x e y e unir todos em z
package AT5;

import java.util.Scanner;

public class AT11 {

    public static void main(String[] args) {
        // Declaração e inicialização dos vetores
        int[] x = new int[10];
        int[] y = new int[10];
        int[] z = new int[20]; // Vetor para unir x e y

        // Cria um objeto Scanner para leitura da ler do usuário
        Scanner ler = new Scanner(System.in);

        // Preenchendo o vetor x
        System.out.println("Digite 10 números inteiros para o vetor x:");
        for (int i = 0; i < x.length; i++) {
            x[i] = ler.nextInt();
        }

        // Preenchendo o vetor y
        System.out.println("Digite 10 números inteiros para o vetor y:");
        for (int i = 0; i < y.length; i++) {
            y[i] = ler.nextInt();
        }

        // Unindo os vetores x e y no vetor z
        int j = 0; // Índice para o vetor z
        for (int i = 0; i < x.length; i++) {
            z[j++] = x[i]; // Copia elemento de x para z
        }
        for (int i = 0; i < y.length; i++) {
            z[j++] = y[i]; // Copia elemento de y para z
        }

        // Imprimindo o vetor resultante z
        System.out.println("Vetor resultante da união:");
        for (int elemento : z) {
            System.out.print(elemento + " ");
            ler.close();
        }
    }
}
