package atv;

import java.util.Scanner;

public class AT6 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	System.out.println("Digite o custo de fábrica: ");
    	double Custo = ler.nextDouble();
    	double ValorD = Custo * 0.12;
    	double ValorI = Custo * 0.45;
    	double CustoTotal = Custo + ValorD + ValorI;
    	System.out.printf("Valor pago á distribuidora: R$ %.2f\n", ValorD);
    	System.out.printf("Valor dos Impostos: R$ %.2f\n", ValorI);
    	System.out.printf("Custo Total: R$ %.2f\n",CustoTotal); 	
    	
}
}
//Atividade para calcular valores de um produto contendo: valor de Imposto, valor da Distruibuidora e custo total