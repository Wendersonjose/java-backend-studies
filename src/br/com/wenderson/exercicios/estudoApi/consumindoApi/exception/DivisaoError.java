package exception;

import java.util.Scanner;

public class DivisaoError {
    
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = numero.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = numero.nextInt();

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
