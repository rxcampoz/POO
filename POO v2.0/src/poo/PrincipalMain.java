/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


/**
 *
 * @author AB.MONICA
 */
public class PrincipalMain  {

    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) {
        // TODO code application logic here

        JFrame.setDefaultLookAndFeelDecorated(false);
	LoguinUI aplicacion = new LoguinUI();
	aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );



    }

}
