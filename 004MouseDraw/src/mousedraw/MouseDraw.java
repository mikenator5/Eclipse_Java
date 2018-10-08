package mousedraw;

import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class MouseDraw extends JFrame {
	
	// field variables
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	
	
	Graphics2D g2D;
	
	public MouseDraw() {
		
		// frame constructor
		setTitle("Artististic Creations by Mike D! October 2018");
		setResizable(false);
		setSize(600, 400);
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				
				exitForm(e);	
			}

			
		}); // end of WindowListener
		getContentPane().setLayout(new GridBagLayout());
		
		setJMenuBar(mainMenuBar);
		fileMenu.setMnemonic('F');
		mainMenuBar.add(fileMenu);
		fileMenu.add(newMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		newMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newMenuItemActionPerformed(e);
			}

			
		});
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitMenuItemActionPerformed(e);
			}
		});
		
		
	} // end of constructor MouseDraw()
	
	private void exitForm(WindowEvent e) {
		
		g2D.dispose();
		System.exit(0);
		
		
	} // end of exitForm method
	
	private void newMenuItemActionPerformed(ActionEvent e) {
		
	} // end of newMenuItemActionPerformed method
	
	private void exitMenuItemActionPerformed(ActionEvent e) {
		int response;
		response = JOptionPane.showConfirmDialog(null, "Are you sure you wna to exit?", "Exit Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {
			return;
		} else {
			exitForm(null);
		}
	} // end of exitMenuItemActionPerformed method
	

} // end of class MouseDraw