
package graficos;

import javax.swing.*;
import java.awt.*;

public class Ejemplo02_gridlayout extends JFrame{
    
    public Ejemplo02_gridlayout(String title, int x, int y, int w, int h){
        super(title);
        this.setBounds(x,y,w,h);
        //Gestor de organizacion
        //A traves del constructor podemos indicar el numero de filas y columnas
        this.getContentPane().setLayout(new GridLayout(2,4));

        this.getContentPane().add(new JLabel("Nombre"));
        this.getContentPane().add(new JTextField());
        this.getContentPane().add(new JLabel("Apellidos"));
        this.getContentPane().add(new JTextField());
        this.getContentPane().add(new JButton("Primer boton"));
        this.getContentPane().add(new JButton("Segundo boton"));
        this.getContentPane().add(new JButton("Tercer boton"));
        this.getContentPane().add(new JButton("Cuarto boton"));
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //pack();
    }
    
    public static void main(String[] args){
        new Ejemplo02_gridlayout("Prueba ventana", 500, 500, 500, 200);
    }
}
