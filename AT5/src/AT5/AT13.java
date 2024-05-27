//Feita por Nathan Ramos 22/05
//Atividade que tem dois vetores com 10 números cada decididos pelo usuário e contendo as quatro operações aritimeticas em qualquer combinação
package AT5;

import java.util.Scanner;

public class AT13 {

    public static void main(String[] args) {
        // Declaração e inicialização dos vetores
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorResultado = new int[10];
        char[] operacoes = new char[10];

        // Cria um objeto Scanner para leitura da ler do usuário
        Scanner ler = new Scanner(System.in);

        // Preenchendo os vetores com valores inteiros
        System.out.println("Digite 10 números inteiros para o vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = ler.nextInt();
        }

        System.out.println("Digite 10 números inteiros para o vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = ler.nextInt();
        }

        // Preenchendo o vetor de operações com caracteres (+, -, *, /)
        System.out.println("Digite 10 operações (+, -, *, /) para cada par de elementos dos vetores:");
        for (int i = 0; i < operacoes.length; i++) {
            operacoes[i] = ler.next().charAt(0); // Pega apenas o primeiro caractere
            ler.nextLine(); // Consumir quebra de linha
        }

        // Realizando as operações e armazenando os resultados
        for (int i = 0; i < operacoes.length; i++) {
            switch (operacoes[i]) {
                case '+':
                    vetorResultado[i] = vetor1[i] + vetor2[i];
                    break;
                case '-':
                    vetorResultado[i] = vetor1[i] - vetor2[i];
                    break;
                case '*':
                    vetorResultado[i] = vetor1[i] * vetor2[i];
                    break;
                case '/':
                    if (vetor2[i] != 0) {
                        vetorResultado[i] = vetor1[i] / vetor2[i];
                    } else {
                        System.out.println("Erro: Divisão por zero na posição " + i);
                        vetorResultado[i] = 0; // Define um valor padrão para a divisão por zero
                    }
                    break;
                default:
                    System.out.println("Operação inválida na posição " + i);
                    vetorResultado[i] = 0; // Define um valor padrão para operação inválida
            }
        }

        // Imprimindo o vetor resultante
        System.out.println("\nVetor resultante das operações:");
        for (int elemento : vetorResultado) {
            System.out.print(elemento + " ");
            ler.close();
        }
    }
}
