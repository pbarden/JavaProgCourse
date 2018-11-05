import javax.swing.JOptionPane; 

public class CallMeMaybe { 
	public static void main(String[] args) { 
		String easyString = JOptionPane.showInputDialog("Enter a whole number.");
		int myNumber = Integer.parseInt(easyString);
		JOptionPane.showMessageDialog(null, "The number is: " + myNumber + " .");
		System.exit(0);
	}
}
