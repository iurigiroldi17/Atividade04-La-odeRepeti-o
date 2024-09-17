import java.util.Scanner;

public class MediaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de entradas
        System.out.print("Digite a quantidade de números que você deseja inserir: ");
        while (!scanner.hasNextInt()) {
            // Se a entrada não é um número inteiro, exibe uma mensagem de erro
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next(); // Limpa o buffer do scanner
            System.out.print("Digite a quantidade de números que você deseja inserir: ");
        }
        int n = scanner.nextInt();

        // Verifica se o número é positivo
        if (n <= 0) {
            System.out.println("A quantidade de números deve ser maior que 0.");
        } else {
            double soma = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o número " + i + ": ");
                while (!scanner.hasNextDouble()) {
                    // Se a entrada não é um número decimal, exibe uma mensagem de erro
                    System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                    scanner.next(); // Limpa o buffer do scanner
                    System.out.print("Digite o número " + i + ": ");
                }
                double numero = scanner.nextDouble();
                soma += numero;
            }

            // Calcula a média
            double media = soma / n;

            // Exibe a média
            System.out.println("A média dos números inseridos é: " + media);
        }

        scanner.close();
    }
}

