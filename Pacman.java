import java.awt.*;
import java.awt.event.*;

public class Pacman extends Frame
{
    public Pacman()
    {
        super("Dibujo3");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)               //acá se programan los graficos
    {
        g.setColor(Color.BLACK);
        g.fillRect(0,0, 350, 350);
        g.setColor(Color.YELLOW);
        g.fillArc(175, 175, 70, 70, 25, 340);
    }

    public static void main(String[] args) 
    {
        Pacman dibujo = new Pacman();
        dibujo.setSize(350,350);
        dibujo.setVisible(true);
    }
}