package Algoritimos;

import java.util.Scanner;

public class funções {
    public static int tamanho() {

        System.out.println("~TAMANHO~");
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int t = input.nextInt();

        return t;

    }

    public static int[] criarVetor(int t) {

        System.out.println("~CRIAR UM VETOR~");
        int[] vetor = new int[t];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            System.out.printf("vetor[%d]:\n", i);
            vetor[i] = input.nextInt();

        }

        return vetor;

    }

    public static void imprimir(int[] vetor) {
        System.out.println("~IMPRIMIR~");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]:%d\n", i, vetor[i]);

        }

    }

    public static void imprimirPar(int[] vetor) {
        System.out.println("~IMPRIMIR PAR~");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);

            }

        }
    }
    public static void imprimirImpar(int[] vetor) {
        System.out.println("~IMPRIMIR IMPAR~");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0){
                System.out.println(vetor[i]);

            }

        }

    }
    public static void main(String[] args) {

        int t = tamanho();
        int[] vetor = criarVetor(t);
        imprimir(vetor);
        imprimirPar(vetor);
        imprimirImpar(vetor);

    }

}

