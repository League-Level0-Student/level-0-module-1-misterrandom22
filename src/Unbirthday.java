import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String bday=JOptionPane.showInputDialog(null, "when is your birthday?");
if(bday.equals("2/21")) {
System.out.println("happy birthday");
}
else {
	System.out.println("very merry unbirthday to you!");
}
}
}