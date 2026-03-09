import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class DibujoGraficos extends Frame
{
    public DibujoGraficos()
    {
        super("Dibujo");
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                dispose();
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)               //acá se programan los graficos
    {
        Graphics2D g2d = (Graphics2D) g; 

        /*
        g2d.setBackground(Color.PINK);
        g2d.clearRect(0,0, getHeight(), getWidth());

        g2d.setStroke(new BasicStroke(5.0f));

        Line2D linea = new Line2D.Float(50, 50, 150, 150);
        g2d.draw(linea);

        g2d.draw(new Line2D.Float(150,150,90,10));
        g2d.setColor(Color.red);
        g2d.fill( new Rectangle2D.Float(50,90,70,50));

        g2d.setPaint(new GradientPaint(150,150, Color.YELLOW, 250, 250, Color.BLUE, true));
        g2d.fill(new Ellipse2D.Float(150,150,100,100));
        */

        /* Espacio */
 
        //g2d.drawOval(80, 100, 100, 100);
        g2d.setBackground(Color.red);
        g2d.clearRect(0,0, getHeight(), getWidth());
        g2d.setPaint(new GradientPaint(80,150, Color.yellow, 180, 150, Color.orange, true));
        g2d.fill(new Arc2D.Float(80,100,100,100,30,280,Arc2D.PIE));
        
        

    }

    public static void main(String[] args) 
    {
        DibujoGraficos dibujo = new DibujoGraficos();
        dibujo.setSize(350,350);
        dibujo.setVisible(true);
    }
}