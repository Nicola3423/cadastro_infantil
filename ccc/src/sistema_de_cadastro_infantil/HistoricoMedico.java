package sistema_de_cadastro_infantil;

public class HistoricoMedico {
    
	private String dataConsulta;
    private String diagnostico;
    private String receita;
   
	

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

    public HistoricoMedico() {
    }

    public HistoricoMedico(String dataConsulta, String diagnostico, String receita) {
        this.dataConsulta = dataConsulta;
        this.diagnostico = diagnostico;
        this.receita = receita;
    }
}