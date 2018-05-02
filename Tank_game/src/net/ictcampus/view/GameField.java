package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.ictcampus.model.Element;

public class GameField extends JFrame{
	
	ArrayList<Element> emelments  = new ArrayList<>();
	
	public GameField() {
	}
	public static void main(String[] args) throws IOException{
		GameField field=new GameField();
		field.setSize(700,700);
		field.setResizable(false);
		field.setVisible(true);
		field.setLayout(null);		 
		field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tank tank1 =new Tank(50,50,40,40,"Images/panzergrün.png");
		Tank tank2=new Tank(650,650,40,40,"Images/panzerrot.png");
		field.emelments.add(tank1);
		field.emelments.add(tank2);
		System.out.println(tank1.getBounds());
		field.setVisible(true);
		
	}
	public void paint(Graphics g) {
		BufferedImage back = null;
		try {
			back = ImageIO.read(new File("C:/Users/voektm/Desktop/Projekt/Projekt/Images/Map1.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		g.drawImage(back, 0, 0, null);
		for (Element e : emelments) {
				g.drawImage(e.getImg(),e.getX(),e.getY(),e.getWidth(),e.getHeight(),null);
			}
		}

}
