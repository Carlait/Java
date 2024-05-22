package atv;

import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	System.out.println("Digite a capacidade do tanque do véiculo(em litros): ");
    	double CapTanque = ler.nextDouble();
    	System.out.println("Digite a quantidade de litros gastos na sua última viagem(Ou litros abastecidos): ");
    	double Litros = ler.nextDouble();
    	System.out.println("Digite a Quilometragem percorrida desde da sua última viagem: ");
    	double KMpercorrida = ler.nextDouble();
    	
    	double Consumo = KMpercorrida/Litros;        
        System.out.printf("Consumo médio: %.2f KM/L\n", Consumo);
        double Autonomia = (CapTanque - Litros)*Consumo;
        System.out.printf("Autonomia restante: %.2f KM\n", Autonomia);  	
    	
}
}
//Atividade para calcular consumo médio de um e autonomia de um véiculo 