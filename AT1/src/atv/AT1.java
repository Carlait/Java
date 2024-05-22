package atv;
import java.util.Scanner;
public class AT1 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	float num, res;
    	System.out.println("Digite o número: ");
    	num=ler.nextFloat();
    	res = num * num;
    	System.out.println("Resultado: "+res);
}
}
//Atividade para multiplicar o número por ele mesmo