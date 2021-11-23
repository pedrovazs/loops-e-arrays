package br.com.pedrovaz.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Escreva uma nota entre 0 e 10");
            nota = teclado.nextInt();
        }while (nota < 0 || nota > 10);
        System.out.println("\nNota: " + nota);
    }
}
