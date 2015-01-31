package formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author Gonzalo de las heras
 */
public class Cuadrado extends Rectangulo {

    /**
     * Constructor por defecto.
     */
    public Cuadrado(Color color, Stroke ancho) {
        super(color, ancho);
    }

    /**
     * Método para mover la posición actual del cuadrado.
     */
    @Override
    public void mover() {
    }

    /**
     * Método para, una vez tenemos el inicio del cuadrado, saber hasta donde se
     * extiende.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
    @Override
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2) {
        g2.setColor(this.colorSeleccionado);
        double xDistancia = xOrigen - evt.getX();
        if (xDistancia < 0) {
            xDistancia = evt.getX() - xOrigen;
        }
        double yDistancia = yOrigen - evt.getY();
        if (yDistancia < 0) {
            yDistancia = evt.getY() - yOrigen;
        }
        if (xDistancia < yDistancia) {
            xDistancia = yDistancia;
        }
        this.x = xOrigen - xDistancia;
        this.y = yOrigen - xDistancia;
        this.width = xDistancia * 2;
        this.height = this.width;
        this.pintar(g2);
    }
    /**
     * Método para calcular el centro del cuadrado.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */

    public void calcularCentro(java.awt.event.MouseEvent evt) {

    }

}
