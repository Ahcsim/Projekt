package net.ictcampus.view;

import javax.swing.JFrame;

import net.ictcampus.model.Element;

public class Bullet extends Element implements Runnable{

	public Bullet(int x, int y, int width, int height, String pic) {
		super(x, y, width, height, pic);
	}

	public void fliegen(String dir, Tank t, Bullet s, JFrame fr) {
		int i = 0;
		System.out.println(t.getX());
		System.out.println(t.getY());
		System.out.println(s.getX());
		System.out.println(s.getY());
		while (i < 10) {
			int x = s.getX();
			int y = s.getY();
			switch (dir) {
			case "hoch":
				s.setY(y - 5);
				break;
			case "runter":
				s.setY(y + 5);
				break;
			case "links":
				s.setY(x - 5);
				break;
			case "rechts":
				s.setY(x + 5);
				break;
			}
			fr.repaint();
			System.out.println(s.getX());
			System.out.println(s.getY());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
