import java.awt.HeadlessException;

public class Exercicio8 {

	public static void main(String[] args) {
		try {
			JanelaPrincipal programa = new JanelaPrincipal(Exercicio8.class.getName());
			programa.inicia();
		} catch (HeadlessException excecao) {
			imprimeMsgErroETermina("Mensagem de erro gerada por HeadlessException", excecao);
		} catch (Exception excecao) {
			imprimeMsgErroETermina("Mensagem de erro...", excecao);
		}

	}

	private static void imprimeMsgErroETermina(String mensagem, Exception ocorrencia) {
		System.out.println("Mensagem de erro:\t" + mensagem);
		System.out.println("Texto da exceção:\t" + ocorrencia.getMessage());
		
		System.exit(1);
	}

}
