package atv;

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	float custo, quant, total;
    	System.out.println("Digite a quantidade do produto: ");
    	quant=ler.nextFloat();
    	System.out.println("Digite o custo: ");
    	custo=ler.nextFloat();
    	total = custo * quant;
    	System.out.println("Total: "+total);
}
}
//Atividade para calcular o custo total de múltiplos produtos