import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame implements ActionListener {
	private JPanel painelStatus;
	private JLabel labelStatus;
	private String titulo;

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menuArquivo;
	private JMenu menuSobre;
	private JMenuItem menuSobreAjuda;
	private JMenuItem menuSobreCreditos;
	private JMenuItem menuArquivoSair;
	private JMenuItem menuArquivoBranco;
	private JMenuItem menuArquivoCinzaClaro;
	private JMenuItem menuArquivoCinzaEscuro;
	private JMenuItem menuArquivoPreto;

	JanelaPrincipal(String titulo) throws HeadlessException {
		super(titulo);
		this.titulo = titulo;

		configuraJanela();

		criaAdicionaMenu();
		adicionaOuvinteMenus(this);
		inicializaAdicionaComponentes();

		// métodos antigos
		// inicializaComponentes();
		// adicionaComponentes();
	}

	// adiciona ouvintes
	private void adicionaOuvinteMenus(ActionListener ouvinte) {
		for (Component menuPrincipal : this.getJMenuBar().getComponents()) {
			if (menuPrincipal instanceof JMenu) {
				adicionaOuvinteItemMenu(ouvinte, (JMenu) menuPrincipal);
			}
		}

	}

	private void adicionaOuvinteItemMenu(ActionListener ouvinte, JMenu menuPrincipal) {
		for (Component alvo : menuPrincipal.getMenuComponents()) {
			if (alvo instanceof JMenuItem) {
				((JMenuItem) alvo).addActionListener(ouvinte);
			}
		}
	}

	private void criaAdicionaMenu() {
		menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic('A');

		menuArquivoBranco = new JMenuItem("Branco");
		menuArquivo.add(menuArquivoBranco);

		menuArquivoCinzaClaro = new JMenuItem("Cinza Claro");
		menuArquivo.add(menuArquivoCinzaClaro);

		menuArquivoCinzaEscuro = new JMenuItem("Cinza Escuro");
		menuArquivo.add(menuArquivoCinzaEscuro);

		menuArquivoPreto = new JMenuItem("Preto");
		menuArquivo.add(menuArquivoPreto);

		menuArquivo.addSeparator();

		menuArquivoSair = new JMenuItem("Sair");
		menuArquivo.add(menuArquivoSair);

		menuSobre = new JMenu("Sobre");
		menuSobre.setMnemonic('S');

		menuSobreAjuda = new JMenuItem("Ajuda");
		menuSobre.add(menuSobreAjuda);

		menuSobreCreditos = new JMenuItem("Autor");
		menuSobre.add(menuSobreCreditos);

		menuBar = new JMenuBar();
		menuBar.add(menuArquivo);
		menuBar.add(menuSobre);

		this.setJMenuBar(menuBar);
	}

	private void inicializaAdicionaComponentes() {
		this.painelStatus = new JPanel();
		this.labelStatus = new JLabel();
		this.painelStatus.add(labelStatus);
		this.painelStatus.setBackground(Color.gray);
		this.painelStatus.setBorder(BorderFactory.createEtchedBorder());
		this.add(painelStatus, BorderLayout.SOUTH);

	}

	private void adicionaComponentes() {
		this.add(painelStatus, BorderLayout.SOUTH);

	}

	private void inicializaComponentes() {
		this.painelStatus = new JPanel();

		this.labelStatus = new JLabel(this.titulo);

		this.painelStatus.setBackground(Color.gray);

		this.painelStatus.setBorder(BorderFactory.createEtchedBorder());

	}

	private void configuraJanela() {
		this.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 0.5),
				(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 0.45));

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new BorderLayout(5, 5));
	}

	public void inicia() {
		this.setMsgStatus(ConstantesGlobais.universidade);
		this.setVisible(true);
	}

	void setMsgStatus(String texto) {
		this.labelStatus.setText(texto);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		JOptionPane.showMessageDialog(this, evento.getActionCommand(), "Ação Solicitada",
				JOptionPane.INFORMATION_MESSAGE);

		if (evento.getSource() == menuArquivoSair) {
			System.exit(NORMAL);
		}
		if (evento.getSource() == menuArquivoBranco) {
			this.getContentPane().setBackground(Color.white);
		}
		if (evento.getSource() == menuArquivoPreto) {
			this.getContentPane().setBackground(Color.black);
		}
		if (evento.getSource() == menuArquivoCinzaClaro) {
			this.getContentPane().setBackground(Color.lightGray);
		}
		if (evento.getSource() == menuArquivoCinzaEscuro) {
			this.getContentPane().setBackground(Color.darkGray);
		}
		this.repaint();
	}
}
