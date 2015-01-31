package formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Gonzalo de las heras
 */
public class Rectangulo extends Rectangle2D.Double implements formas.Herramienta {

    protected double xOrigen;
    protected double yOrigen;
    Color colorSeleccionado;
    Stroke anchoTrazoSeleccionado;

    /**
     * Constructor por defecto.
     */
    public Rectangulo(Color color, Stroke ancho) {
        super();
        this.colorSeleccionado= color;
        this.anchoTrazoSeleccionado = ancho;
    }

    /**
     * Método para mover la posición actual del rectángulo.
     */
  
    @Override
    public void mover() {
    }

    /**
     * Método para, una vez tenemos el inicio del rectángulo, saber hasta donde se
     * extiende.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
    
    @Override
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2) {
       // g2.setColor(this.colorSeleccionado);
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
     * Método para pintar el rectángulo en un elemento gráfico.
     *
     * @param g2 Elemento gráfico para saber donde pintar.
     */

  
    @Override
    public void pintar(Graphics2D g2) {
        g2.setStroke(this.anchoTrazoSeleccionado);
        g2.setColor(this.colorSeleccionado);
        g2.draw(this);
    }

    /**
     * Método para definir el punto de inicio del rectángulo.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    
    @Override
    public void iniciar(java.awt.event.MouseEvent evt) {
        // Esquina superior izq rectangulo
        xOrigen = evt.getX();
        yOrigen = evt.getY();
        this.x = xOrigen;
        this.y = yOrigen;
    }

}
