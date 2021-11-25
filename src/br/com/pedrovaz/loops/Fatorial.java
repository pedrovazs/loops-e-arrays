package br.com.pedrovaz.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha um número para gerar seu fatorial");
        int numero = teclado.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1 ; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
