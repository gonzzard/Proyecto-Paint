
import com.sun.glass.ui.Cursor;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import static javafx.scene.Cursor.cursor;
import javax.swing.ImageIcon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gonzalo
 */
public class Ventana extends javax.swing.JFrame {

    // Buffer
    private BufferedImage buffer = null;

    // Formas
    private Line2D.Double linea = new Line2D.Double();
    private Ellipse2D.Double circulo = new Ellipse2D.Double();
    private Rectangle2D.Double rectangulo = new Rectangle2D.Double();
    private ArrayList<Shape> objetos = new ArrayList<Shape>();

    /**
     * Variable para las opciones:
     *
     * Opcion 1: Circulo, Opcion 2: Cuadrado, Opcion 3: Linea, Opcion 4: Libre,
     * Opcion 5: Elipse, Opcion 6: Rectangulo
     */
    int opcion = 3;
    int x1, x2, y1, y2;
    double xOrigen, yOrigen;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        int ancho = jPanel1.getWidth();
        int alto = jPanel1.getHeight();
        objetos.add(circulo);
        buffer = (BufferedImage) jPanel1.createImage(ancho, alto);
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, ancho, alto);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jButton8 = new javax.swing.JButton();

        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        jButton1.setText("O");
        jButton1.setToolTipText("Círculo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setText("D");
        jButton2.setToolTipText("Cuadrado");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("l");
        jButton3.setToolTipText("Línea");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jButton4.setText("S");
        jButton4.setToolTipText("Estilo libre");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton5.setText("0");
        jButton5.setToolTipText("Elipse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setText("D");
        jButton6.setToolTipText("Rectángulo");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jSlider1.setPaintLabels(true);

        jButton8.setText("Colores");
        jButton8.setToolTipText("Colores");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(0, 135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6))
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (opcion) {
            // Circulo
            case 1:
                // Esquina superior izq circulo
                circulo.x = evt.getX();
                circulo.y = evt.getY();
                //centro
                xOrigen = circulo.x;
                yOrigen = circulo.y;
                break;
            // Rectangulo    
            case 2:
                // Esquina superior izq cuadrado
                xOrigen = evt.getX();
                yOrigen = evt.getY();
                rectangulo.x = xOrigen;
                rectangulo.y = yOrigen;
                break;
            // Linea
            case 3:
                // Punto inicio
                linea.x1 = evt.getX();
                linea.y1 = evt.getY();
                break;
            // Libre
            case 4:
                x1 = evt.getX();
                y1 = evt.getY();
                break;
            case 5:
                // Esquina superior izq elipse
                circulo.x = evt.getX();
                circulo.y = evt.getY();
                xOrigen = circulo.x;
                yOrigen = circulo.y;
                break;
            case 6:
                // Esquina superior izq rectangulo
                xOrigen = evt.getX();
                yOrigen = evt.getY();
                rectangulo.x = xOrigen;
                rectangulo.y = yOrigen;
                break;
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);
        switch (opcion) {
            case 1:
                double radio,
                 d1,
                 d2;
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
                circulo.x = xOrigen - radio;
                circulo.y = yOrigen - radio;
                circulo.height = radio * 2;
                circulo.width = circulo.height;
                g2.draw(circulo);
                break;
            case 2:
                double distancia = xOrigen - evt.getX();
                if (distancia < 0 )
                    distancia = evt.getX() - xOrigen;
                double yDistancia = yOrigen - evt.getY();
                if (yDistancia < 0 )
                    yDistancia = evt.getY() - yOrigen;
                if (distancia < yDistancia)
                    distancia = yDistancia;
                rectangulo.x = xOrigen - distancia;
                rectangulo.y = yOrigen - distancia;
                rectangulo.width = distancia * 2;
                rectangulo.height = rectangulo.width;
                g2.draw(rectangulo);
                break;
            case 3:
                linea.x2 = evt.getX();
                linea.y2 = evt.getY();
                g2.draw(linea);
                break;
            case 4:
                Graphics2D g3 = (Graphics2D) buffer.getGraphics();
                g3.setStroke(new BasicStroke(jSlider1.getValue()));
                x2 = evt.getX();
                y2 = evt.getY();
                if (x1 != x2 || y1 != y2) {
                    g3.drawLine(x1, y1, x2, y2);
                    x1 = x2;
                    y1 = y2;
                }
                break;
            case 5:
                if (evt.getX() > xOrigen) {
                    circulo.width = evt.getX() - circulo.x;
                } else {
                    circulo.x = evt.getX();
                    circulo.width = xOrigen - circulo.x;
                }
                if (evt.getY() > yOrigen) {
                    circulo.height = evt.getY() - yOrigen;
                } else {
                    circulo.y = evt.getY();
                    circulo.height = yOrigen - circulo.y;
                }
                g2.draw(circulo);
                break;
            case 6:
                dibujarRectangulo(evt, g2);
        }

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        //buffer
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        switch (opcion) {
            case 1:
                g2.draw(circulo);
                break;
            case 2:
                g2.draw(rectangulo);
                break;
            case 3:
                g2.draw(linea);
                break;
            case 4:
                g2.drawLine(evt.getX(), evt.getY(), evt.getX(), evt.getY());
                break;
            case 5:
                g2.draw(circulo);
                break;
            case 6:
                g2.draw(rectangulo);
                break;
        }
        //panel
        g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        opcion = 5;
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        opcion = 1;
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        opcion = 2;
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        opcion = 3;
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        opcion = 4;
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        opcion = 6;
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton8MousePressed

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    private void dibujarRectangulo(java.awt.event.MouseEvent evt, Graphics2D g2) {
        if (evt.getX() > xOrigen) {
            rectangulo.width = evt.getX() - rectangulo.x;
        } else {
            rectangulo.x = evt.getX();
            rectangulo.width = xOrigen - rectangulo.x;
        }
        if (evt.getY() > yOrigen) {
            rectangulo.height = evt.getY() - yOrigen;
        } else {
            rectangulo.y = evt.getY();
            rectangulo.height = yOrigen - rectangulo.y;
        }
        g2.draw(rectangulo);
    }
}
