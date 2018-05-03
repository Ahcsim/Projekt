package net.ictcampus.control;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
