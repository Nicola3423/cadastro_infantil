package sistema_de_cadastro_infantil;

class Pessoa {
    
	
	private String nome;
    private String email;
    private int senha;
    private HistoricoMedico historico;

    public HistoricoMedico getHistorico() {
		return historico;
	}

	public void setHistorico(HistoricoMedico historico) {
		this.historico = historico;
	}

	public Pessoa() {
    }

    public Pessoa(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
