//Feita por Nathan Ramos 22/05
//Atividade armazena descrição de 5 produtos e seu valor de venda e atualiza eles com percentual de 10%
package AT5;

import java.util.Scanner;

public class AT12 {

    public static void main(String[] args) {
        // Declaração de arrays para descrições e preços de venda
        String[] descricoes = new String[5];
        double[] precosVenda = new double[5];

        // Cria um objeto Scanner para leitura da ler do usuário
        Scanner ler = new Scanner(System.in);

        // Preenchendo as descrições dos produtos
        System.out.println("Digite as descrições de 5 produtos:");
        for (int i = 0; i < descricoes.length; i++) {
            descricoes[i] = ler.nextLine();
        }

        // Preenchendo os preços de venda dos produtos
        System.out.println("Digite os preços de venda dos produtos:");
        for (int i = 0; i < precosVenda.length; i++) {
            precosVenda[i] = ler.nextDouble();
            ler.nextLine(); // Consumir quebra de linha
        }

        // Aplicando o aumento de 10% nos preços de venda
        for (int i = 0; i < precosVenda.length; i++) {
            precosVenda[i] *= 1.1; // Multiplica por 1.1 para aplicar o aumento
        }

        // Imprimindo as descrições e os novos preços de venda
        System.out.println("\nDescrições e novos preços de venda:");
        for (int i = 0; i < descricoes.length; i++) {
            System.out.printf("%s: R$ %.2f\n", descricoes[i], precosVenda[i]);
            ler.close();
        }
    }
}

