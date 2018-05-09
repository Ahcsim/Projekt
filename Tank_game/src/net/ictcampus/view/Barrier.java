package net.ictcampus.view;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



import net.ictcampus.model.Element;

public class Barrier extends Element{

	public Barrier(int x, int y, int width, int height, String pic){
		super(x, y, width, height, pic);
		try {
			setImg(ImageIO.read(getClass().getResource(pic)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}
	public Rectangle getBounds() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
		
	}
	
}
