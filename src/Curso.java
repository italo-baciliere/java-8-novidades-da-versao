import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {

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


    public static void main(String[] args){
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // lambda
        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
        // method reference
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
    }
}