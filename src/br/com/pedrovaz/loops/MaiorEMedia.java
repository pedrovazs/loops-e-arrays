package br.com.pedrovaz.loops;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaiorEMedia {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(){{
            add(41);
            add(54);
            add(42);
            add(43);
            add(84);
        }};

        Iterator<Integer> iterator = numeros.iterator();
        Integer maior = -99;
        Double media = 0d;

        do {
            Integer numero = iterator.next();
            media += numero;

            if (maior < numero) {
                maior = numero;
            }
        }while(iterator.hasNext());

        System.out.println(maior);
        System.out.println(media / numeros.size());

    }
}
