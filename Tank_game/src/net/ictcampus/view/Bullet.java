package net.ictcampus.view;

import java.awt.Point;

import javax.swing.JFrame;

import net.ictcampus.model.Element;

public class Bullet extends Element {
	private int shotSpeed = 5;
	private int distance;
	private String richtung="rechts";

	public Bullet(int x, int y, int width, int height, String pic) {
		super(x, y, width, height, pic);
	}

	public void bulletForward() {
		setDistance(-getShotSpeed());
	}

	public void bulletRight() {
		setDistance(getShotSpeed());
	}

	public void bulletBackward() {
		setDistance(getShotSpeed());
	}

	public void bulletLeft() {
		setDistance(-getShotSpeed());
	}

	public void bulletStop() {
		setDistance(0);
	}

	public void moveObject(String dir) {
		int x = getX();
		int y = getY();
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

	public int getShotSpeed() {
		return shotSpeed;
	}

	public void setShotSpeed(int shotSpeed) {
		this.shotSpeed = shotSpeed;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getRichtung() {
		return richtung;
	}

	public void setRichtung(String richtung) {
		this.richtung = richtung;
	}
}
