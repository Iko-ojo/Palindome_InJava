import javax.swing.*;
public class palindome_string {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Enter a message");
		int length = str.length();
		
		String reverse = "";
		for(int i = length -1 ; i >= 0;i--) {
			reverse += str.charAt(i);
		}
		if (str.equalsIgnoreCase(reverse)) {
			JOptionPane.showMessageDialog(null,"String is a palindome");
		}
		else {
			JOptionPane.showMessageDialog(null,"String is not a palindome");
		}
			System.out.println(reverse);
	}

}
