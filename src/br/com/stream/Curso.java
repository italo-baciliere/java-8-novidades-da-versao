package br.com.stream;

class Curso implements Comparable<Curso>{
    
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString(){
        return nome;
    }    

    @Override
    public int compareTo(Curso outroCurso) {        
        return this.nome.compareTo(outroCurso.getNome());
    }
}