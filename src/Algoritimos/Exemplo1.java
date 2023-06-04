package Algoritimos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int Primeironumero = input1.nextInt();

        System.out.println("Digite o segundo numero: ");
        Scanner input2 = new Scanner(System.in);
        int SegundoNumero = input2.nextInt();

        int Resultado = Primeironumero * SegundoNumero;

        System.out.println("a multiplicação dos numeros é de: " + Resultado);


    }

}
