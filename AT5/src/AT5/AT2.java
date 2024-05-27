//Feita por Nathan Ramos 22/05
//Ativida para ler 5 números. armazenar, imprimir e somar
package AT5;

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        // Cria um vetor para armazenar os números
        int[] numeros = new int[5];
        
        // Lê os números do usuário
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Calcula a soma dos números
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += numeros[i];
        }
        
        // Imprime os números e a soma
        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}

