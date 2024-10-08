// 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        
        if (num == 0 || num == 1) {
            return true;
        }

        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência.");
        }

        scanner.close();
    }
}
