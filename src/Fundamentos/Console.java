package Fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome : ");
        String nome = entrada.nextLine();
        System.out.println("nome = " + nome);
        entrada.close();

    }
}
