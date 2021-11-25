import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MainClass extends JFrame{


        public static void main(String[] args) {
            MainClass okno = new MainClass();
            okno.MainWindow();
        }

        void MainWindow(){

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 450);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(null);
            setContentPane(mainPanel);

            Kanwa kanwa = new Kanwa();
            mainPanel.add(kanwa);
            kanwa.setRequestFocusEnabled(true);
            JButton b1 = new JButton("Run");
            b1.setMnemonic(KeyEvent.VK_L);
            b1.setSize(100, 50);
            b1.setLocation(5, 355);
            b1.addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    super.mouseMoved(e);
                    if(b1.getMousePosition().getX()<=80){
                        b1.setLocation(RandomLocation(280), RandomLocation(55)+300);
                    }
                }
            });
            mainPanel.add(b1);

            JButton b2 = new JButton("Cancel");
            b2.setSize(100, 50);
            b2.setLocation(280, 355);
            b2.addActionListener(e -> {
                b1.setLocation(5, 355);
            });
            mainPanel.add(b2);

            setVisible(true);
        }

        int RandomLocation(int border){
            Random rand = new Random();
            return rand.nextInt(border);
        }

}


