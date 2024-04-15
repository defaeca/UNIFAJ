package br.edu.unifaj.poo.aula7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EntraNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        //var nomes = new LinkedList<String>();
        while (true) {
            System.out.println("Entre com um nome");
            String nome = sc.nextLine();
            if (nome == null || nome.trim().isEmpty()) {
                break;
            }
            nomes.add(nome);
        }

        // Exibir os nomes - Decada de 50 - 60
        System.out.println("Os nomes entrados foram:");
        /*for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }*/
        // Forma moderna
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
