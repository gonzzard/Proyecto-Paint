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
 * @author Gonzalo
 */
public class DibujarTexto extends Linea implements Herramienta {

    String texto;
    int posX;
    int posY;

    public DibujarTexto(String texto, Color color, Stroke ancho) {
        super(color, ancho );
        this.texto = texto;       
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
        g2.drawString(texto, evt.getX(), evt.getY());
        posX = evt.getX();
        posY = evt.getY();
    }

    /**
     * Método para pintar la figura en un elemento gráfico.
     *
     * @param g2 Elemento gráfico para saber donde pintar.
     */
    @Override
    public void pintar(Graphics2D g2) {
        g2.setColor(this.colorSeleccionado);
        g2.drawString(texto, posX, posY);
    }

    /**
     * Método para definir el punto de inicio de la figura.
     *
     * @param texto Evento empleado para saber la posición actual del ratón.
     */
    public void iniciar(String texto) {
        this.texto = texto;

    }

}
