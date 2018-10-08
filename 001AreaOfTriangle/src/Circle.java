

import javax.swing.JOptionPane;

public class Circle {
	
	private double r = 0, theArea = 0, circum = 0;
	
	public Circle() {
			setAngle();
			getArea();
			getCircum();
	}
	
	public void getCircum() {
		
		double c = 0;
		c = Math.PI;
		circum = (r * 2)*c;

		
		JOptionPane.showMessageDialog(null, "Circumference = " + circum);
		
	}

	public void getArea() {
		
		double a = 0;
		a = Math.PI;
		theArea = Math.pow(r, 2)*a;

		
		JOptionPane.showMessageDialog(null, "Area = " + theArea);
		
	}

	public void setAngle() {
		
		boolean b = true;
		while (b) {
			try {
				r = Double.parseDouble(JOptionPane.showInputDialog("Enter value of r: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		
		
	}
}
