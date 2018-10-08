import javax.swing.JOptionPane;

public class Sphere {
	
	private double r, vol, area, pi = Math.PI;
	
	public Sphere() {
		getR();
		getVol();
		getSurfArea();
	}
	
	public void getR() {
		
		boolean b = true;
		
		while (b) {
			try { 
				r = Double.parseDouble(JOptionPane.showInputDialog("Please enter the Radius: "));
				b = false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		
	}
	
	public void getVol() {
		
		double power = Math.pow(r, 3), frac = 4d/3d;
		
		vol = (frac*(pi*power));
		
		JOptionPane.showMessageDialog(null, "Volume = " + vol);
		
	}
	
	public void getSurfArea() {
		
		area = (pi*(Math.pow(r, 2)*4));
		
		JOptionPane.showMessageDialog(null, "Area = " + area);
	}
}
