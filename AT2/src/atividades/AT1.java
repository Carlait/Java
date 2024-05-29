//Algoritmo para informar idade básico
package atividades;
import java.util.Scanner;
public class AT1 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	int idade;
    	System.out.println("Digite sua idade: ");
    	idade=ler.nextInt();
    	System.out.println("A idade digitada foi "+idade);
    	ler.close();
}
}