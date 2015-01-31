package formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

/**
 *
 * @author Gonzalo de las heras
 */
public class Linea extends Line2D.Double implements formas.Herramienta {

    Color colorSeleccionado;
    Stroke anchoTrazoSeleccionado;

    /**
     * Constructor por defecto.
     */
    public Linea(Color color, Stroke ancho) {
        super();
        this.colorSeleccionado = color;
        this.anchoTrazoSeleccionado = ancho;
    }

    /**
     * Método para mover la posición actual de la línea.
     */
    @Override
    public void mover() {

    }

    /**
     * Método para, una vez tenemos el inicio de la línea, saber hasta donde se
     * extiende.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
    @Override
    public void reposicionar(MouseEvent evt, Graphics2D g2) {
        this.finalizarTrazo(evt);
        this.pintar(g2);
    }

    /**
     * Método para pintar la línea en un elemento gráfico.
     *
     * @param g2 Elemento gráfico para saber donde pintar.
     */
    @Override
    public void pintar(Graphics2D g2) {
         g2.setStroke(anchoTrazoSeleccionado);
         g2.setColor(colorSeleccionado);
        g2.draw(this);
    }

    /**
     * Método para definir la línea.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    @Override
    public void iniciar(MouseEvent evt) {
        this.iniciarTrazo(evt);
    }

    /**
     * Método para definir el punto de inicio de la línea.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    public void iniciarTrazo(MouseEvent evt) {
        // Punto inicio
        this.x1 = evt.getX();
        this.y1 = evt.getY();
    }

    /**
     * Método para definir el punto de fin de la línea.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    public void finalizarTrazo(MouseEvent evt) {
        // Punto fin
        this.x2 = evt.getX();
        this.y2 = evt.getY();
    }

}
