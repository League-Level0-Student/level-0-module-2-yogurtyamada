package _15_voting_booth;

import javax.swing.JOptionPane;

public class OKBOOMER {
	public static void main(String[] args) {
		String qwe;
		qwe = JOptionPane.showInputDialog("How old are you!");
		int NANI;
		NANI = Integer.parseInt(qwe);
		System.out.println(NANI);
		if (NANI > 50) {
			JOptionPane.showMessageDialog(null, "OK BOOMER!");
			
			
		}else {
			JOptionPane.showMessageDialog(null, "GO HOME!");
		}	
	}
}