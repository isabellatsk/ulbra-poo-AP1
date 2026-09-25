import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Universidade universidade = new Universidade();

        // 1. Criar pelo menos 2 professores

        Professor prof1 = new Professor(
                "Eventon Bitencounrt",
                "739.840.420-43",
                "ev@gmail.com",
                "3345",
                "Ensino Superior",
                "senhaS3creta"
        );

        Professor prof2 = new Professor(
                "Clóvis",
                "798.668.580-81",
                "cc@gmail.com",
                "7899",
                "Ensino Superior",
                "senhaS3creta2"
        );

        // 2. Criar pelo menos 3 disciplinas

        Disciplina d1 = new Disciplina(
                "4004",
                "Segurança em Redes de Computadores",
                60
        );

        Disciplina d2 = new Disciplina(
                "2235",
                "Criptografia",
                60
        );

        Disciplina d3 = new Disciplina(
                "1677",
                "Auditoria de Sistemas",
                60
        );

        // 3. Criar pelo menos 1 curso

        Curso curso = new Curso(
                "CC001",
                "Ciência da Computação"
        );

        universidade.cadastrarProfessor(prof1);
        universidade.cadastrarProfessor(prof2);
        universidade.cadastrarCurso(curso);

        // 4. Associar os professores às disciplinas

        d1.setProfessorResponsavel(prof1);
        d2.setProfessorResponsavel(prof2);
        d3.setProfessorResponsavel(prof1);

        // 5. Adicionar as disciplinas ao curso

        curso.adicionarDisciplina(d1);
        curso.adicionarDisciplina(d2);
        curso.adicionarDisciplina(d3);

        // 6. Criar pelo menos 3 alunos

        Aluno al1 = new Aluno(
                "Igor Silveira",
                "425.704.980-41",
                "igore@gmail.com",
                "i4556",
                curso,
                "senhaS3creta3"
        );

        Aluno al2 = new Aluno(
                "Yuri Santos",
                "742.558.080-23",
                "yere@gmail.com",
                "y4444",
                curso,
                "senhaS3creta4"
        );

        Aluno al3 = new Aluno(
                "Luany",
                "926.546.900-59",
                "lkk@gmail.com",
                "l7754",
                curso,
                "senhaS3creta5"
        );

        universidade.cadastrarAluno(al1);
        universidade.cadastrarAluno(al2);
        universidade.cadastrarAluno(al3);

        // 7. Matricular os alunos em diferentes disciplinas

        al1.matricular(d3);
        al1.matricular(d1);

        al2.matricular(d1);
        al2.matricular(d2);

        al3.matricular(d2);
        al3.matricular(d2);

        // 8. Exibir os dados dos alunos e professores

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(al1);
        pessoas.add(al2);
        pessoas.add(al3);
        pessoas.add(prof1);
        pessoas.add(prof2);

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
        }

        universidade.listarAlunos();
        universidade.listarProfessores();
        universidade.listarCursos();

        // 9. Listar as disciplinas de um curso
        curso.listarDisciplinas();

        // 10. Listar as disciplinas em que determinado aluno está matriculado
        al1.listarDisciplinasMatriculadas();

        al1.cancelarMatricula(d2);
        al1.listarDisciplinasMatriculadas();

        // 11. Testar o metodo autenticar() de um aluno e de um professor

        al1.autenticar("1111"); // senha certa
        al1.autenticar("9999"); // senha errada

        prof1.autenticar("1234"); // senha certa
        prof1.autenticar("9999"); // senha errada
    }
}