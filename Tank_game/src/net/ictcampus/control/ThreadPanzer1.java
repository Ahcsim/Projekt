package net.ictcampus.control;

import net.ictcampus.view.Tank;

public class ThreadPanzer1 implements Runnable{

	private Tank t;
	public ThreadPanzer1(Tank t) {
		this.t=t;
		
	}
	
	@Override
	public void run() {
		t.moveObject(t.getRichtung());
		//t.tankStop();
	}

}
