package atv;

import java.util.Scanner;

public class AT8 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	System.out.println("Digite o valor da prestação em atraso: ");
    	double Valor = ler.nextDouble();
    	double acrescimo = Valor * 0.15;
    	double ValorT = acrescimo+Valor;
    	double ValorD = ValorT*0.15;
    	double ValorF = ValorT-ValorD;
    	double Preju = acrescimo-ValorD;
    System.out.printf("Valor da prestação em atraso R$ %.2f\n",Valor);
    System.out.printf("Acréscimo de 15%% : R$ %.2f\n",acrescimo);
    System.out.printf("Valor total com acréscimo: R$ %.2f\n",ValorT);
    System.out.printf("Desconto:  R$ %.2f\n",ValorD);
    System.out.printf("Valor final a pagar: R$ %.2f\n",ValorF);
    System.out.printf("Prejuízo do comerciante MALUCO: R$ %.2f\n", Preju);
}
}
//Calcular prejuizo e os valores para definir o prejuizo