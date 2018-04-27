package net.ictcampus.view;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameField extends JFrame{
	
	public GameField() {
	}
	public static void main(String[] args){
		GameField field=new GameField();
		field.setSize(700,700);
		try {
            field.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Map1.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //field.pack();
		field.setResizable(false);
		field.setVisible(true);
		field.setLayout(null);		 
		field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paintComponent(Graphics g) {
		
	}

}
