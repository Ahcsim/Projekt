package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.ictcampus.model.Element;


public class Frame extends JPanel{

	ArrayList<Element> elements  = new ArrayList<>();
	
	public Frame(ArrayList<Element> e) {
		elements = e;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0,200,300);
		BufferedImage back = null;
		try {
			back = ImageIO.read(new File("Images/Map1.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		g.drawImage(back, 0, 0, null);
		for (Element e : elements) {
				g.drawImage(e.getImg(),e.getX(),e.getY(),e.getWidth(),e.getHeight(),null);
			}
		}
	
	
}
