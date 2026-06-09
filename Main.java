import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String[] jogada = {"IMPAR", "PAR"};

        System.out.println("Escolha a sua opção:");
        System.out.println("(0) para IMPAR");
        System.out.println("(1) para PAR");
        System.out.print("Faça a sua escolha: ");
        int escolhadojogador = sc.nextInt();
        System.out.println("Sua escolha: " + jogada[escolhadojogador]);
        System.out.print("Digite um número entre 1 e 10: ");
        int jogadadojogador = sc.nextInt();
        int jogadadopc = rd.nextInt(10) + 1;
        System.out.println("Jogada do pc: " + jogadadopc);

        int soma = jogadadojogador + jogadadopc;
        int total = soma % 2;

        System.out.println("Soma da jogada: " + jogadadojogador + " + " + jogadadopc + " = " + soma);

        if (total == 0) {
            System.out.println("Resultado: PAR");
        } else {
            System.out.println("Resultado: ÍMPAR");
        }

        if ((escolhadojogador == 1 && total == 0) ||
                (escolhadojogador == 0 && total == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O PC venceu!");
        }

    }
}