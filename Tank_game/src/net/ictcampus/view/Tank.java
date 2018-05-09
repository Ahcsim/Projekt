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

import net.ictcampus.control.ReloadTimeer;
import net.ictcampus.model.Element;
//Klasse für den Panzer
public class Tank extends Element {
	private String richtung;
	private int speed = 1;
	private int lives = 3;
	private int reloadTime;
	private int distance;
	private String tankFarbe;
	private String name;
	private ReloadTimeer Timer;
	private String f;
	public Tank(String name, int x, int y, int width, int height, String pic,String farbe) {
		super(x, y, width, height, pic);
		this.name = name;
		this.f=farbe;
		System.out.println(pic);
		try {
			setImg(ImageIO.read(getClass().getResource(pic)));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//Diese 5 Methoden setzten die richtung entweder + oder -
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
	//Mit dieser Methode wird der Tank bewegt
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
	

	//Wenn ein panzer schiesst, wird hier ein neuer Schuss erstellt
	public Bullet shoot(Tank t) {
			Bullet schuss = new Bullet(t.getName(),t.getX(), t.getY(), 8, 8, "Images/punkt.png");
			return schuss;
		
		
	}

	//für jede der 4 Blickrichtungen gibt es ein Bild
	public void changeImg(int t) {
		switch (t) {
		case 1:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"hoch.png")));
				setRichtung("hoch");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 2:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"rechts.png")));
				setRichtung("rechts");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 3:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"runter.png")));
				setRichtung("runter");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 4:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"links.png")));
				setRichtung("links");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 5:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"hoch.png")));
				setRichtung("hoch");
				// ;
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 6:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"rechts.png")));
				setRichtung("rechts");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 7:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"runter.png")));
				setRichtung("runter");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 8:
			try {
				setImg(ImageIO.read(new File("Images/"+f+"links.png")));
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

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
