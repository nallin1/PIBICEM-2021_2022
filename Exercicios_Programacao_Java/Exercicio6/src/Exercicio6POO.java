import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6POO
    {
    public static void main(String[] args)
       {
       (new Controle()).processa();
       }
    }

class Controle
    {
    private Scanner           myScanner = new Scanner(System.in);
    private ArrayList<Trecho> trechos   = new ArrayList<Trecho>();

    public void processa()
       {
       lerDados();
       imprimirResultados();
       }

    private void lerDados()
       {
       boolean loop  = true;
       int     id    = 0;
       double  dist  = -1.0;
       double  tempo = 0.0;

       System.out.println("Entrada de dados dos trechos (0.0 na distância para terminar");

       while (loop)
          {
          System.out.println("Trecho número: " + (++id));
          System.out.println("Distância percorrida: (metros) ");
          dist = myScanner.nextDouble();

          if (dist > 0.0)
             {
             System.out.println("Tempo no trecho: (minutos) ");
             tempo = myScanner.nextDouble();
             trechos.add(new Trecho(id, dist, tempo));
             }
          else
             {
             loop = false;
             }
          }
       System.out.println("Entrada de dados finalizada.\n");
       }

    private void imprimirResultados()
       {
       double somaDist = 0.0;
       double somaTempo = 0.0;

       System.out.println("Trecho\tDist.Km\tTempo min\tVel. Km/h");

       for (Trecho trecho : trechos)
          {
          System.out.println(trecho.getTrechoId() + "\t" +
(trecho.getDistanciaMetros() / 1000.0) + "\t" + trecho.getTempoMinutos()
+ "\t\t"
                             + ((trecho.getDistanciaMetros() / 1000.0) /
(trecho.getTempoMinutos() / 60.0)));
          somaDist += trecho.getDistanciaMetros();
          somaTempo += trecho.getTempoMinutos();
          }

       System.out.println("\nResumo:");
       System.out.println("Distância total (Km): " + somaDist/1000.0);
       System.out.println("Velocidade média (Km/h): " +
(somaDist/1000.0)/(somaTempo/60.0));
       }
    }

class Trecho
    {
    private int    trechoId;
    private double distanciaMetros;
    private double tempoMinutos;

    Trecho(int trechoId, double distanciaMetros, double tempoMinutos)
       {
       super();
       this.trechoId        = trechoId;
       this.distanciaMetros = distanciaMetros;
       this.tempoMinutos    = tempoMinutos;
       }

    final int getTrechoId()
       {
       return trechoId;
       }

    final double getDistanciaMetros()
       {
       return distanciaMetros;
       }

    final double getTempoMinutos()
       {
       return tempoMinutos;
       }

    }