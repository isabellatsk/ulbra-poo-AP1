import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Autenticavel {
    private String matricula;
    private Curso curso;
    private String senha;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(
            String nome,
            String cpf,
            String email,
            String matricula,
            Curso curso,
            String senha
    ) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricular(Disciplina disciplina) {
        if (!disciplinasMatriculadas.contains(disciplina)) {
            disciplinasMatriculadas.add(disciplina);
        }
    }

    public void cancelarMatricula(Disciplina disciplina) {
        disciplinasMatriculadas.remove(disciplina);
    }

    public void listarDisciplinasMatriculadas() {
        System.out.println("Disciplinas de " + getNome() + ":");

        if (disciplinasMatriculadas.isEmpty()) {
            System.out.println("Nenhuma disciplina matriculada.");
            return;
        }

        for (Disciplina disciplina : disciplinasMatriculadas) {
            System.out.println(
                    disciplina.getCodigo() + " - " + disciplina.getNome()
            );
        }
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void exibirDados() {
        System.out.println("""
            Aluno
            Nome: %s
            CPF: %s
            E-mail: %s
            Matrícula: %s
            """.formatted(getNome(), getCpf(), getEmail(), matricula)
        );

        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
        }
    }
}