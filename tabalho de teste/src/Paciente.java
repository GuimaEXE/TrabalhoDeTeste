public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private String historicoMedico;

    public Paciente(String nome, int idade, String cpf, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.historicoMedico = "";
    }

    public void adicionarHistorico(String registro) {
        this.historicoMedico += registro + "\n";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }
}