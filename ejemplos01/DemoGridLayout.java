
package graficos;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Ejemplo02_gridlayout extends JFrame{
    
    public Ejemplo02_gridlayout(String title, int x, int y, int w, int h){
        super(title);
        //posicionamiento de la ventana
        this.setBounds(x,y,w,h);
        //Gestor de organizacion
        this.getContentPane().setLayout(new GridLayout(2,4));
        //Añadir componentes al contenedor
        this.getContentPane().add(new JLabel("Nombre"));
        this.getContentPane().add(new JTextField());
        this.getContentPane().add(new JLabel("Apellidos"));
        this.getContentPane().add(new JTextField());
        this.getContentPane().add(new JButton("Primer boton"));
        this.getContentPane().add(new JButton("Segundo boton"));
        this.getContentPane().add(new JButton("Tercer boton"));
        this.getContentPane().add(new JButton("Cuarto boton"));
        //Hacer la ventana visible
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new Ejemplo02_gridlayout("Prueba ventana", 500, 500, 500, 200);
    }
}
