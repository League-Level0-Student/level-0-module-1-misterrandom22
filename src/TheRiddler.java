import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score=0;
	String riddle=("a baby");
	JOptionPane.showMessageDialog(null,"Riddle me this.");
	JOptionPane.showMessageDialog(null,"What walks on four legs in the morning,\n two in mid-day,\n and three at night?"); 
	String guess=JOptionPane.showInputDialog("What is it?");
	if(riddle.equalsIgnoreCase(guess)) {
		score++;
		JOptionPane.showMessageDialog(null,"you got it right!");
		JOptionPane.showMessageDialog(null,"congratulations!");
		JOptionPane.showMessageDialog(null,"It crawls on all fours.\n Then, if you cut its arms off, it walks on two.\n If you give it a crutch in can hobble around on three.");
	}
	else {
		JOptionPane.showMessageDialog(null, "WRONG!");
		JOptionPane.showMessageDialog(null, "the answer is "+riddle);
		JOptionPane.showMessageDialog(null, "It crawls on all fours.\n Then, if you cut its arms off, it walks on two.\n If you give it a crutch in can hobble around on three.");
	}
	
	
	String potato=("a potato");
	JOptionPane.showMessageDialog(null,"Riddle me this.");
	JOptionPane.showMessageDialog(null,"What has eyes but cannot see?"); 
	String answer=JOptionPane.showInputDialog("What is it?");
	if(potato.equalsIgnoreCase(answer)) {
		score++;
		JOptionPane.showMessageDialog(null,"you got it right!");
		JOptionPane.showMessageDialog(null,"congratulations!");
	}
	else {
		JOptionPane.showMessageDialog(null, "WRONG!");
		JOptionPane.showMessageDialog(null, "the answer is "+potato);
		JOptionPane.showMessageDialog(null, "A potato has many eyes on it");
	}
	
	
	
	String teaser=("white");
	JOptionPane.showMessageDialog(null,"Riddle me this.");
	JOptionPane.showMessageDialog(null,"if I were in a house with a bear,\n with all four walls in a square\n and all the walls are facing south,\n what color would the bear be?"); 
	String guesss=JOptionPane.showInputDialog("What is it?");
	if(teaser.equalsIgnoreCase(guesss)) {
		score++;
		JOptionPane.showMessageDialog(null,"you got it right!");
		JOptionPane.showMessageDialog(null,"congratulations!");
		JOptionPane.showMessageDialog(null,"I would be in the north pole");
	}
	else {
		JOptionPane.showMessageDialog(null, "WRONG!");
		JOptionPane.showMessageDialog(null, "the answer is "+teaser);
		JOptionPane.showMessageDialog(null, "I would be in the north pole");
	}
	if(score>1) {
		JOptionPane.showMessageDialog(null, "congratulations!\nyou scored "+score);
	}
	else
		JOptionPane.showMessageDialog(null, "you're really bad at riddles.");
}
}
