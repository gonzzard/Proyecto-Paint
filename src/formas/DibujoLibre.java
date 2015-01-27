/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.awt.Graphics2D;
import java.util.ArrayList;


/**
 *
 * @author Gonzalo
 */
public class DibujoLibre extends Linea {

    ArrayList<Linea> trazos = new ArrayList<>();
    int trazoActual = 0;
    Linea lineaAux;

    public DibujoLibre() {

    }

    /**
     * Método para mover la posición actual de la figura.
     */
    @Override
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
    @Override
    public void reposicionar(java.awt.event.MouseEvent evt, Graphics2D g2) {
        // Defino el final del trazo actual.
        trazos.get(trazoActual).x2 = evt.getX();
        trazos.get(trazoActual).y2 = evt.getY();

        // Defino el siguiente trazo.
        if (trazos.get(trazoActual).x1 != trazos.get(trazoActual).x2
                || trazos.get(trazoActual).y1 != trazos.get(trazoActual).y2) {
            g2.drawLine((int) trazos.get(trazoActual).x1, (int) trazos.get(trazoActual).y1,
                    (int) trazos.get(trazoActual).x2, (int) trazos.get(trazoActual).y2);
            trazoActual++;
            lineaAux = new Linea();
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
    @Override
    public void pintar(Graphics2D g2) {
        for (int i = 0; i < trazos.size(); i++) {
            g2.drawLine((int) trazos.get(i).x1, (int) trazos.get(i).y1,
                    (int) trazos.get(i).x2, (int) trazos.get(i).y2);
        }
    }

    /**
     * Método para definir el punto de inicio de la figura.
     *
     * @param evt Evento empleado para saber la posición actual del ratón.
     */
    @Override
    public void iniciar(java.awt.event.MouseEvent evt) {
        lineaAux = new Linea();
        lineaAux.x1 = evt.getX();
        lineaAux.y1 = evt.getY();
        trazos.add(lineaAux);
    }

}
