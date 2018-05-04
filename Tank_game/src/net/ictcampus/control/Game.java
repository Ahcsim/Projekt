package net.ictcampus.control;

import javax.swing.JFrame;

import net.ictcampus.view.GameField;
import net.ictcampus.view.Start;

public class Game extends JFrame{ 

	private String f1;
	private String f2;

	Time t = new Time();
	public Game() {
		
	}
	
	public static void main(String[] args) {
		Start s = new Start();
	}

	public String getF1() {
		return f1;
	}

	public void setF1(String f1) {
		this.f1 = f1;
	}

	public String getF2() {
		return f2;
	}

	public void setF2(String f2) {
		this.f2 = f2;
	}
	
	
}
