package ListaVI;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite uma letra: ");
            vetor[i] = scanner.next().toLowerCase().charAt(0);
        }

        scanner.close();

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;

        for (char c : vetor) {
            int diferenca = 0;

            for (char d : vogais) {
                if (c == d) {
                    diferenca++;
                }
            }

            if (diferenca < 1) {
                contador++;
                System.out.println(c);
            }
        }

        System.out.println(contador);
    }
}
