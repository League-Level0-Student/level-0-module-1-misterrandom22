import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password=("wrong");
	String secret=JOptionPane.showInputDialog("make a secret message");
	String guess=JOptionPane.showInputDialog("what is the password?");
	if(password.equals(guess)){
		JOptionPane.showMessageDialog(null, "correct, the secret message is "+secret);
		}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER");
	}
	
}
}
