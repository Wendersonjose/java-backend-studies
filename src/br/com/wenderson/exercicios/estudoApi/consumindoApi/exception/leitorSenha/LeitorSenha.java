package exception.leitorSenha;

import java.util.Scanner;

public class LeitorSenha {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senha = leitor.nextLine();

        try {

            validarSenha(senha);
            System.out.println("Senha válida!");

        } catch (SenhaInvalidaException e) {

            System.out.println(e.getMessage());

        }

        leitor.close();
    }

    public static void validarSenha(String senha) throws SenhaInvalidaException {

        if (senha.length() < 8) {
            throw new SenhaInvalidaException(
                "A senha deve ter no mínimo 8 caracteres."
            );
        }

        if (!senha.matches(".*[A-Z].*")) {
            throw new SenhaInvalidaException(
                "A senha deve conter letra maiúscula."
            );
        }

        if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaException(
                "A senha deve conter um número."
            );
        }
    }
}
