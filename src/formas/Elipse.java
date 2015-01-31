package formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Gonzalo de las Heras
 * @version 1.0
 */
public class Elipse extends Ellipse2D.Double implements formas.Herramienta {

    /**
     * Variable que indica la posición x de inicio de la elipse.
     */
    protected double xOrigen;
    /**
     * Variable que indica la posición y de inicio de la elipse.
     */
    protected double yOrigen;
    Color colorTrazo;
    Color colorRelleno;
    Stroke anchoTrazo;

    /**
     * Constructor por defecto.
     * @param colorTrazo
     * @param anchoTrazo
     * @param colorRelleno
     */
    public Elipse(Color colorTrazo,Stroke anchoTrazo,Color colorRelleno) {
        super();
        this.colorTrazo = colorTrazo;
        this.anchoTrazo = anchoTrazo;
        this.colorRelleno = colorRelleno;
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
        //g2.setColor(this.colorSeleccionado);
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
        g2.setStroke(this.anchoTrazo);
        g2.setColor(this.colorTrazo);
       
        g2.draw(this); 
        g2.setPaint(colorRelleno);
        if (this.colorRelleno!=null)
        g2.fill(this);
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
