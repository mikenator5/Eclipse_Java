import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Runner {
	
	public static void main( String[] args) {
		UIManager.put("OptionPane.background", Color.green);
	    UIManager.put("Panel.background", Color.green);
	    UIManager.put("Button.background", Color.white);
	    
	    /***********
	     * 
	     * Cuboid: Input sides, A, B,  C, calc volume, total surface area
	     * Sphere: Input radius, calc volume, and surface area
	     */
	    String[] options = {"Triangle", "Circle", "Rectangle", "Cuboid", "Sphere"};
	    
	    JOptionPane.showMessageDialog(null, "Welcome to my program! This amazing program was created by Mike D on Sep 14, 2018 Period A3");
		
	    int answer = JOptionPane.showOptionDialog(null, "Which program do you want to run?", "Click a program", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
	    int a = 1;
	    
	    while (a == 1) {
	    	
			loop: switch(answer) {
				case(0):
					Triangle myTriangle = new Triangle();
					break loop;
						
				case(1):
					Circle myCircle = new Circle();
					break loop;
					
				case(2):
					Rectangle myRectangle = new Rectangle();
					break loop;
				case(3):
					Cuboid myCuboid = new Cuboid();
					break loop;
				case(4):
					Sphere mySphere = new Sphere();
					break loop;
			};
			String response = "Would you like to run a different program? Y/N";
			
			String b1 = JOptionPane.showInputDialog(response);
			if (b1.equals("n") || b1.equals("N")) {
				System.exit(0);
			}
			else {
				answer = JOptionPane.showOptionDialog(null, "Which program do you want to run?", "Click a program", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			}
			
		};
		// Instantiate each class
		
		
		
	}
	
}
