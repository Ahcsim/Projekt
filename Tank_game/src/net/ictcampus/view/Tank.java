package net.ictcampus.view;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.sun.javafx.geom.Rectangle;
import com.sun.prism.Graphics;
import com.sun.prism.Image;

import net.ictcampus.model.Element;

public class Tank extends Element {

	BufferedImage newTank;

	public Tank(int x, int y, int width, int height, String pic) {
		super(x, y, width, height, pic);
		try {
			newTank = ImageIO.read(new File(pic));
			setImg(ImageIO.read(new File(pic)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getWidth(), getHeight());

	}

	public void changeImg(int t) {
		switch (t) {
		case 1:
			try {
			newTank = ImageIO.read(new File("Images/rothoch.png"));
			setImg(ImageIO.read(new File("Images/rothoch.png")));
			//;
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 2:
			try {
			newTank = ImageIO.read(new File("Images/rotrechts.png"));
			setImg(ImageIO.read(new File("Images/rotrechts.png")));
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 3:
			try {
			newTank = ImageIO.read(new File("Images/rotrunter.png"));
			setImg(ImageIO.read(new File("Images/rotrunter.png")));
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 4:
			try {
			newTank = ImageIO.read(new File("Images/rotlinks.png"));
			setImg(ImageIO.read(new File("Images/rotlinks.png")));
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 5:
			try {
			newTank = ImageIO.read(new File("Images/gelbhoch.png"));
			setImg(ImageIO.read(new File("Images/gelbhoch.png")));
			//;
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 6:
			try {
			newTank = ImageIO.read(new File("Images/gelbrechts.png"));
			setImg(ImageIO.read(new File("Images/gelbrechts.png")));
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 7:
			try {
			newTank = ImageIO.read(new File("Images/gelbrunter.png"));
			setImg(ImageIO.read(new File("Images/gelbrunter.png")));
			} catch (IOException e) {
				e.printStackTrace();
			}break;
			
		case 8:
			try {
			newTank = ImageIO.read(new File("Images/gelblinks.png"));
			setImg(ImageIO.read(new File("Images/gelblinks.png")));
			} catch (IOException e) {
				e.printStackTrace();
			}break;
		}
		
	}

}
