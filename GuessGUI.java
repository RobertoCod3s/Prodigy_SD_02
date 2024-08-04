import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGUI {
    private static JFrame frame;


    public static void main(String[] args) {
        //Basic SetUp of Frame
        frame = new JFrame("Guess A Number Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);
        frame.setLayout(new CardLayout()));

        startFrame();



        //North Guess a number text with panel to place button to enter a game


        //Center 2 spaces 1 for input and 1 for correct or incorrectness Needs a Pane;

        //South For High Score and The number 2 labels


    }

    public static JPanel startFrame() {
        //Basic SetUp
        


        //JPanel with Flow Layout with Label and space to enter details;
        JPanel startText = new JPanel(new FlowLayout());

        //Creating Components
        JLabel textToStart = new JLabel("Guess A Number Between 0 and");
        JTextField textFieldToStart = new JTextField(2);

        //Adding Components to Panel
        startText.add(textToStart);startText.add(textFieldToStart);

        //Adding Panel to Frame
        frame.add(startText);

        // Play Button
        JButton play = new JButton("PLAY");
        frame.add(play);
        //Pressing the button will:
            //1) Read what is in textfield
            //2) Verify stuff in textfield is a number if not display relevant error message using JOptionPane
            //3) Enter what is textfield in the program
            //4) Hide This panel and make game panel visible;


        frame.setAlwaysOnTop(true);
        frame.setVisible(true);

        return frame;
    }

    public static JFrame makeGameFrame(int Upperbound) {
        //Basic SetUp
        frameGame = new JFrame("Guess A Number Game");
        frameGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGame.setSize(300, 120);
        frameGame.setLayout(new BorderLayout());

        frameGame.setAlwaysOnTop(true);
        frameGame.setVisible(true);
        return frameGame;
    }

    //public static void playGame(int ){}

}
