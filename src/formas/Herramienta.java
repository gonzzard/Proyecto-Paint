package formas;

import java.awt.Graphics2D;
import java.awt.Shape;

/**
 * @author Gonzalo de las heras
 */
public interface Herramienta extends Shape{

    /**
     * Método para mover la posición actual de la figura.
     */
    public void mover();

    /**
     * Método para, una vez tenemos el inicio de la figura, saber hasta donde se
     * extiende.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2);

    /**
     * Método para pintar la figura en un elemento gráfico.
     *
     * @param g2 Elemento gráfico para saber donde pintar.
     */
    public void pintar(Graphics2D g2);

    /**
     * Método para definir el punto de inicio de la figura.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    public void iniciar(java.awt.event.MouseEvent evt);
}
