package br.com.pedrovaz.arrays;


import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];

        System.out.println("Digite vinte números de 0 a 100");
        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.print("Aleatórios: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores: ");
        for (int numero :
                numeros) {
            System.out.print((numero + 1) + " ");
        }

    }
}
