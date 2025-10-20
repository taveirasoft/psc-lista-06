package ListaVI;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            double soma = 0.0;

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite uma nota do aluno " + (i + 1) + ": ");
                soma += scanner.nextDouble();
            }

            vetor[i] = soma / 4;
        }

        scanner.close();

        int contador = 0;

        for (double nota : vetor) {
            if (nota >= 7) {
                contador++;
            }
        }

        System.out.println(contador + " alunos ficaram com a nota maior ou igual a 7.0");
    }
}
