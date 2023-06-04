package Algoritimos;

import java.util.Scanner;

public class relogio {
    //loops aninhados

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Para qual dia da semana é o alarme: ");
        String [] dia = {"\n domingo" ,"\n segunda", "\n terça", "\n quarta", "\n quinta", "\n sexta", "\n sábado"};
        int DiaUser = input.nextInt();

        System.out.print(dia[DiaUser]);

        System.out.println("\n Qual é a hora escolhida: ");
        int hora = input.nextInt();

        System.out.println("\n Qual é o minuto escolhido: ");
        int minuto = input.nextInt();

        System.out.println("\n Qual é o segundo escolhido: ");
        int segundo = input.nextInt();

        for (int h = 0; h <= hora; h++) {
            for (int m = 0; m <= minuto; m++) {
                for (int s = 0; s <= segundo; s++) {
                    System.out.printf("%d:%d:%d\n", h, m, s);
                    if (h == hora && m == minuto && s == segundo) {
                        System.out.println("ALARME");
                        break;
                    }
                }
                if (h == hora && m == minuto) {
                    break;
                }
            }
            if (h == hora) {
                break;
            }
        }
        System.out.println(" v ");
    }
}
