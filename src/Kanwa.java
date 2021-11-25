import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Kanwa extends JPanel implements MouseInputListener {

    boolean rysujR=false;
    boolean rysujC=false;

    public Kanwa(){
        setSize(400, 300);
        setBackground(Color.GRAY);
        setBorder(new LineBorder(new Color(0,0,0), 1, true));
        setLayout(null);
        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_R){
                    rysujR=true;
                    repaint();
                }
                if(e.getKeyCode()==KeyEvent.VK_C){
                    rysujC=true;
                    repaint();
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        if(rysujR==true){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.PINK);
            Rectangle2D rectangle = new Rectangle2D.Double(getMousePosition().getX(), getMousePosition().getY(), 50, 50);
            g2d.draw(rectangle);
            rysujR=false;
        }
        if(rysujC==true){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.MAGENTA);
            Ellipse2D ellipse = new Ellipse2D.Double(getMousePosition().getX(), getMousePosition().getY(),50, 50);
            g2d.draw(ellipse);
            rysujC=false;
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
