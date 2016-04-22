package game;

import java.awt.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().setBackground(Color.BLACK);
		
		frame.setVisible(true);
	}
}
