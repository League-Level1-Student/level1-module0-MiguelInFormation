package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie {
	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {
			int rand = new Random().nextInt(5);
			System.out.println();
		JOptionPane.showMessageDialog(null, "Woohoo");
		/*
		JOptionPane.showInputDialog("Who are you?");
		if (rand >= 0) {
			System.out.println("You will be happy");
		} else {
			System.out.println("You will be alone for the rest of your life");
		}*/
	}

}