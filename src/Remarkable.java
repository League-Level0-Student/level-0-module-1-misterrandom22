import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what is your name?");
	if(name.equalsIgnoreCase("ayden")) {
		JOptionPane.showMessageDialog(null,"you are friends with honey badgers!");
	}
	if(name.equalsIgnoreCase("jesus")) {
		JOptionPane.showMessageDialog(null,"you are a honey badger!");
	}
	if(name.equalsIgnoreCase("jacob")) {
		JOptionPane.showMessageDialog(null, "you can sleep with your eyes closed!");		
	}
	if(name.equalsIgnoreCase("luis")) {
		JOptionPane.showMessageDialog(null, "you're insane at fortnite!");
	}
	if(name.equalsIgnoreCase("carlos")) {
		JOptionPane.showMessageDialog(null, "you...");
		JOptionPane.showMessageDialog(null, "you're there, right?");
	}
}
}
