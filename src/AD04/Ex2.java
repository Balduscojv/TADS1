package AD04;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;

        System.out.println("Qual é a equipe mais Vitoriosa do Brasil?");

        System.out.println("A) Corinthians ");
        System.out.println("B) Santos ");
        System.out.println("C) Palmeiras ");
        System.out.println("D) São Paulo ");
        System.out.println("E) Vasco ");
        System.out.println("-----------------------");
        System.out.println("digite sua resposta: ");
        resposta = entrada.nextLine();


        switch (resposta){
            case "C": System.out.println("Resposta Correta! ");
                break;
            case "c": System.out.println("Resposta Correta! ");
                break;

            default: System.out.println("Resposta Incorreta! ");

        }
    }
}


