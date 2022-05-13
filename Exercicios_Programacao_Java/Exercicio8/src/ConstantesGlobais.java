
public class ConstantesGlobais {
	public static final String autor = "Prof. Dr. Andre F. de Angelis";
	public static final String escola = "FT - Faculdade de Tecnologia";
	public static final String universidade = "Unicamp - Universidade Estadual de Campinas";
	public static final String nome = "Demonstração da Interface Gráfica de Usuário";
	public static final String versao = "Ver. 1.0.0";

	public static final String arqLogotipo = "logouni.jpg";

	static String getTextoSobre() {
		final StringBuffer text = new StringBuffer();

		text.append("\n");
		text.append(universidade);
		text.append("\n");
		text.append(escola);
		text.append("\n");
		text.append(autor);
		text.append("\n");
		text.append(nome);
		text.append("\n");
		text.append(versao);
		text.append("\n");

		return (text.toString());
	}

	static String getTextoAjuda() {
		StringBuilder text = new StringBuilder();

		text.append("\n");
		text.append("Este é um programa simples para exemplo de aplicação Java com interface gráfica.\n");
		text.append("\n");
		text.append("Aviso: este programa foi projetado e implementado apenas com fins educacionais.\n");
		text.append("Não há garantia de tipo nenhum, implícita ou explícita.\n");
		text.append("\n");
		text.append("NÃO use este programa em situações onde ele possa causar ou contribuir para\n");
		text.append("   risco de morte, ferimentos ou danos de qualquer natureza.\n");
		text.append("\n");

		return (text.toString());
	}

	static String getNomeVersao() {
		return (nome + " " + versao);
	}
}
