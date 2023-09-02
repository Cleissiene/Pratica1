package Questao2;

import java.util.Random;
import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] vetor = new int[50];


        for (int i = 0; i < 50; i++) {
            vetor[i] = random.nextInt(1000);
        }


        System.out.println("vetor encontrado antes da ordenação:");
        for (int i = 0; i < 50; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < 49 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }


        System.out.println("vetor encontrado depois da ordenação:");
        for (int i = 0; i < 50; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.print("digite o numero a ser buscado: ");
        int elementoBusca = scanner.nextInt();


        boolean encontrado = false;
        for (int i = 0; i < 50; i++) {
            if (vetor[i] == elementoBusca) {
                System.out.println(elementoBusca + " foi encontrado em " + i );
                encontrado = true;
                break;
            }
        }


        if (!encontrado) {
            System.out.println( elementoBusca + " não foi encontrado.");
        }

        scanner.close();
    }
}
