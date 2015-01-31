/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author Gonzalo de las Heras
 */
public class Borrar extends DibujoLibre {

    public Borrar(Stroke ancho) {
        super(new Color(Color.WHITE.getRGB()),ancho);
    }

    /**
     * Método para mover la posición actual de la figura.
     */
    public void mover() {

    }

    /**
     * Método para, una vez tenemos el inicio de la figura, saber hasta donde se
     * extiende.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     * @param g2 Elemento gráfico para saber donde pintar la elipse, una vez
     * tenemos sus paremétros definidos.
     */
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2) {
        g2.setColor(this.colorSeleccionado);
        //g2.setStroke(null);
        // Defino el final del trazo actual.
        trazos.get(trazoActual).x2 = evt.getX();
        trazos.get(trazoActual).y2 = evt.getY();

        // Defino el siguiente trazo.
        if (trazos.get(trazoActual).x1 != trazos.get(trazoActual).x2
                || trazos.get(trazoActual).y1 != trazos.get(trazoActual).y2) {
            g2.drawLine((int) trazos.get(trazoActual).x1, (int) trazos.get(trazoActual).y1,
                    (int) trazos.get(trazoActual).x2, (int) trazos.get(trazoActual).y2);
            trazoActual++;
            lineaAux = new Linea(this.colorSeleccionado, this.anchoTrazoSeleccionado);
            lineaAux.x1 = trazos.get(trazoActual - 1).x2;
            lineaAux.y1 = trazos.get(trazoActual - 1).y2;
            lineaAux.x2 = trazos.get(trazoActual - 1).x2;
            lineaAux.y2 = trazos.get(trazoActual - 1).y2;
            trazos.add(lineaAux);
        }
    }

    /**
     * Método para pintar la figura en un elemento gráfico.
     *
     * @param g2 Elemento gráfico para saber donde pintar.
     */
    public void pintar(Graphics2D g2) {
        g2.setColor(this.colorSeleccionado);
        for (Linea trazo : trazos) {
            g2.drawLine((int) trazo.x1, (int) trazo.y1, (int) trazo.x2, (int) trazo.y2);
        }

    }

    /**
     * Método para definir el punto de inicio de la figura.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    public void iniciar(java.awt.event.MouseEvent evt) {
        lineaAux = new Linea(this.colorSeleccionado, this.anchoTrazoSeleccionado);
        lineaAux.x1 = evt.getX();
        lineaAux.y1 = evt.getY();
        trazos.add(lineaAux);
    }

}
