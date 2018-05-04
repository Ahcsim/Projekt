package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import net.ictcampus.control.ButtonListener;




public class Start extends JFrame{
	
	public Start() {
		
		super("TankGame");
		setSize(1245, 700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton startButton = new JButton("Start");
		JLabel background = new JLabel(new ImageIcon("Images/Start.png"));		
		
		startButton.setSize(1225, 700);
		startButton.setLocation(0, 0);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(new Font("Serif", Font.BOLD, 50));
		startButton.setFocusable(false);
		ButtonListener bl = new ButtonListener(this);
		startButton.addActionListener(bl);
		
		add(startButton);
		add(background);
		
		setVisible(true);
	}

}
