package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "I know that you stole $20.00 from your dad's wallet last summer, " + name + "! Mwahahahahaha!");
	
}
}
