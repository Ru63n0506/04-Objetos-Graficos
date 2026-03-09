import java.awt.*;
import java.awt.event.*;

public class Dibujo extends Frame
{
    public Dibujo()
    {
        super("Dibujo");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)               //acá se programan los graficos
    {
        Font font = new Font("Times New Roman", Font.BOLD, 18);
        
        g.setFont(font);
        g.setColor(Color.orange);
        g.drawString("Saludos programas!!", 100, 100);
        g.drawLine(50, 90, 175, 200);
        g.drawRect(145, 150, 90, 70);
        g.fillRect(190, 200, 90, 70);
        g.clearRect(215, 215, 90, 70);

        g.setColor(Color.blue);
        g.fillRoundRect(190, 90, 100, 100, 15, 80);
        g.fillOval(10, 300, 50, 90);
        g.fillOval(150, 90, 50, 50);

    }

    public static void main(String[] args) 
    {
        Dibujo dibujo = new Dibujo();
        dibujo.setSize(350,350);
        dibujo.setVisible(true);
    }
}