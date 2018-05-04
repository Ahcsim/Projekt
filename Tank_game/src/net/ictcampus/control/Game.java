package net.ictcampus.control;

import javax.swing.JFrame;

import net.ictcampus.view.Start;

public class Game extends JFrame{ 
	Time t = new Time();
	Start s = new Start();
	
	public Game() {
		
	}
	
	public static void main(String[] args) {
		Game g = new Game();
	}
}
