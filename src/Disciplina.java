public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private Professor professorResponsavel;

    public Disciplina(
            String codigo,
            String nome,
            int cargaHoraria
    ) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}