//Feita por Nathan Ramos 22/05
//Atividade para ler 6 idades e adicionar 3 anos para cada idade e imprimir elas.
package AT5;

import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] idades = new int[6]; // Vetor para armazenar as idades

        // Lê as 6 idades
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
        }

        // Adiciona 3 anos a cada idade
        for (int i = 0; i < 6; i++) {
            idades[i] += 3;
        }

        // Imprime as novas idades
        System.out.println("Novas idades:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Pessoa " + (i + 1) + ": " + idades[i] + " anos");
           ler.close();
            
        }
    }
}

