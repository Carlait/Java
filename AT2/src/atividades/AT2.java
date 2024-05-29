//Algoritmo que le idade e altura básico
package atividades;
import java.util.Scanner;
public class AT2 {
public static void main (String[] args){
Scanner ler = new Scanner (System.in);
	int idade;
	float altura;
	System.out.println("Digite sua idade ");
	idade =ler.nextInt ();
	System.out.println("Digite sua altura ");
	altura= ler.nextFloat () ;
	System.out.println("A idade digitada foi:  " +idade);
	System.out.println("A altura digitada foi:  "+altura);
	ler.close();

}
}