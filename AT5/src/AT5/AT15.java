//Feita por Nathan Ramos 22/05
//Atividade ira armazenar 20 numeros a multiplicação do primeiro pelo inverso do segundo
package AT5;

import java.util.Scanner;

public class AT15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] vetor1 = new double[20];
        double[] vetor2 = new double[20];
        double[] resultado = new double[20];

        // Preenchendo os vetores
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número para o vetor 1 na posição " + i + ": ");
            vetor1[i] = ler.nextDouble();

            System.out.print("Digite um número para o vetor 2 na posição " + i + ": ");
            vetor2[i] = ler.nextDouble();
        }

        // Realizando a operação: multiplicação do vetor1 pelo inverso do vetor2
        for (int i = 0; i < 20; i++) {
            resultado[i] = vetor1[i] * vetor2[19-i];
        	}

        // Exibindo o resultado
        System.out.println("\nResultado da multiplicação do vetor1 pelo inverso do vetor2:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Posição " + i + ": " + resultado[i]);
            ler.close();
        }
    }
}
