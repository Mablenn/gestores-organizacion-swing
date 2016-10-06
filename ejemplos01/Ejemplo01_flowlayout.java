 
//Gestor de organizacion FlowLayout
 //FlowLayout distribuye  los componentes de izquierda a derecha y de arriba a abajo según su tamaño
 //y alineando al centro el contenido

package graficos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ejemplo01_flowlayout extends JFrame {
    
    public Ejemplo01_flowlayout(String title, int x, int y, int w, int h){
        super(title);
        //posicionamiento de la ventana
        this.setBounds(x,y,w,h);
        //Gestor de organización
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(new JLabel("Nombre"));
        this.getContentPane().add(new JTextField(10));
        this.getContentPane().add(new JLabel("Apellidos"));
        this.getContentPane().add(new JTextField(10));
        this.getContentPane().add(new JButton("boton"));
        this.getContentPane().add(new JTextArea("Area de texto"));
        this.getContentPane().add(new JButton("Tercer boton"));
        this.getContentPane().add(new JButton("Cuarto boton"));
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //pack();
    }
    
    public static void main(String[] args){
        new Ejemplo01_flowlayout("Gestor FlowLayout", 500, 500, 300, 200);
    }
}
