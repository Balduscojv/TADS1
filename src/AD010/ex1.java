package AD010;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(100) + 1;
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Bem vindo ao Jogo! tente adivinhar um numero entre 1 e 100, você tem 5 tentativas!");
        while (tentativas > 0) {
            System.out.println("tentativa numero um: ");
            int palpite = input.nextInt();

            if (palpite == numero) {
                acertou = true;
                break;
            } else if (palpite < numero) {
                System.out.println(" O número é maior.");
            } else {
                System.out.println(" O número é menor.");
            }
            if (Math.abs(palpite - numero) == 1) {
                System.out.println("TÁ QUENTE!");
            }
            tentativas--;
            System.out.println("Você ainda tem  " +  tentativas +  "tentativas.");
        }
        if (acertou){
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Game Over!");
            System.out.println(" O numero correto era: " + numero);

        }
        input.close();

    }

}
