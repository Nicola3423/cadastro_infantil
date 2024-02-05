package sistema_de_cadastro_infantil;

public class Responsavel extends Pessoa {
    
	private String telefone;

    public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Responsavel() {
    }

    public Responsavel(String nome, String email, int senha, String telefone) {
        super(nome, email, senha);
        this.telefone = telefone;
    }

    /* Metodo para exibir informações do responsável do paciente no prontuário*/
    public String exibirResponsavel() {
        return "Responsável: " + this.getNome() + ", Telefone: " + this.getTelefone() + "\n";
    }

}
