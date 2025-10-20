package ListaVI;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            int j = scanner.nextInt();

            vetor[i] = j;
            soma += j;
            multiplicacao *= j;
        }

        scanner.close();

        System.out.println(Arrays.toString(vetor));
        System.out.println(soma);
        System.out.println(multiplicacao);
    }
}
