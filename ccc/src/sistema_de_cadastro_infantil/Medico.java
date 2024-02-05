package sistema_de_cadastro_infantil;

public class Medico extends Pessoa {
	
    private String especialidade;

    public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Medico() {
    }

    public Medico(String nome, String email, int senha, String especialidade) {
        super(nome, email, senha);
        this.especialidade = especialidade;
    }

    /* Metodo que ira exibir a informações cadastradas do medico no Prontuario*/
    public String exibirMedico() {
        return "Médico: " + this.getNome() + ", Especialidade: " + this.getEspecialidade() + "\n";
    }
}