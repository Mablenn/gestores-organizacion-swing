
package graficos;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejemplo03_borderlayout extends JFrame {
     public Ejemplo03_borderlayout(String title, int x, int y, int w, int h){
        super(title);
        //posicionamiento de la ventana
        this.setBounds(x,y,w,h);
        //Gestor de organizacion
        this.getContentPane().setLayout(new BorderLayout(5,5));
        //Añadir componentes al contenedor
        this.getContentPane().add(new JButton("Boton norte"), BorderLayout.NORTH);
        this.getContentPane().add(new JButton("Boton este"), BorderLayout.EAST);
        this.getContentPane().add(new JButton("Boton oeste"), BorderLayout.WEST);
        this.getContentPane().add(new JButton("Boton sur"), BorderLayout.SOUTH);
        this.getContentPane().add(new JButton("Boton centro"), BorderLayout.CENTER);
        //Hacer la ventana visible
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args){
        new Ejemplo03_borderlayout("Prueba ventana", 500, 450, 350, 250);
    }
}

