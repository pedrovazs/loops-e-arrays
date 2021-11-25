package br.com.pedrovaz.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numero = random.nextInt(9);
                matriz[i][j] = numero;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}
