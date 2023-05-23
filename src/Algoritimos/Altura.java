package Algoritimos;

import java.util.Scanner;

public class Altura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numeroPessoas = 10;
            double MaiorAltura = 0;
            double MenorAltura = Double.MAX_VALUE;
            double somaAlturaHomens = 0;
            int numeroMulheres = 0;


                for (int i = 1; i <= numeroPessoas; i++) {
                System.out.print("Digite a altura da pessoa " + i + ": ");
                double altura = scanner.nextDouble();

                System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
                char sexo = scanner.next().charAt(0);

                 if (altura > MaiorAltura) {
                    MaiorAltura = altura;
                    }
                if (altura < MenorAltura) {
                    MenorAltura = altura;
                }
                if (sexo == 'M' || sexo == 'm') {
                    somaAlturaHomens += altura;

                } else if (sexo == 'F' || sexo == 'f') {
                    numeroMulheres++;
                }
            }


            double mediaAlturaH = somaAlturaHomens / (numeroPessoas - numeroMulheres);
            System.out.println("Maior altura: " + MaiorAltura);

            System.out.println("Menor altura: " + MenorAltura);

            System.out.println("Média de altura dos homens: " + mediaAlturaH);

            System.out.println("Número de mulheres: " + numeroMulheres);
            scanner.close();
        }
    }


