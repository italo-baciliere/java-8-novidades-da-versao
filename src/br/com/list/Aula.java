package br.com.list;

public class Aula implements Comparable<Aula>{

    private String nome;    
    private int minutos;

    public Aula(String nome,  int minutos) {
        this.nome = nome;
        this.minutos = minutos;
    }

    public String getNome() {
        return nome;
    }    

    public int getMinutos(){
        return this.minutos;
    }

    @Override
    public String toString(){
        return "Curso: " + this.nome +
                "Minutos: " + this.minutos;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.nome.compareTo(outraAula.getNome());
    }
}