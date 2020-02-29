package gmail.com;

import javax.swing.JOptionPane;

import gmail.com.exceptions.NegativeValueException;

public class Main {
	public static void main(String[] args) {
		double a;
		
		ArrayIndexOutOfBoundsException err = new ArrayIndexOutOfBoundsException(":)");
		
		for (;;) {
			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
				if(a<0) {
					throw new NegativeValueException(":(");
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
				throw err;
			} catch (NullPointerException e) {
				a = 0;
				JOptionPane.showMessageDialog(null, "Cancel");
				break;
			}catch (NegativeValueException e) {
				JOptionPane.showMessageDialog(null, "Input negative number" + e.getMessage());
			}
		}
		System.out.println(a);
	}
}