
package graficos;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejemplo03_borderlayout extends JFrame {
     public Ejemplo03_borderlayout(String title, int x, int y, int w, int h){
        super(title);
        this.setBounds(x,y,w,h);
        //Gestor de organizacion
        this.getContentPane().setLayout(new BorderLayout(5,5));
        
        this.getContentPane().add(new JButton("Primer boton"), BorderLayout.NORTH);
        this.getContentPane().add(new JButton("Segundo boton"), BorderLayout.EAST);
        this.getContentPane().add(new JButton("Tercer boton"), BorderLayout.WEST);
        this.getContentPane().add(new JButton("Cuarto boton"), BorderLayout.SOUTH);
        this.getContentPane().add(new JButton("Quito boton"), BorderLayout.CENTER);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args){
        new Ejemplo03_borderlayout("Prueba ventana", 500, 450, 350, 250);
    }
}
