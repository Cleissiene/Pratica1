package Questao1;

import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int[] vetor = new int[10];


        for (int i = 0; i < 10; i++) {
            vetor[i] = gerador.nextInt(100);
        }


        System.out.print("valor do vetor a ser gerado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();


        System.out.print("digite o número a ser buscao: ");
        int elementoBusca = entrada.nextInt();


        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == elementoBusca) {
                System.out.println( elementoBusca + " está na posição " + i);
                encontrado = true;
                break;
            }
        }


        if (!encontrado) {
            System.out.println(elementoBusca + " não foi encontrado");
        }

        entrada.close();
    }
}



