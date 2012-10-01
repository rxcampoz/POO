/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

/**
 *
 * @author AB.MONICA
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoguinUI extends JFrame {

	private JSeparator jSeparator1;
	private JButton cmdLogin;
	private JPasswordField txtPassword;
	ActionListener updateProBar;
    Timer timer;
     private JProgressBar progressBar;



	public LoguinUI(){
		setTitle("VASCO CAR - RENT A CAR");



	        setTitle("Bienvenidos");

	        JPanel panel = new JPanel();
	       // panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));




	        progressBar = new JProgressBar();

	        progressBar.setMaximumSize(new Dimension(604, 26));
	        progressBar.setMinimumSize(new Dimension(604, 26));
	        progressBar.setPreferredSize(new Dimension(604, 26));

	        progressBar.setAlignmentX(0f);

	        panel.add(progressBar);
	        panel.add(Box.createRigidArea(new Dimension(0, 20)));





	        updateProBar = new ActionListener() {
	            public void actionPerformed(ActionEvent actionEvent) {
	                int val = progressBar.getValue();
	                if (val >= 100) {
	                    timer.stop();
                            setVisible(false);
                            VPrincipal a=new VPrincipal();
                            a.setVisible(true);

	                    return;


	                }

	                progressBar.setValue(++val);
	            }
	        };

	        timer = new Timer(35, updateProBar);
	        timer.start();






	        add(panel,BorderLayout.PAGE_END);

	        pack();
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        setVisible(true);





		Container contenedor = getContentPane();
        {
        	MiJDesktopPane panel2 = new MiJDesktopPane("resources/majo.png");
        	contenedor.add(panel2, BorderLayout.CENTER);
        	panel2.setLayout(null);



        setSize(604, 453);
        setResizable(false);
        setLocationRelativeTo(null);
		setVisible( true );

	}
	}
}
