package AD08;


import java.util.Random;

public class Ex1 {


    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] contagemFaces = new int[6];
        int numLancamentos = 1000000;
        int repeticao = 0;

        do {
            int dado = aleatorio.nextInt(6) + 1;
            System.out.println("Dado lançado..... numero exibido: " + dado);

            contagemFaces[dado - 1]++;
            repeticao++;

        } while (repeticao <= numLancamentos);

        for (int i = 0; i < 6; i++) {
            double porcentagem = (double) contagemFaces[i] / numLancamentos * 100;
            System.out.printf("Face %d: %.2f%%\n", i + 1, porcentagem);
            //System.out.printf("numero %d: %d\n ", i, contagemFaces[i]);
        }
    }
}










