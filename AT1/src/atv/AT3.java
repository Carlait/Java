package atv;

import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	float basemaior, basemenor, altura, area;
    	System.out.println("Digite a Base Maior: ");
    	basemaior=ler.nextFloat();
    	System.out.println("Digite a Base Menor: ");
    	basemenor=ler.nextFloat();
    	System.out.println("Digite a Altura: ");
    	altura=ler.nextFloat();
    	area= ((basemaior+basemenor)*altura)/2;
    	System.out.println("Área do trapézio: "+area);     	
}
}
//Ativida para calcular a area de um trapézio