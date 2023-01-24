package br.com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));        

        cursos.add(new Curso("GO", 34));
        cursos.remove(4);

        System.out.println("\nPercorrendo a lista e exibindo todos os cursos!");
        cursos.forEach(System.out::println); // Sem a sobrescrita do toString, não funcionará
        // cursos.forEach(c -> System.out.println(c)); // Sem a sobrescrita do toString, não funcionará

        System.out.println("\nOrdenando a lista pelo nome:");
        Collections.sort(cursos); // foi necessário implementar a interface <Comparable>
        System.out.println(cursos);

        System.out.println("\nOrdenando a lista pelo número de alunos:");
        // Collections.sort(cursos, Comparator.comparing(Curso::getAlunos));
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));    
        
        // String s1 = "italo";
        // String s2 = "baciliere";
        // int resultado = s1.compareTo(s2);
        // System.out.println(resultado); // output -> 7        

        System.out.println("\nCriando filtro com a API de Stream para cursos com mais de 50 alunos!");
        cursos.stream()  // todas as ações feitas no stream não impactam diretamente a lista originária
            .filter(curso -> curso.getAlunos() > 50)
            .forEach(System.out::println);
        // reference: https://www.geeksforgeeks.org/stream-filter-java-examples/        
        
        System.out.println("\nCriando uma Stream<String> apenas com o nome dos cursos!");
        Stream<String> cursosNome = cursos.stream().map(Curso::getNome);
        cursosNome.forEach(System.out::println);
        
        System.out.println("\nTirando proveito da sintaxe method reference:");
        System.out.println("Stream<Integer> com a quantidade de alunos dos cursos com mais de 50 alunos");
        cursos.stream()
            .filter(c -> c.getAlunos() > 50)
            .map(Curso::getAlunos)
            .forEach(System.out::println);
                
        System.out.println("\nImprimir soma de alunos dos curso com mais de 100 alunos!");
        int sum = cursos.stream()
            .filter(c -> c.getAlunos() >= 100)
            .mapToInt(Curso::getAlunos)
            .sum();                
        System.out.println(sum);            


        // Alguns bem interessante são map, collect, findFirst e findAny.

        // PESQUISAR E EXPLICAR
        // lamba significa um comparator
        // comparator, comparable
        // The returned comparator is serializable if the specified function is also serializable.
        // method reference
        // Consumer
        // List, Collections e Interables
        // predicate
        // Stream                
    }
}