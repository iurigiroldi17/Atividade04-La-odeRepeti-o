import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inicial
        System.out.print("Digite um número inicial para a contagem regressiva: ");
        int numeroInicial = scanner.nextInt();

        // Inicia a contagem regressiva com um loop while
        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);
            numeroInicial--; // Decrementa o número
        }

        // Fecha o scanner
        scanner.close();
    }
}

