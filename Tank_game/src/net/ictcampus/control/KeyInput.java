package net.ictcampus.control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import net.ictcampus.view.Tank;

public class KeyInput implements KeyListener{

	Tank tank1;
	Tank tank2;
	JFrame frame;
	public KeyInput(Tank t1, Tank t2, JFrame f) {
		// TODO Auto-generated constructor stub
		tank1=t1;
		tank2 = t2;
		frame = f;
		
	}

	
    public void keyPressed(KeyEvent e) {
    	if (e.getKeyCode() == KeyEvent.VK_UP) {
    		tank2.changeImg(1);
    		tank2.setHeight(60);
    		tank2.setWidth(32);
    		int y = tank2.getY();
    		tank2.setY(y-8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    		tank2.changeImg(3);
    		int y = tank2.getY();
    		tank2.setHeight(60);
    		tank2.setWidth(32);
    		tank2.setY(y+8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    		tank2.changeImg(2);
    		int x = tank2.getX();
    		tank2.setHeight(32);
    		tank2.setWidth(60);
    		tank2.setX(x+8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
    		tank2.changeImg(4);
    		int x = tank2.getX();
    		tank2.setHeight(32);
    		tank2.setWidth(60);
    		tank2.setX(x-8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_W) {
    		tank1.changeImg(5);
    		int y = tank1.getY();
    		tank1.setHeight(60);
    		tank1.setWidth(32);
    		tank1.setY(y-8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_S) {
    		tank1.changeImg(7);
    		int y = tank1.getY();
    		tank1.setHeight(60);
    		tank1.setWidth(32);
    		tank1.setY(y+8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_D) {
    		tank1.changeImg(6);
    		int x = tank1.getX();
    		tank1.setHeight(32);
    		tank1.setWidth(60);
    		tank1.setX(x+8);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_A) {
    		tank1.changeImg(8);
    		int x = tank1.getX();
    		tank1.setHeight(32);
    		tank1.setWidth(60);
    		tank1.setX(x-8);
    		frame.repaint();
    	}
    }


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
