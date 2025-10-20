package ListaVI;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor " + vetor.length);
            System.out.println("Vetor - i " + (vetor.length - i));
            System.out.println("Vetor - 1 - i" + (vetor.length - 1 - i));

            System.out.println(vetor[vetor.length - 1 - i]);
        }
    }
}
