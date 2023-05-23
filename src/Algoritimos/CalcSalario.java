package Algoritimos;

import java.util.Scanner;

public class CalcSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                Scanner scanner = new Scanner(System.in);
                System.out.print("Qual a quantidade de funcionários? ");
                int quantFunc = scanner.nextInt();

                double[] salarios = entraSalarios(quantFunc, scanner);
                double mediaSal = calculoMediaSalarial(salarios);
                System.out.println("A média salarial da empresa é: " + mediaSal);
            }

            public static double[] entraSalarios(int quantidade, Scanner scanner) {
                double[] salarios = new double[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.print("Digite o valor do salário do funcionário " + (i + 1) + ": ");
                    salarios[i] = scanner.nextDouble();
                }

                return salarios;
            }

            public static double calculoMediaSalarial(double[] salarios) {
                double soma = 0;

                for (double salario : salarios) {
                    soma += salario;
                }

                return soma / salarios.length;
            }
        }




