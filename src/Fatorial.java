import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long fatorial = 1;

        // Solicita ao usuário o número para calcular o fatorial
        System.out.print("Digite um número inteiro não negativo: ");
        numero = scanner.nextInt();

        // Verifica se o número é não-negativo
        if (numero < 0) {
            System.out.println("O número deve ser não-negativo.");
        } else {
            // Calcula o fatorial usando um loop do-while
            int i = numero;
            do {
                fatorial *= i;
                i--;
            } while (i > 0);

            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }
}
