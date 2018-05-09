package net.ictcampus.view;

import java.awt.Point;

import javax.swing.JFrame;

import net.ictcampus.model.Element;
//Klasse für einen Schuss
public class Bullet extends Element {
	private int shotSpeed = 50;
	private int distance;
	private String richtung="rechts";
	private String owner;

	public Bullet(String owner,int x, int y, int width, int height, String pic) {
		super(x, y, width, height, pic);
		this.owner=owner;
	}

	//Diese 5 Methoden setzten die richtung entweder + oder - und positionieren den schuss gerade vor dem Panzer
	public void bulletForward() {
		setDistance(-getShotSpeed());
		setY(getY()-5);
		setX(getX()+12);
	}

	public void bulletRight() {
		setDistance(getShotSpeed());
		setX(getX()+50);
		setY(getY()+12);
	}

	public void bulletBackward() {
		setDistance(getShotSpeed());
		setY(getY()+45);
		setX(getX()+10);
	}

	public void bulletLeft() {
		setDistance(-getShotSpeed());
		setX(getX()-5);
		setY(getY()+11);
	}

	public void bulletStop() {
		setDistance(0);
	}

	//Hier wird der Schuss bewegt
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
