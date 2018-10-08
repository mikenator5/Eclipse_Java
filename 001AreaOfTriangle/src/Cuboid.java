import javax.swing.JOptionPane;

public class Cuboid {
	
	private double l, w, h, vol, surf;
	
	public Cuboid() {
		getSides();
		findVol();
		findSurfArea();
	}
	
	public void getSides() {
		boolean b = true;
		while (b) {
			try {
				l = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Length: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		b = true;
		while (b) {
			try {
				 w = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Width: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		b = true;
		while (b) {
			try {
				h = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Height: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		
	}
	
	public void findVol() {
		
		vol = (l*w*h);
		JOptionPane.showMessageDialog(null, "Volume = " + vol);
	}
	
	public void findSurfArea() {
	
		surf = (((l*w) + (w*h) + (h*l))*2);
		JOptionPane.showMessageDialog(null, "Surface Area = " + surf);
	}
}
