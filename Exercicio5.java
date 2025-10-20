package ListaVI;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];
        int[] PAR = new int[20];
        int[] IMPAR = new int[20];
        int contPar = 0;
        int contImpar = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            int a = scanner.nextInt();

            vetor[i] = a;

            if (a % 2 == 0) {
                PAR[contPar] = a;
                contPar++;
            } else {
                IMPAR[contImpar] = a;
                contImpar++;
            }
        }

        scanner.close();

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < contPar; i++) {
            System.out.print(PAR[i] + " ");
        }

        for (int i = 0; i < contImpar; i++) {
            System.out.print(IMPAR[i] + " ");
        }
    }
}
