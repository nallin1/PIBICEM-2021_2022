import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de trechos percorridos: ");
		int qtdTrechos = myScanner.nextInt();
		
		for(int contTrechos=1; contTrechos<=qtdTrechos; contTrechos++) {
			System.out.println("Trecho número: " + contTrechos);
			
			System.out.println("Digite a distância percorrida: (km) ");
			double distanciaPercorrida = myScanner.nextDouble();
			
			System.out.println("Digite o tempo no trecho: (min)");
			double tempoTrecho = myScanner.nextDouble();
			// min -> hr
			tempoTrecho = tempoTrecho/60;
			
			double velocidadeTrecho = distanciaPercorrida/tempoTrecho;
			
			System.out.println(" Trecho número: " + contTrechos +
					"\n Distância percorrida: " + distanciaPercorrida + "\n Tempo no trecho: "
					+ tempoTrecho + "\n Velocidade no trecho(km/h): " + velocidadeTrecho + "\n");
		}
	}

}
