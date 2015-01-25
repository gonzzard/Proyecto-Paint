package formas;

import java.awt.Graphics2D;

/**
 *
 * @author Gonzalo de las heras
 */
public class Cuadrado extends Rectangulo{
    /**
     * Constructor por defecto.
     */
    public Cuadrado() {
        super();
    }
    
    public void calcularCentro(){
    
    }
    /**
     * Método para mover la posición actual de la figura.
     */
    @Override
    public void mover() {
    }

    @Override
    public void reposicionar(java.awt.event.MouseEvent evt,Graphics2D g2) {
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
    public void calcularCentro(java.awt.event.MouseEvent evt){
    
    }
    
}
