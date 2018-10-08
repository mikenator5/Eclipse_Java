import javax.swing.JOptionPane;

public class Rectangle {
	
	private double area, perimeter, l, w, diag;
	
	public Rectangle() {
		getArea();
		getPerimeter();
		getDiag();
		
	}
	
	public void getArea() {
		
		boolean b = true;
		while (b) {
			try {
				l = Double.parseDouble(JOptionPane.showInputDialog("Enter the Length: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		b = true;
		while (b) {
			try {
				w = Double.parseDouble(JOptionPane.showInputDialog("Enter the Width: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		
		
		area = (l*w);
		
		JOptionPane.showMessageDialog(null, "The Area = " + area, "Here is your area!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void getPerimeter() {
		
		perimeter = (l*2) + (w*2);
		
		JOptionPane.showMessageDialog(null, "The Perimeter = " + perimeter);
	}
	
	public void getDiag() {
		
		double b = 2, get = 0;
		
		get = Math.pow(l, b) + Math.pow(w, b);
		
		diag = Math.sqrt(get);
		
		JOptionPane.showMessageDialog(null, "The Diaganol = " + diag);
		
		
	}
}
