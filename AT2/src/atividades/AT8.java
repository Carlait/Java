//Algoritmo que soma e multiplica 3 números escolhidos
package atividades;
import java.util.Scanner;

public class AT8 {
	public static void main (String[] args) {
	Scanner ler = new Scanner(System.in);
	int soma, produto;
	System.out.println("Digite os números: ");
	int n1 = ler.nextInt(), n2 = ler.nextInt(), n3 = ler.nextInt();
	soma = n1+n2+n3;
	System.out.println("\n Soma dos números é : "+soma+"\n");
	produto = n1*n2*n3;
	System.out.println("\n Produto dos números é : " + produto +"\n");
	ler.close();
			
	}

}
