package sistema_de_cadastro_infantil;

public class Criança extends Pessoa {
	
	private int dataNascimento;

    public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Criança() {
    }

    public Criança(String nome, String email, int senha, int dataNascimento) {
        super(nome, email, senha);
        this.dataNascimento = dataNascimento;
    }

    /* Metodo que ira exibir a informações cadastradas do paciente no Prontuario*/
    public String exibirCrianca() {
        return "Criança: " + this.getNome() + ", Data de Nascimento: " + this.getDataNascimento() + "\n";
    }

}

