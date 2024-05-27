//Feita por Nathan Ramos 22/05
//Algoritmo o produto do primeiro vetor pelo inverso do segundo é armazenado a partir do centro para as bordas de modo alternado
package AT5;

import java.util.Scanner;

public class AT16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] vetor1 = new double[20];
        double[] vetor2 = new double[20];
        double[] resultado = new double[20];

        // Preenchendo os vetores com números reais
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número real para o vetor 1 na posição " + i + ": ");
            vetor1[i] = ler.nextDouble();

            System.out.print("Digite um número real para o vetor 2 na posição " + i + ": ");
            vetor2[i] = ler.nextDouble();
        }

        // Realizando a operação: multiplicação do vetor1 pelo inverso do vetor2
        for (int i = 0; i < 20; i++) {
            resultado[i] = vetor1[i] * vetor2[i];
        }

        // Armazenando o resultado a partir do centro para as bordas
        int centro = 10;
        for (int i = 0; i < centro; i++) {
            resultado[i] = resultado[centro - i - 1];
            resultado[19 - i] = resultado[centro + i];
        }

        // Exibindo o resultado
        System.out.println("\nResultado da operação (armazenado do centro para as bordas):");
        for (int i = 0; i < 20; i++) {
            System.out.println("Posição " + i + ": " + resultado[i]);
            ler.close();
        }
    }
}

