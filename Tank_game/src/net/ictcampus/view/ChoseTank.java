package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

import net.ictcampus.control.ButtonListener;

public class ChoseTank extends JFrame {
	ButtonListener bl;

	public ChoseTank(ButtonListener bl) {
		super("TankGame");
		this.bl = bl;

	}

	public void choose() {
		
		//Frame wird erstellt
		setSize(1245, 700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		JLabel background = new JLabel(new ImageIcon("Images/Start.png"));
		
		//Button mit Bilder definieren
		ImageIcon imageForOne = new ImageIcon("Images/auswahl1.png");
		ImageIcon imageForTwo = new ImageIcon("Images/auswahl2.png");
		ImageIcon imageForThree = new ImageIcon("Images/auswahl3.png");
		ImageIcon imageForFour = new ImageIcon("Images/auswahl4.png");
		JButton auswahl1Button = new JButton("t1", imageForOne);
		JButton auswahl2Button = new JButton("t2", imageForTwo);
		JButton auswahl3Button = new JButton("t3", imageForThree);
		JButton auswahl4Button = new JButton("t4", imageForFour);

		//Hier werden die Buttons definiert und transparent gemacht
		auswahl1Button.setSize(311, 700);
		auswahl1Button.setOpaque(false);
		auswahl1Button.setContentAreaFilled(false);
		auswahl1Button.setBorderPainted(false);
		auswahl1Button.setLocation(0, 0);
		auswahl1Button.setFocusable(false);

		auswahl2Button.setSize(311, 700);
		auswahl2Button.setOpaque(false);
		auswahl2Button.setContentAreaFilled(false);
		auswahl2Button.setBorderPainted(false);
		auswahl2Button.setLocation(311, 0);
		auswahl2Button.setFocusable(false);

		auswahl3Button.setSize(311, 700);
		auswahl3Button.setOpaque(false);
		auswahl3Button.setContentAreaFilled(false);
		auswahl3Button.setBorderPainted(false);
		auswahl3Button.setLocation(622, 0);
		auswahl3Button.setFocusable(false);

		auswahl4Button.setSize(311, 700);
		auswahl4Button.setOpaque(false);
		auswahl4Button.setContentAreaFilled(false);
		auswahl4Button.setBorderPainted(false);
		auswahl4Button.setLocation(933, 0);
		auswahl4Button.setFocusable(false);

		auswahl1Button.addActionListener(bl);
		auswahl2Button.addActionListener(bl);
		auswahl3Button.addActionListener(bl);
		auswahl4Button.addActionListener(bl);

		add(auswahl1Button);
		add(auswahl2Button);
		add(auswahl3Button);
		add(auswahl4Button);
		add(background);
		setVisible(true);
	}
	//Das gleiche wie oben nur ein zweites mal
	public void chooseSecond() {
		setSize(1245, 700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		JLabel background = new JLabel(new ImageIcon("Images/Start.png"));

		ImageIcon imageForOne = new ImageIcon("Images/auswahl1.png");
		ImageIcon imageForTwo = new ImageIcon("Images/auswahl2.png");
		ImageIcon imageForThree = new ImageIcon("Images/auswahl3.png");
		ImageIcon imageForFour = new ImageIcon("Images/auswahl4.png");
		JButton auswahl1Button = new JButton("t1p2", imageForOne);
		JButton auswahl2Button = new JButton("t2p2", imageForTwo);
		JButton auswahl3Button = new JButton("t3p2", imageForThree);
		JButton auswahl4Button = new JButton("t4p2", imageForFour);

		auswahl1Button.setSize(311, 700);
		auswahl1Button.setOpaque(false);
		auswahl1Button.setContentAreaFilled(false);
		auswahl1Button.setBorderPainted(false);
		auswahl1Button.setLocation(0, 0);
		auswahl1Button.setFocusable(false);

		auswahl2Button.setSize(311, 700);
		auswahl2Button.setOpaque(false);
		auswahl2Button.setContentAreaFilled(false);
		auswahl2Button.setBorderPainted(false);
		auswahl2Button.setLocation(311, 0);
		auswahl2Button.setFocusable(false);

		auswahl3Button.setSize(311, 700);
		auswahl3Button.setOpaque(false);
		auswahl3Button.setContentAreaFilled(false);
		auswahl3Button.setBorderPainted(false);
		auswahl3Button.setLocation(622, 0);
		auswahl3Button.setFocusable(false);

		auswahl4Button.setSize(311, 700);
		auswahl4Button.setOpaque(false);
		auswahl4Button.setContentAreaFilled(false);
		auswahl4Button.setBorderPainted(false);
		auswahl4Button.setLocation(933, 0);
		auswahl4Button.setFocusable(false);

		auswahl1Button.addActionListener(bl);
		auswahl2Button.addActionListener(bl);
		auswahl3Button.addActionListener(bl);
		auswahl4Button.addActionListener(bl);

		add(auswahl1Button);
		add(auswahl2Button);
		add(auswahl3Button);
		add(auswahl4Button);
		add(background);
		setVisible(true);
	}


}
