package extra;

import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {
		String mammal = ("badger");
		String reptile = ("snake");
		String fungus = ("mushroom");
		for (int q = 0; q < 2; q++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(mammal + ",");
			}
			System.out.println();
			for (int i = 0; i < 2; i++) {
				System.out.print(fungus + ",");
			}
			System.out.println();
			for (int i = 0; i < 1; i++) {
				System.out.print(reptile + ",");
			}
			System.out.println();
		}

	}
}
