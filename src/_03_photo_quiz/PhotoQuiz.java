

package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		
		String imgURL = "http://33.media.tumblr.com/2c8637ae90fbe1b357a1636f1ca38329/tumblr_ncffk6pIXb1svt5w5o1_500.gif";

		// 2. create a variable of type "Component" that will hold your image
Component image = createImage(imgURL);

		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();

		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("Who were the two original members of Destinys Child?");
		
if(question.equalsIgnoreCase("LaTavia Roberson and Letoya Luckett")) {
	JOptionPane.showMessageDialog(null, "Correct!");
		}
		
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)

String imgurl2 = "http://mommybrown.com/news/wp-content/uploads/2013/03/latavia.jpg";
Component image2 = createImage(imgurl2);
	
quizWindow.add(image2);

		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question2 = JOptionPane.showInputDialog("Who were the two new members of Destiny's Child?");

if(question2.equalsIgnoreCase("Farrah Franklin and Tenitra 'Michelle' Williams")) {
	JOptionPane.showMessageDialog(null, "Correct!");
		}
		
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
		}
		

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
