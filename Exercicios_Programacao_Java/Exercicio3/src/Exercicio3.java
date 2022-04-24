
public class Exercicio3 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		System.out.println("Os dados da primeira pessoa são: \n Nome: " + p1.getNome() + "\n Idade: "
				+ p1.getIdade() + "\n Salário: " + p1.getSalario());
		
		Pessoa p2 = new Pessoa("Guilherme" , 17, 5000);
		
		System.out.println("\nOs dados da segunda pessoa são: \n Nome: " + p2.getNome() + "\n Idade: "
				+ p2.getIdade() + "\n Salário: " + p2.getSalario());
	}
}
