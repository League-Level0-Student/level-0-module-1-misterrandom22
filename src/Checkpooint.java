import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpooint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("what is your favorite color?");
	JOptionPane.showMessageDialog(null,"your favorite color is "+ color);
	Robot roboto = new Robot();
	roboto.hide();
	roboto.setSpeed(1000000000);
	roboto.penDown();
	roboto.move(500);
	roboto.turn(120);
	roboto.move(500);
	roboto.turn(120);
	roboto.move(500);
		
}
}
