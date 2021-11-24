package br.com.pedrovaz.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int par = 0;
        int impar = 0;
        do {
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();
            if (numero % 2  == 0) par++;
            else impar++;
            cont++;
        }while(cont < 10);
        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);
    }
}
