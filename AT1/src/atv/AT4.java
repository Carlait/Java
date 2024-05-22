package atv;

import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	float C, F;
    	System.out.println("Digite a temperatura em Celsius: ");
    	C=ler.nextFloat();
    	F=((C*9/5)+32);
    	System.out.println("Temperatura em Fahrenheit: "+F);
}
}
//Atividade para converter Celsius para Fahrenheit