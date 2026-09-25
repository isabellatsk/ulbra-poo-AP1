import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas do curso " + nome + ":");

        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getCodigo() + " - " + disciplina.getNome() + " - " + disciplina.getCargaHoraria() + " horas");
        }
    }
}