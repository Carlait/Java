package atv;

import java.util.Scanner;

public class AT7 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	final double CustoL = 50.0;
    	final double LitrosL = 5.0;
    	final double RendimentoL= 3.0;
    	System.out.println("Digite a área a do cômodo(em m2): ");
    	double areaC = ler.nextDouble();
    	double LitrosN = areaC/RendimentoL;
    	double LatasN = Math.ceil(LitrosN/LitrosL);
    	double CustoTotal = LatasN*CustoL;
    	System.out.printf("Quantidade de latas(5L) necessárias: %.0f\n",LatasN);
    	System.out.printf("Custo Total para pintar: R$ %.2f\n", CustoTotal);   	
    	
}
}
//Atividade para calcular quantas latas de tinta para pintar um comodo e o custo total