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
	
	ArrayList<Element> elements  = new ArrayList<>();
	
	public GameField() {
	}
	public static void main(String[] args) throws IOException{
		GameField field=new GameField();
		field.setSize(700,700);
		field.setResizable(false);
		field.setVisible(true);
		field.setLayout(null);		 
		field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tank tank1 =new Tank(20,50,32,60,"Images/panzergelb.png");
		Tank tank2=new Tank(630,630,32,60,"Images/panzerrot.png");
		Barrier barrier1=new Barrier(122,90,139,42,"Images/barrier.png");
		Barrier barrier2=new Barrier(423,97,133,32,"Images/barrier.png");
		Barrier barrier3=new Barrier(515,128,41,137,"Images/barrierhoch.png");
		Barrier barrier4=new Barrier(38,403,113,42,"Images/barrier.png");
		Barrier barrier5=new Barrier(117,497,37,100,"Images/barrierhoch.png");
		Barrier barrier6=new Barrier(384,461,146,41,"Images/barrier.png");
		Barrier barrier7=new Barrier(592,565,36,74,"Images/barrierhoch.png");
		field.elements.add(barrier1);
		field.elements.add(barrier2);
		field.elements.add(barrier3);
		field.elements.add(barrier4);
		field.elements.add(barrier5);
		field.elements.add(barrier6);
		field.elements.add(barrier7);
		field.elements.add(tank1);
		field.elements.add(tank2);
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
		for (Element e : elements) {
				g.drawImage(e.getImg(),e.getX(),e.getY(),e.getWidth(),e.getHeight(),null);
			}
		}

}
