package br.com.pedrovaz.loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class NomeEIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<>();

        while (true) {
            System.out.println("Digite 0 no nome para sair");
            System.out.println("Digite o nome: ");
            var nome = teclado.next();
            if(nome.equals("0")) {
                break;
            }
            System.out.println("Digite a idade:");
            var idade = teclado.next();
            alunos.put(nome, idade);
        }
        System.out.println(alunos);
        teclado.close();
    }
}
