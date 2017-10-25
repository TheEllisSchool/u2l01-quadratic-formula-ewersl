package quadraticformula;
import javax.swing.JOptionPane;
public class quadraticformula {
	public static void main (String[] args) {
		
		String inputa = JOptionPane.showInputDialog (null, "enter your a value" );
		int a= Integer.parseInt (inputa);
		String inputb = JOptionPane.showInputDialog (null, "enter your b value" );
		int b= Integer.parseInt (inputb);
		String inputc = JOptionPane.showInputDialog (null, "enter your c value" );
		int c= Integer.parseInt (inputc);
		
		quadraticformula (a,b, c); 
	
	}


	public static void quadraticformula ( int a, int b, int c) { 
		int discriminant = (int) Math.pow (b, 2);
		int discriminant2 = 4* a * c; 
		discriminant = discriminant - discriminant2;
		if (discriminant < 0) {
			JOptionPane.showMessageDialog (null, "the discriminant is negative");
		}
		int negativeb= b * -1; 
		int numeratorminus= negativeb - discriminant; 
		int numeratorplus= negativeb + discriminant; 
		int x1= numeratorminus/ (2* a); 
		int x2= numeratorplus/ (2*a); 
		JOptionPane.showMessageDialog (null, "the first zero is " + x1 + ", and the second zero is" + x2);
		
		}
	
	}

