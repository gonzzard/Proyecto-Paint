package formas;

import java.awt.Graphics2D;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Gonzalo de las heras
 */
public class Circulo extends Elipse {

    private double radio;

    /**
     * Constructor por defecto.
     */
    public Circulo() {
        super();
    }

    /**
     * Método para mover la posición actual de la figura.
     */
    @Override
    public void mover() {
    }

    /**
     * Método para, una vez tenemos el centro del círculo, extenderlo desde el
     * mismo hasta donde indique el ratón.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
    @Override
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2) {
        this.calcularRadio(evt);
        this.x = xOrigen - radio;
        this.y = yOrigen - radio;
        this.height = radio * 2;
        this.width = this.height;
        this.pintar(g2);
    }

    public void calcularRadio(java.awt.event.MouseEvent evt) {
        double radio, d1, d2;
        d1 = evt.getX() - xOrigen;
        if (d1 < 0) {
            d1 = xOrigen - evt.getX();
        }
        d2 = evt.getY() - yOrigen;
        if (d2 < 0) {
            d2 = yOrigen - evt.getY();
        }
        radio = pow(d1, 2) + pow(d2, 2); // modulo vector
        if (radio < 0) {
            radio = radio * -1;
        }
        radio = sqrt(radio);
        this.radio = radio;
    }

}
