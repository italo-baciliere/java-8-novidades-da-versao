package br.com.list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso(
            "Dominando as coleções do Java", 
            "Italo Baciliere");

        List<Aula> aulas = javaColecoes.getAulas(); // output -> []
        System.out.println(aulas);
                    
        javaColecoes.adicionaAula(new Aula("Trabalhando com Stream", 50));
        javaColecoes.adicionaAula(new Aula("Trabalhando com LinkedList", 50));
        javaColecoes.adicionaAula(new Aula("Trabalhando com Lambda", 50));

        // Exception
        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));        

        System.out.println(javaColecoes.getAulas());
        System.out.println(aulas);
    }
}