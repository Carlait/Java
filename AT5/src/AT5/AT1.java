//Feita por Nathan Ramos 22/05
//Atividade ler 5 números inteiros, armazenar e imprimir
package AT5;


import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        // Cria um vetor para armazenar os números
        int[] numeros = new int[5];
        
        // Lê os números do usuário
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Imprime os números
        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            scanner.close();
         
        }
    }
}

