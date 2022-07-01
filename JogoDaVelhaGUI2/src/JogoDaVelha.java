import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JogoDaVelha extends JFrame implements MouseListener {

	JFrame myFrame;
	int flag=2;
	int mPosition;
	int nPosition;
	int index=0;
	char check[] = new char[9];
	
	public JogoDaVelha() {
		myFrame = new JFrame("Jogo da Velha - :)");
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setSize(600,600);
		myFrame.addMouseListener(this);
		myFrame.setLocationRelativeTo(null);
		
		for (index=0; index<9; index++)
			check[index] = 'B';
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		 Graphics myGraphics = myFrame.getGraphics();
		 myGraphics.drawLine(200, 0, 200, 600);
		 myGraphics.drawLine(400, 0, 400, 600);
		 myGraphics.drawLine(0, 200, 600, 200);
		 myGraphics.drawLine(0, 400, 600, 400);
		 flag--;
		 int xPosition = e.getX();
		 int yPosition = e.getY();
		 if (flag==1) {
			 if(xPosition<200&&yPosition<200){mPosition=0;nPosition=0;check[0]='R';}
	            if((xPosition>200&&xPosition<400)&&(yPosition<200)){mPosition=200;nPosition=0;check[1]='R';}
	            if((xPosition>400&&xPosition<600)&&(yPosition<200)){mPosition=400;nPosition=0;check[2]='R';}
	            if(xPosition<200&&(yPosition>200&&yPosition<400)){mPosition=0;nPosition=200;check[3]='R';}
	            if((xPosition>200&&xPosition<400)&&(yPosition>200&&yPosition<400)){mPosition=200;nPosition=200;check[4]='R';}
	            if((xPosition>400&&xPosition<600)&&(yPosition>200&&yPosition<400)){mPosition=400;nPosition=200;check[5]='R';}
	            if(xPosition<200&&(yPosition>400&&yPosition<600)){mPosition=0;nPosition=400;check[6]='R';}
	            if((xPosition>200&&xPosition<400)&&(yPosition>400&&yPosition<600)){mPosition=200;nPosition=400;check[7]='R';}
	            if((xPosition>400&&xPosition<600)&&(yPosition>400&&yPosition<600)){mPosition=400;nPosition=400;check[8]='R';}
	            myGraphics.setColor(Color.red);
	            // desenha X
	            myGraphics.drawLine(mPosition,nPosition,mPosition+199,nPosition+199);
	            myGraphics.drawLine(mPosition+199,nPosition,mPosition,nPosition+199);
		 }
		 if (flag == 0) {
			 	if(xPosition<200&&yPosition<200){mPosition=0;nPosition=20;check[0]='P';}
			 	if((xPosition>200&&xPosition<400)&&(yPosition<200)){mPosition=200;nPosition=20;check[1]='P';}
			 	if((xPosition>400&&xPosition<600)&&(yPosition<200)){mPosition=400;nPosition=20;check[2]='P';}
			 	if(xPosition<200&&(yPosition>200&&yPosition<400)){mPosition=0;nPosition=200;check[3]='P';}
	            if((xPosition>200&&xPosition<400)&&(yPosition>200&&yPosition<400)){mPosition=200;nPosition=200;check[4]='P';}
	            if((xPosition>400&&xPosition<600)&&(yPosition>200&&yPosition<400)){mPosition=400;nPosition=200;check[5]='P';}
	            if(xPosition<200&&(yPosition>400&&yPosition<600)){mPosition=0;nPosition=400;check[6]='P';}
	            if((xPosition>200&&xPosition<400)&&(yPosition>400&&yPosition<600)){mPosition=200;nPosition=400;check[7]='P';}
	            if((xPosition>400&&xPosition<600)&&(yPosition>400&&yPosition<600)){mPosition=400;nPosition=400;check[8]='P';}
	            // desenha O
	            myGraphics.setColor(Color.green);
	            myGraphics.drawOval(mPosition+10,nPosition+10,169,169);
	            flag += 2;
		 }
		 for(index=0;index<9;index++){
	            if(check[index]!='B')
	            {
	                if(index==8) {
	                // empate
	                	
	                JOptionPane jOptionPane = new JOptionPane();
	                int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Empate", "Resultado", JOptionPane.DEFAULT_OPTION);

	                if (dialog == JOptionPane.OK_OPTION)
	                    System.exit(0);
	                }
	            }
	            else
	            break;
		 }
		 
		 for (index=0;index<3;index++) {
			 if(check[index]!='B')
	            {
	                if((check[index+3]==check[index])&&(check[index+6]==check[index])) {
	                	// fim de jogo
	                	JOptionPane jOptionPane = new JOptionPane();
		                int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Fim de jogo !", "Resultado", JOptionPane.DEFAULT_OPTION);

		                if (dialog == JOptionPane.OK_OPTION)
		                    System.exit(0);
	                }
	            }
		 }
		 for(index=0;index<7;index++)
	        {
	            
	            if(check[index]!='B')
	            {
	                if((check[index]==check[index+1])&&(check[index]==check[index+2])) {
	                	// fim de jogo
	                	JOptionPane jOptionPane = new JOptionPane();
	                	int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Fim de jogo !", "Resultado", JOptionPane.DEFAULT_OPTION);

	                	if (dialog == JOptionPane.OK_OPTION)
	                		System.exit(0);
	                }
	                index+=2;
	            }
	            else
	            	index+=2;
	        }
		 if(check[4]!='B') 
	     {
			 if(((check[0]==check[4])&&(check[4]==check[8]))||((check[2]==check[4])&&(check[4]==check[6]))) {
				// fim de jogo
				JOptionPane jOptionPane = new JOptionPane();
             	int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Fim de jogo !", "Resultado", JOptionPane.DEFAULT_OPTION);

             	if (dialog == JOptionPane.OK_OPTION)
             		System.exit(0);
			 }
	     }
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		new JogoDaVelha();
	}

}
