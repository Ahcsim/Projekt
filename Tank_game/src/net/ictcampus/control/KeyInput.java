package net.ictcampus.control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import net.ictcampus.view.Bullet;
import net.ictcampus.view.GameField;
import net.ictcampus.view.Tank;

public class KeyInput implements KeyListener {

	Tank tank1;
	Tank tank2;
	JFrame frame;
	GameField feld;

	public KeyInput(Tank t1, Tank t2, JFrame f, GameField field) {
		// TODO Auto-generated constructor stub
		tank1 = t1;
		tank2 = t2;
		frame = f;
		feld = field;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			tank2.changeImg(1);
			tank2.setHeight(60);
			tank2.setWidth(32);
			int y = tank2.getY();
			tank2.setY(y - 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			tank2.changeImg(3);
			int y = tank2.getY();
			tank2.setHeight(60);
			tank2.setWidth(32);
			tank2.setY(y + 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			tank2.changeImg(2);
			int x = tank2.getX();
			tank2.setHeight(32);
			tank2.setWidth(60);
			tank2.setX(x + 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			tank2.changeImg(4);
			int x = tank2.getX();
			tank2.setHeight(32);
			tank2.setWidth(60);
			tank2.setX(x - 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			tank1.changeImg(5);
			int y = tank1.getY();
			tank1.setHeight(60);
			tank1.setWidth(32);
			tank1.setY(y - 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			tank1.changeImg(7);
			int y = tank1.getY();
			tank1.setHeight(60);
			tank1.setWidth(32);
			tank1.setY(y + 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			tank1.changeImg(6);
			int x = tank1.getX();
			tank1.setHeight(32);
			tank1.setWidth(60);
			tank1.setX(x + 8);
			frame.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			tank1.changeImg(8);
			int x = tank1.getX();
			tank1.setHeight(32);
			tank1.setWidth(60);
			tank1.setX(x - 8);
			frame.repaint();

		}

		if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
			Bullet a = (tank2.shoot(tank2));
			feld.addElement(a);
			try {
				a.setImg(ImageIO.read(new File("Images/bullet.png")));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.repaint();
			a.fliegen(tank2.getRichtung(), tank2, a,frame);

		}
		if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
			Bullet a = (tank1.shoot(tank1));
			feld.addElement(a);
			try {
				a.setImg(ImageIO.read(new File("Images/bullet.png")));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.repaint();
			a.fliegen(tank1.getRichtung(), tank1, a,frame);

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
