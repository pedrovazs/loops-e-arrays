package br.com.pedrovaz.arrays;

public class Inverso {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
