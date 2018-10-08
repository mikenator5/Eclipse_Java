import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Triangle {
	
	
	// Class variable go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	// Constructor goes here
	
	public Triangle() {
		
		UIManager.put("OptionPane.background", Color.green);
	    UIManager.put("Panel.background", Color.green);
	    UIManager.put("Button.background", Color.white);
	    
		setVarsToZero();
		setSides();
		calcPerimeter();
		calcArea();
		
		calcAngles();
		showVars();
		
		
		
		
	}

	public void setSides() {
		
		boolean b = true;
		
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter A: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		b = true;
		while (b) {
			try {
				sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter B: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		b = true;
		while (b) {
			try {
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Enter C: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		
		}
	} //end of setSides()

	public void setVarsToZero() {
		// TODO Auto-generated method stub
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;

	} //end of setVarsToZero

	public void calcPerimeter() {
		
		perimeter = sideA + sideB + sideC;
		
	} //end of calcPerimeter
	
	public void showVars() {
		
		String msg = "Side A = " + sideA + "\n" + "Side B = " + sideB + "\n" + "Side C = " + sideC + "\n" + "Perimeter = " + perimeter  + "\n"+ "Area = " + theArea + "\n";
				
		JOptionPane.showMessageDialog(null, msg);
		
	} //end of showVars

	public void calcArea() {
		
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		
		theArea = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

	}
	
	public void calcAngles() {
		
		double  cosA = 0, Acos = 0, Adeg = 0;
		double	cosB = 0, Bcos = 0, Bdeg = 0; 
		double 	cosC = 0, Ccos = 0, Cdeg = 0;
		
		// cosA
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC,  2.0) - Math.pow(sideA, 2.0)) / (2.0 * sideB * sideC);
		Acos = Math.acos(cosA);
		Adeg = Math.toDegrees(Acos);

		
		// cosB
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0)) / (2.0 * sideA * sideC);
		Bcos = Math.acos(cosB);
		Bdeg = Math.toDegrees(Bcos);

		
		// cosC
		cosC = (Math.pow(sideA,  2.0) + Math.pow(sideB,  2.0) - Math.pow(sideC,  2.0))/ (2.0 * sideA * sideB);
		Ccos = Math.acos(cosC);
		Cdeg = Math.toDegrees(Ccos);

		
		JOptionPane.showMessageDialog(null, "Cos A = " + Adeg + "\n" + "Cos B = " + Bdeg + "\n" + "Cos C = " + Cdeg);
		
		
	}
}
