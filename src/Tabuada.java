import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibindo a tabuada do número fornecido
        System.out.println("Tabuada do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            // Calculando e exibindo o resultado da multiplicação
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechando o scanner
        scanner.close();
    }
}


