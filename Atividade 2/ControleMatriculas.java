import java.util.ArrayList;
import java.util.List;

interface Disciplina {
    void realizarMatricula(Aluno aluno);
    void exibirListaMatriculados();
}

abstract class DisciplinaAbstrata {
    private List<Aluno> listaMatriculados = new ArrayList<>();

    public abstract void realizarMatricula(Aluno aluno);

    public void exibirListaMatriculados() {
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : listaMatriculados) {
            System.out.println(aluno);
        }
    }

    protected void adicionarMatriculado(Aluno aluno) {
        listaMatriculados.add(aluno);
        System.out.println("Matrícula realizada para o aluno: " + aluno.getNome());
    }
}

class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " (Idade: " + idade + ")";
    }
}

class DisciplinaComInterface implements Disciplina {
    private List<Aluno> listaMatriculados = new ArrayList<>();

    @Override
    public void realizarMatricula(Aluno aluno) {
        listaMatriculados.add(aluno);
        System.out.println("Matrícula realizada para o aluno: " + aluno.getNome());
    }

    @Override
    public void exibirListaMatriculados() {
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : listaMatriculados) {
            System.out.println(aluno);
        }
    }
}

class DisciplinaComClasseAbstrata extends DisciplinaAbstrata {
    @Override
    public void realizarMatricula(Aluno aluno) {
        adicionarMatriculado(aluno);
    }
}

public class ControleMatriculas {
    public static void main(String[] args) {
        Disciplina disciplina1 = new DisciplinaComInterface();

        disciplina1.realizarMatricula(new Aluno("Ana", 20));
        disciplina1.realizarMatricula(new Aluno("Carlos", 22));
        disciplina1.exibirListaMatriculados();

        System.out.println("------------------------");

        DisciplinaAbstrata disciplina2 = new DisciplinaComClasseAbstrata();
        disciplina2.realizarMatricula(new Aluno("Eva", 19));
        disciplina2.realizarMatricula(new Aluno("Daniel", 21));
        disciplina2.exibirListaMatriculados();
    }
}
