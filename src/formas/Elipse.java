package formas;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Gonzalo de las Heras
 * @version 1.0
 */
public class Elipse extends Ellipse2D.Double implements formas.Herramienta{

    /**
     * Variable que indica la posición x de inicio de la elipse.
     */
    protected double xOrigen;
    /**
     * Variable que indica la posición y de inicio de la elipse.
     */
    protected double yOrigen;

    /**
     * Constructor por defecto.
     */
    public Elipse() {
        super();
    }

    /**
     * Método para mover la posición actual de la elipse.
     */
   
    @Override
    public void mover() {

    }

    /**
     * Método para, una vez tenemos el inicio de la elipse, saber hasta donde se
     * extiende.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
   
    @Override
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2) {
        if (evt.getX() > xOrigen) {
            this.width = evt.getX() - this.x;
        } else {
            this.x = evt.getX();
            this.width = xOrigen - this.x;
        }
        if (evt.getY() > yOrigen) {
            this.height = evt.getY() - yOrigen;
        } else {
            this.y = evt.getY();
            this.height = yOrigen - this.y;
        }
        this.pintar(g2);
    }

   
    /**
     * Método para pintar la elipse en un elemento gráfico.
     *
     * @param g2 Elemento gráfico para saber donde pintar.
     */
    @Override
    public void pintar(Graphics2D g2) {
        g2.draw(this);
    }

    /**
     * Método para definir el punto de inicio de la elipse.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
  
    @Override
    public void iniciar(java.awt.event.MouseEvent evt) {
        // Esquina superior izq circulo
        x = evt.getX();
        y = evt.getY();
        // Centro del circulo
        xOrigen = x;
        yOrigen = y;
    }
}
