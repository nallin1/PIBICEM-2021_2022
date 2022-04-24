

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	
	public Pessoa() {
		this.nome = "João";
		this.idade = 18;
		this.salario = 1200.3;
	}
	
	public Pessoa(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
