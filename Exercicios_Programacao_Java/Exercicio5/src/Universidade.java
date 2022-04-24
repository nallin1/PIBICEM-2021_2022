
public class Universidade {
	private String nome;
	
	public Universidade() {
		this.nome = "Unicamp";
	}

	public Universidade(String nome) {
		if(nome.isEmpty()) {
			this.nome = "Unicamp";
		} else
			this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
