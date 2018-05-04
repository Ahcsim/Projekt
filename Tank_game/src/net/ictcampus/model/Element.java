package net.ictcampus.model;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.sun.prism.Image;

public class Element {
	private int x;
	private int y;
	private int width;
	private int height;
	private String pic;
	private BufferedImage img;
	
	public  Element(int x, int y, int width, int height, String pic) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setPic(pic);
	}
	
	public boolean collision(Element a) {
		Rectangle r = this.getBounds();
		if(r.intersects(a.getBounds())) {
			return true;
		}
		return false;
	}
	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getWidth(), getHeight());

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage image) {
		this.img = image;
	}
	
	


}
