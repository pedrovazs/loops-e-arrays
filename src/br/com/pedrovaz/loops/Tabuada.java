package br.com.pedrovaz.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um número entre 1 e 10 para gerar a tabuada");
        int multiplicador = teclado.nextInt();

        // Usando laço while
        /*int cont = 0;
        while(cont < 10) {
            System.out.println(multiplicador + " X " + cont + " = " + multiplicador * cont);
            cont++;
        }*/

        // Se o usuário escolher um número maior do que 10 ou menor do que 0.
        while(multiplicador > 10 || multiplicador < 0) {
            System.out.println("Número inválido, por favor escolha um entre 1 e 10");
            multiplicador = teclado.nextInt();
        }
        // Usando laço for
        for(int i = 1; i <= 10; i++) {
            System.out.println(multiplicador + " X " + i + " = " + multiplicador * i);
        }
    }
}
