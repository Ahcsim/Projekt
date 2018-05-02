package net.ictcampus.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.javafx.geom.Rectangle;

import net.ictcampus.model.Element;

public class Barrier extends Element{

	public Barrier(int x, int y, int width, int height, String pic){
		super(x, y, width, height, pic);
		try {
			BufferedImage newBarrier= ImageIO.read(new File(pic));
			setImg(ImageIO.read(new File(pic)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	public Rectangle getBounds() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
		
	}
}
