import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class JogoDaVelha extends JPanel {

    char playerSign = 'x';
    int totalCells = 9;
    int totalRows = 3;
    int totalColumns = 3;
    JButton[] jButtons = new JButton[totalCells];

    public JogoDaVelha() {
        GridLayout ticTacToeGridLayout = new GridLayout(totalRows, totalColumns);
        setLayout(ticTacToeGridLayout);

        createButtons();

    }

    public void createButtons() {
        for (int i = 0; i <= 8; i++) {

            jButtons[i] = new JButton();

            jButtons[i].setText("");

            jButtons[i].addActionListener(e -> {

                JButton clickedBtn = (JButton) e.getSource();
                clickedBtn.setText(String.valueOf(playerSign));
                clickedBtn.setEnabled(false);


                if (playerSign == 'x')
                    playerSign = 'o';
                else
                    playerSign = 'x';

                showWinner();
            });

            add(jButtons[i]);
        }
    }


    public void showWinner() {

        if (checkForWinner()) {

            if (playerSign == 'x') playerSign = 'o';
            else playerSign = 'x';

            JOptionPane jOptionPane = new JOptionPane();
            int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Fim de jogo... ", "Resultado",
                    JOptionPane.DEFAULT_OPTION);

            if (dialog == JOptionPane.OK_OPTION)
                System.exit(0);


        } else if (checkIfMatchDraw()) {
            JOptionPane jOptionPane = new JOptionPane();
            int dialog = JOptionPane.showConfirmDialog(jOptionPane, "Empate", "Resultado", JOptionPane.DEFAULT_OPTION);

            if (dialog == JOptionPane.OK_OPTION)
                System.exit(0);
        }
    }


    public boolean checkIfMatchDraw() {
        boolean gridsFull = true;
        for (int i = 0; i < totalCells; i++) {
            if (jButtons[i].getText().equals("")) {
                gridsFull = false;
            }
        }
        return gridsFull;
    }

    public boolean checkForWinner() {
        return checkAllRows() || checkAllColumns() || checkTheDiagonals();
    }

    public boolean checkAllRows() {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            if (jButtons[i].getText().equals(jButtons[i + 1].getText()) && jButtons[i].getText().equals(jButtons[i + 2].getText())
                    && !jButtons[i].getText().equals("")) {
                return true;
            }
            i = i + 3;

        }
        return false;
    }


    public boolean checkAllColumns() {

        int i = 0;
        for (int j = 0; j < 3; j++) {

            if (jButtons[i].getText().equals(jButtons[i + 3].getText()) && jButtons[i].getText().equals(jButtons[i + 6].getText())
                    && !jButtons[i].getText().equals("")) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean checkTheDiagonals() {
        if (jButtons[0].getText().equals(jButtons[4].getText()) && jButtons[0].getText().equals(jButtons[8].getText())
                && !jButtons[0].getText().equals(""))
            return true;
        else
            return jButtons[2].getText().equals(jButtons[4].getText()) && jButtons[2].getText().equals(jButtons[6].getText())
                    && !jButtons[2].getText().equals("");
    }


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Jogo da Velha");

        jFrame.getContentPane().add(new JogoDaVelha());
        jFrame.setBounds(500, 500, 600, 550);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }

}