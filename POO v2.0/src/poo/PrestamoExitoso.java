/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author AB.MONICA
 */
public class PrestamoExitoso extends JFrame {
    private JButton close;


    private JProgressBar progressBar;


	public PrestamoExitoso(){




	   


		Container contenedor = getContentPane();
        {
        	MiJDesktopPane panel = new MiJDesktopPane("resources/PrestamoExitoso.png");

        	contenedor.add(panel, BorderLayout.CENTER);



        	 close = new JButton("ok");


            close.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                	PrestamoExitoso.this.dispose();
               }
            });


        contenedor.add(close,BorderLayout.SOUTH);
        setSize(126,182 );
        setResizable(false);
        setLocationRelativeTo(null);
		setVisible( true );

	}

        }
}
