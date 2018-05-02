package net.ictcampus.view;

import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

import com.sun.javafx.geom.Rectangle;
import com.sun.prism.Graphics;
import com.sun.prism.Image;

import net.ictcampus.model.Element;

public class Tank extends Element{

	public Tank(int x, int y, int width, int height, String pic) {
		super(x, y, width, height, pic);
		ImageIcon newTank= new ImageIcon(pic);
		setImg(newTank.getImage());
		//Graphics.drawImage(getImg(),x,y);		
	}
	public Rectangle getBounds() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
		
	}

}
