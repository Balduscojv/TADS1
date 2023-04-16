package AD08;


import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int repeticao = 0;

        do {
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Dado lançado..... numero exibido: " + dado);
            repeticao++;
        }while(repeticao <= 1000000);



        }



    }

