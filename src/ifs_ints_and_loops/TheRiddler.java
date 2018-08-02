package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
	int score= 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	String input=JOptionPane.showInputDialog("what is 2+2");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
	if(input.equals("4")){
		
		JOptionPane.showMessageDialog(null, "correct");
		score++;
	}

	else {
		JOptionPane.showMessageDialog(null, "Wrong..... You suck");
		
	}		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
	String input1=JOptionPane.showInputDialog("what is 2+8");

	
if(input1.equals("10")){
	
	JOptionPane.showMessageDialog(null, "correct");
	score++;
}

else {
	JOptionPane.showMessageDialog(null, "Wrong..... You suck");
	
}	
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "score: "+score+"/2");
	}
}

