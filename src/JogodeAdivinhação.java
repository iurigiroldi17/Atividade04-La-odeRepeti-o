import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar qual é!");

        do {
            System.out.print("Digite seu palpite: ");
            while (!scanner.hasNextInt()) {
                // Se a entrada não é um número inteiro, exibe uma mensagem de erro
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
                System.out.print("Digite seu palpite: ");
            }
            palpite = scanner.nextInt();

            // Verifica o palpite do usuário
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}


