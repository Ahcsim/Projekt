package net.ictcampus.view;

import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import net.ictcampus.control.KeyInput;
import net.ictcampus.control.ReloadTimeer;
import net.ictcampus.model.Element;

//Hier werden die Tanks, die Barriers erstellt und ein JFrame erstellt
public class GameField extends JFrame{
	private String farbe1;
	private String farbe2;
	private ArrayList<Element> elements = new ArrayList<>();
	private Frame panel;

	public GameField(String farbeTank1, String farbeTank2) {
		farbe1 = farbeTank1;
		farbe2 = farbeTank2;
		setSize(700, 700);
		setResizable(false);
//Hier werden 2 neue Tanks und 7 Barrieren erstellt
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tank tank1 = new Tank("Tank1", 20, 50, 32, 60, farbe1+"runter.png",farbe1);
		tank1.setRichtung("runter");
		Tank tank2 = new Tank("Tank2", 630, 630, 32, 60, farbe2+"hoch.png",farbe2);
		PowerUp pu = new PowerUp(0, 0, 30,30,"powerup.png");
		tank2.setRichtung("hoch");
		Barrier barrier1 = new Barrier(122, 90, 139, 42, "barrier.png");
		Barrier barrier2 = new Barrier(423, 97, 133, 32, "barrier.png");
		Barrier barrier3 = new Barrier(515, 128, 41, 137, "barrierhoch.png");
		Barrier barrier4 = new Barrier(38, 403, 113, 42, "barrier.png");
		Barrier barrier5 = new Barrier(117, 497, 37, 100, "barrierhoch.png");
		Barrier barrier6 = new Barrier(384, 461, 146, 41, "barrier.png");
		Barrier barrier7 = new Barrier(592, 565, 36, 74, "barrierhoch.png");
		//Die neuen Elemente werden in eine ArrayList gespeichert
		elements.add(barrier1);
		elements.add(barrier2);
		elements.add(barrier3);
		elements.add(barrier4);
		elements.add(barrier5);
		elements.add(barrier6);
		elements.add(barrier7);
		elements.add(tank1);
		elements.add(tank2);
		elements.add(pu);
		panel = new Frame(elements, tank1,tank2);
		add(panel);
		//Und noch ein Keylistener
		KeyInput ki = new KeyInput(tank1,tank2,this);
		addKeyListener(ki);
		System.out.println(tank1.getBounds());
		setVisible(true);
	}
	public boolean collision(ArrayList<Element> el) {
		return false;
	}
	public void addElement(Element a) {
		elements.add(a);
	}

}
