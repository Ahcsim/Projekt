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

	// BufferedImage newTank;
	private String richtung;
	private int speed = 1;
	private int lives = 3;
	private int reloadTime;
	private int distance;

	public Tank(int x, int y, int width, int height, String pic) {
		super(x, y, width, height, pic);

		try {
			// newTank = ImageIO.read(new File(pic));
			setImg(ImageIO.read(new File(pic)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void tankForward() {
		setDistance(-speed);
	}
	public void tankRight() {
		setDistance(speed);
	}

	public void tankBackward() {
		setDistance(speed);
	}
	public void tankLeft() {
		setDistance(-speed);
	}

	public void tankStop() {
		setDistance(0);
	}
	public void moveObject(String dir) {
		int x=getX();
		int y=getY();
		switch (dir) {
		case "hoch":
			setY(y + getDistance());
			break;
		case "runter":
			setY(y + getDistance());
			break;
		case "links":
			setX(x + getDistance());
			break;
		case "rechts":
			setX(x + getDistance());
			break;
		}
	}
	

	public Bullet shoot(Tank t) {
		Bullet schuss = new Bullet(t.getX(), t.getY(), 8, 8, "Images/punkt.png");
		return schuss;
	}

	public void changeImg(int t) {
		switch (t) {
		case 1:
			try {
				// newTank = ImageIO.read(new File("Images/rothoch.png"));
				setImg(ImageIO.read(new File("Images/rothoch.png")));
				setRichtung("hoch");
				// ;
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 2:
			try {
				// newTank = ImageIO.read(new File("Images/rotrechts.png"));
				setImg(ImageIO.read(new File("Images/rotrechts.png")));
				setRichtung("rechts");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 3:
			try {
				// newTank = ImageIO.read(new File("Images/rotrunter.png"));
				setImg(ImageIO.read(new File("Images/rotrunter.png")));
				setRichtung("runter");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 4:
			try {
				// newTank = ImageIO.read(new File("Images/rotlinks.png"));
				setImg(ImageIO.read(new File("Images/rotlinks.png")));
				setRichtung("links");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 5:
			try {
				// newTank = ImageIO.read(new File("Images/gelbhoch.png"));
				setImg(ImageIO.read(new File("Images/gelbhoch.png")));
				setRichtung("hoch");
				// ;
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 6:
			try {
				// newTank = ImageIO.read(new File("Images/gelbrechts.png"));
				setImg(ImageIO.read(new File("Images/gelbrechts.png")));
				setRichtung("rechts");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 7:
			try {
				// newTank = ImageIO.read(new File("Images/gelbrunter.png"));
				setImg(ImageIO.read(new File("Images/gelbrunter.png")));
				setRichtung("runter");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 8:
			try {
				// newTank = ImageIO.read(new File("Images/gelblinks.png"));
				setImg(ImageIO.read(new File("Images/gelblinks.png")));
				setRichtung("links");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}

	}

	public String getRichtung() {
		return richtung;
	}

	public void setRichtung(String richtung) {
		this.richtung = richtung;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getReloadTime() {
		return reloadTime;
	}

	public void setReloadTime(int reloadTime) {
		this.reloadTime = reloadTime;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}
