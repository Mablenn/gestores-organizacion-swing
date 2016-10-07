
package graficos;

import java.awt.Button;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Ejemplo04_boxlayout extends JFrame{
    
    public Ejemplo04_boxlayout(String title, int x, int y, int w, int h){
        super(title);
        this.setBounds(x,y,w,h);
       //Gestor de organización
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.X_AXIS));
        //Añadir los componentes al contenedor
        this.getContentPane().add(new Button("Button 1"));
        this.getContentPane().add(new Button("Button 2"));
        this.getContentPane().add(new Button("Button 3"));
        this.getContentPane().add(new Button("Button 4"));
        //Hacer la ventana visible
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args){
        new Ejemplo04_boxlayout("Prueba ventana", 500, 450, 350, 150);
    }
}

