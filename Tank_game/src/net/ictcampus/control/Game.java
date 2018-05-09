package net.ictcampus.control;

import javax.swing.JFrame;

import net.ictcampus.view.Start;

public class Game extends JFrame{ 
	
	//Timer wird gestartet
	Time t = new Time();
	public Game() {
		
	}
	
	//Erste Aktion im Spiel(Startbildschirm)
	public static void main(String[] args) {
		Start s = new Start();
	}
	
}
