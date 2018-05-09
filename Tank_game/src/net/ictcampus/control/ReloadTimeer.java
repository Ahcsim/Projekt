package net.ictcampus.control;

import java.util.Timer;
import java.util.TimerTask;
//Dieser Timer zählt im Sekundentakt hoch damit kann ich schauen wie lange es her ist seit dem letzten Schuss
public class ReloadTimeer {
	private int time = 0;

	public ReloadTimeer() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				time++;
			}
		}, 1000, 1000);
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
