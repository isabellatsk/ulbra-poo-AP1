public class Professor extends Pessoa implements Autenticavel {
    private String registro;
    private String areaAtuacao;
    private String senha;

    public Professor(
            String nome,
            String cpf,
            String email,
            String registro,
            String areaAtuacao,
            String senha
    ) {
        super(nome, cpf, email);
        this.registro = registro;
        this.areaAtuacao = areaAtuacao;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void exibirDados() {
        System.out.println("""
            Professor
            Nome: %s
            CPF: %s
            E-mail: %s
            Registro: %s
            Área de atuação: %s
            """.formatted(getNome(), getCpf(), getEmail(), registro, areaAtuacao)
        );
    }
}