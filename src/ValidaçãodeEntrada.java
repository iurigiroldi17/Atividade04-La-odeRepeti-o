import java.util.Scanner;

public class ValidaçãodeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        // Solicita a idade até que uma idade válida seja fornecida
        do {
            System.out.print("Digite a sua idade (maior que 0): ");
            while (!scanner.hasNextInt()) {
                // Se a entrada não é um número inteiro, exibe uma mensagem de erro
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
                System.out.print("Digite a sua idade (maior que 0): ");
            }
            idade = scanner.nextInt();
            if (idade <= 0) {
                System.out.println("A idade deve ser maior que 0. Tente novamente.");
            }
        } while (idade <= 0);

        // Exibe a idade válida
        System.out.println("Sua idade é: " + idade);

        scanner.close();
    }
}

