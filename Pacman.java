import java.awt.*;

public class Pacman extends Frame
{
    public Pacman()
    {
        super("Dibujo3");
    }

    public boolean handleEvent(Event event)
    {
        if(event.id==Event.WINDOW_DESTROY)
        {
            hide();
            dispose();
            return true;
        }
        else
        {
            return super.handleEvent(event);
        }
    }

    public void paint(Graphics g)               //acá se programan los graficos
    {
        Color color;

        g.setColor(Color.BLACK);
        g.fillRect(0,0, 350, 350);
        g.setColor(Color.YELLOW);
        g.fillArc(175, 175, 70, 70, 25, 340);
    }

    public static void main(String[] args) 
    {
        Pacman dibujo = new Pacman();
        dibujo.resize(350,350);
        dibujo.show();
    }
}