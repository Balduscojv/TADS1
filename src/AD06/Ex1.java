package AD06;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        int tentativa = 1;
        boolean acertou = false;


do {

        System.out.println("Qual é a equipe mais Vitoriosa do Brasil?");

        System.out.println("A) Corinthians ");
        System.out.println("B) Santos ");
        System.out.println("C) Palmeiras ");
        System.out.println("D) São Paulo ");
        System.out.println("E) Vasco ");
        System.out.println("-----------------------");
        System.out.println("digite sua resposta: ");
        resposta = entrada.nextLine();


        switch (resposta) {
            case "C":
                System.out.println("Resposta Correta! ");
                break;
            case "c":
                System.out.println("Resposta Correta! ");
                break;

            default:
                System.out.println("Resposta Incorreta! ");

        }
        tentativa++;
    } while (tentativa <= 3 && !acertou);

if (acertou) {
    System.out.println("Acertou na " + tentativa + "° tentativa");
}else{
    System.out.println("Fim das tentativas");
}

    }
}
