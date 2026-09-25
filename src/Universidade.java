import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;

    public Universidade() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void cadastrarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
        }
    }

    public void listarProfessores() {
        for (Professor professor : professores) {
            professor.exibirDados();
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso.getCodigo() + " - " + curso.getNome());
        }
    }
}