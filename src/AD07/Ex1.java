package AD07;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String questao = "Os Números decimais 199 e 250 correspondem a quais representações binaria e hexadecimal?";


        Collection<String> alternativas = new ArrayList<>();
        alternativas.add("11000111 e FA");
        alternativas.add("11100111 e F9");
        alternativas.add("11010111 e FA");
        alternativas.add("11000111 e F9");
        alternativas.add("11100111 e FA");

        String alternativaCorreta = "11000111 e FA";

        boolean respostaCerta = false;
        do {
            System.out.println(questao);

            Collections.shuffle((List<String>) alternativas);
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("[" + i + "] " + ((List<String>) alternativas).get(i));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada.nextLine();
            int respostaInt = Integer.parseInt(resposta);

            String ValorDaResposta = ((List<String>) alternativas).get(respostaInt);

            if (ValorDaResposta.equals(alternativaCorreta)) {
                System.out.println("Resposta correta!");

                respostaCerta = true;
            } else {
                System.out.println("Resposta incorreta, Tente novamente");
            }
        } while (!respostaCerta);


    }
}
