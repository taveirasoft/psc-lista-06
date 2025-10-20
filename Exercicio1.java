package ListaVI;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(Arrays.toString(vetor));
    }
}
