//Algoritmo que recebe três digitos e inverte ele
package atividades;

import java.util.Scanner;

public class AT10 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int unidade, dezena, centena, novo;
		System.out.println("Escreva o valor(três digitos): ");
		int valor = ler.nextInt();
		unidade = valor % 10;
		dezena = (valor%100)/10;
		centena = valor/100;
		novo = unidade * 100 + dezena * 10 + centena;
		System.out.println("O valor original é: " +valor+"\nO número invertido é: "+novo+"\n");
		ler.close();
		
	}

}
