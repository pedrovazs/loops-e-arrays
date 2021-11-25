package br.com.pedrovaz.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] consoantes = new String[6];
        int contaConsoante = 0;

        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = teclado.next();

            if( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))
            ) {
                consoantes[cont] = letra;
                contaConsoante++;
            }
            cont++;
        }while(cont < consoantes.length);
        System.out.println("Número de consoantes: " + contaConsoante);
        for (String consoante : consoantes) {
            if(consoante != null) {
                System.out.print(consoante + " ");
            }
        }
    }
}
