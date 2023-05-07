package AD09;

import java.util.Random;
import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dê um valor minimo: ");
        int min = input.nextInt();

        System.out.print("agora um valor maximo: ");
        int max = input.nextInt();

        Random random = new Random();
        int a = random.nextInt((max - min) + 1) + min;
        int b = random.nextInt((max - min) + 1) + min;

        System.out.printf("A equação é  %dx + %d = 0\n", a, b);

        double x = -b / (double) a;
        System.out.printf("Resolução:  x = %.2f\n", x);
    }
}
