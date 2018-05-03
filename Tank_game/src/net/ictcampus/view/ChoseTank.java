package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

public class ChoseTank extends JFrame{
	
	public ChoseTank() {
		super("TankGame");
		setSize(1245, 700);
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0,0);
		JButton startButton = new JButton("hklasdhklöfasdasdf");
		JLabel background = new JLabel(new ImageIcon("Images/Start.png"));
		
		startButton.setSize(1225, 700);
		startButton.setLocation(0, 0);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(new Font("Serif", Font.BOLD, 50));
		startButton.setFocusable(false);
	
		add(startButton);
		add(background);
		setVisible(true);
	}
}
