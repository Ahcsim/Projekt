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
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    		tank2.changeImg(3);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    		tank2.changeImg(2);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
    		tank2.changeImg(4);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_W) {
    		tank2.changeImg(1);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_S) {
    		tank2.changeImg(3);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_D) {
    		tank2.changeImg(2);
    		frame.repaint();
    	}
    	if (e.getKeyCode() == KeyEvent.VK_A) {
    		tank2.changeImg(4);
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
