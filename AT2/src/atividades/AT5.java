//Algoritmo calceula media entre 5 numeros
package atividades;

import java.util.Scanner;

public class AT5 {
public static void main (String[] args) {
Scanner ler = new Scanner (System.in) ;
int soma, media;
System.out.println("Digite os numeros: ");
int n1 = ler.nextInt(), n2 = ler.nextInt(), n3 = ler.nextInt(), n4 = ler.nextInt(), n5 = ler.nextInt();
soma = (n1+n2+n3+n4+n5);
media = (n1 + n2 + n3 + n4 + n5)/5;
System.out.println("A soma dos numeros é: " + soma);
System.out.println("A media dos numeros é: " + media);
ler.close();

}   
}