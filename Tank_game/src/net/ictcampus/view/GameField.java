package net.ictcampus.view;

import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import net.ictcampus.control.KeyInput;
import net.ictcampus.model.Element;

public class GameField extends JFrame{

	ArrayList<Element> elements = new ArrayList<>();
	Frame panel;

	public GameField() {
		setSize(700, 700);
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tank tank1 = new Tank(20, 50, 32, 60, "Images/gelbrunter.png");
		tank1.setRichtung("runter");
		Tank tank2 = new Tank(630, 630, 32, 60, "Images/rothoch.png");
		PowerUp pu = new PowerUp(0, 0, 30,30,"Images/powerup.png");
		tank2.setRichtung("hoch");
		Barrier barrier1 = new Barrier(122, 90, 139, 42, "Images/barrier.png");
		Barrier barrier2 = new Barrier(423, 97, 133, 32, "Images/barrier.png");
		Barrier barrier3 = new Barrier(515, 128, 41, 137, "Images/barrierhoch.png");
		Barrier barrier4 = new Barrier(38, 403, 113, 42, "Images/barrier.png");
		Barrier barrier5 = new Barrier(117, 497, 37, 100, "Images/barrierhoch.png");
		Barrier barrier6 = new Barrier(384, 461, 146, 41, "Images/barrier.png");
		Barrier barrier7 = new Barrier(592, 565, 36, 74, "mages/barrierhoch.png");
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

		KeyInput ki = new KeyInput(tank1,tank2, this,this);

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

	public static void main(String[] args){
		GameField field = new GameField();

	}

}
