/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

/**
 *
 * @author AB.MONICA
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;


public class MiJDesktopPane extends JDesktopPane {
	private ImageIcon fondo;

	public MiJDesktopPane(String ruta){
		fondo = new ImageIcon( ruta );

	}

	public void paintComponent( Graphics g ){
		super.paintComponent( g );
		fondo.paintIcon( this, g, 0, 0 );
	}

	public Dimension getPreferredSize(){
		return new Dimension( fondo.getIconWidth(),fondo.getIconHeight() );
	}

}