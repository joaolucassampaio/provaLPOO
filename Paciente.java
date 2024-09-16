package exercicioDois;

public class Paciente {
	private String nome, cpf, dataNasc, historico;

	public Paciente(String nome, String cpf, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
	public String toString ()
	{	
		return (this.getNome()+"   "+this.getCpf()+"   "+this.getDataNasc()+"\n"+
				this.getHistorico());
	}

	
	
	

}
