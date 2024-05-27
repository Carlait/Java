//Feita por Nathan Ramos 22/05
//Atividade com 100 números inteiros colocando 1 na posição par e 0 na posição impar (nota-se que o começa pelo número 0)
package AT5;

public class AT14 {

    public static void main(String[] args) {
        // Declaração e inicialização do vetor
        int[] vetor = new int[100];

        // Preenchendo o vetor com 1 nas posições pares e 0 nas posições ímpares
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = 0;
            }
        }

        // Imprimindo o vetor (opcional)
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}

