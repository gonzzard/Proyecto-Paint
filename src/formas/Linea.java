package formas;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

/**
 *
 * @author Gonzalo de las heras
 */
public class Linea extends Line2D.Double implements Herramienta {

    /**
     * Constructor por defecto.
     */
    public Linea() {
        super();
    }
/**
     * Método para mover la posición actual de la figura.
     */
    @Override
    public void mover() {

    }

    @Override
    public void reposicionar(MouseEvent evt, Graphics2D g2) {
        this.finalizarTrazo(evt);
        this.pintar(g2);
    }

    @Override
    public void pintar(Graphics2D g2) {
        g2.draw(this);
    }

    @Override
    public void iniciar(MouseEvent evt) {
        this.iniciarTrazo(evt);
    }

    public void iniciarTrazo(MouseEvent evt) {
        // Punto inicio
        this.x1 = evt.getX();
        this.y1 = evt.getY();
    }

    public void finalizarTrazo(MouseEvent evt) {
        // Punto fin
        this.x2 = evt.getX();
        this.y2 = evt.getY();
    }

}
