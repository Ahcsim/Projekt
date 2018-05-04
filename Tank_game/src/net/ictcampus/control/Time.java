package net.ictcampus.control;

import java.util.Timer;
import java.util.TimerTask;

import net.ictcampus.view.PowerUp;

public class Time {
	
	public Time() {
		PowerUp pu = new PowerUp(0, 0, 30, 30,"C:\\Users\\spilkat\\Documents\\Module\\Applikationsentwicklung\\Projekt\\Projekt\\Images");
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				pu.zufallPosition();
			}
		}, 30*1000, 30*1000);
	}
}
