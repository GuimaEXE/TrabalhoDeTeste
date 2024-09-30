public class Medico {
    private String nome;
    private String especialidade;
    private int crm;

    public Medico(String nome, String especialidade, int crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public boolean atenderPaciente(Paciente paciente) {
        // Simula o atendimento ao paciente
        return paciente != null;
}
}