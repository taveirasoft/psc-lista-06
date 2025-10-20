package ListaVI;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[4];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite uma nota: ");
            vetor[i] = scanner.nextDouble();
        }

        scanner.close();

        double soma = 0.0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + vetor[i]);
            soma += vetor[i];
        }

        System.out.println("Média: " + (soma / vetor.length));
    }
}
