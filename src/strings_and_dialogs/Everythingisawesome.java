package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Everythingisawesome {
public static void main(String[] args) {
	String thing = JOptionPane.showInputDialog("What do you think is the awesomest thing in the world? (plural item please)");
	JOptionPane.showMessageDialog(null, "That's awesome! I love " + thing );
}
}
