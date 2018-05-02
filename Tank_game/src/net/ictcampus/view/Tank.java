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

public class Tank extends Element{

	public Tank(int x, int y, int width, int height, String pic) throws IOException {
		super(x, y, width, height, pic);
		BufferedImage newTank= ImageIO.read(new File(pic));
		setImg(ImageIO.read(new File(pic)));
			
	}
	public Rectangle getBounds() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
		
	}
}
