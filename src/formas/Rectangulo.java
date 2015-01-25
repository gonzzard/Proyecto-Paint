package formas;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Gonzalo de las heras
 */
public class Rectangulo extends Rectangle2D.Double implements Herramienta {

    protected double xOrigen;
    protected double yOrigen;
/**
     * Constructor por defecto.
     */
    public Rectangulo() {
        super();
    }
/**
     * Método para mover la posición actual de la figura.
     */
    @Override
    public void mover() {
    }

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

    @Override
    public void pintar(Graphics2D g2) {
        g2.draw(this);
    }

    @Override
    public void iniciar(java.awt.event.MouseEvent evt) {
        // Esquina superior izq rectangulo
        xOrigen = evt.getX();
        yOrigen = evt.getY();
        this.x = xOrigen;
        this.y = yOrigen;
    }

}
