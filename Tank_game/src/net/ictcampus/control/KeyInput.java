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

//Keylistener welcher die eingaben aufnimmt, damit die Panzer fahren, schiessen und anhalten können
public class KeyInput implements KeyListener {

	Tank tank1;
	Tank tank2;
	JFrame frame;
	GameField feld;
	ReloadTimeer timer = new ReloadTimeer();
	ReloadTimeer timer2 = new ReloadTimeer();

	//Im Konstruktor werden 2 Panzer das gamefield und das Frame weitergegeben
	public KeyInput(Tank t1, Tank t2, GameField field) {
		tank1 = t1;
		tank2 = t2;
		frame = field;
		feld = field;
	}

	//nach oben fahren 2ter Panzer
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			tank2.changeImg(1);
			tank2.setHeight(60);
			tank2.setWidth(32);
			tank2.tankForward();
		}
	//nach unten fahren 2ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			tank2.changeImg(3);
			tank2.setHeight(60);
			tank2.setWidth(32);
			tank2.tankBackward();
		}
	//Nach rechts fahren 2ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			tank2.changeImg(2);
			tank2.setHeight(32);
			tank2.setWidth(60);
			tank2.tankRight();
		}
	//Nach links fahren 2ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			tank2.changeImg(4);
			tank2.setHeight(32);
			tank2.setWidth(60);
			tank2.tankLeft();
		}
	//Nach oben fahren 1ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_W) {
			tank1.changeImg(5);
			tank1.setHeight(60);
			tank1.setWidth(32);
			tank1.tankForward();
		}
	//Nach unten fahren 1ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_S) {
			tank1.changeImg(7);
			tank1.setHeight(60);
			tank1.setWidth(32);
			tank1.tankBackward();
		}
	//Nach rechts fahren 1ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_D) {
			tank1.changeImg(6);
			tank1.setHeight(32);
			tank1.setWidth(60);
			tank1.tankRight();
		}
	//Nach links fahren 1ter Panzer
		if (e.getKeyCode() == KeyEvent.VK_A) {
			tank1.changeImg(8);
			tank1.setHeight(32);
			tank1.setWidth(60);
			tank1.tankLeft();

	//Tank stoppen 2ter Panzer
		}
		if (e.getKeyCode() == 96) {
			tank2.tankStop();
		}
	//Tank stoppen 1ter Panzer	
		if (e.getKeyCode() == KeyEvent.VK_F) {
			tank1.tankStop();
		}
	//Tank 2 schiessen
		if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
			//Timer der im sekundentakt hochzählt
			int zeit = timer.getTime();
			if (zeit > 1) {
				timer.setTime(0);
				Bullet a = (tank2.shoot(tank2));
				feld.addElement(a);
				a.setRichtung(tank2.getRichtung());
				switch (a.getRichtung()) {
				case "hoch":
					a.bulletForward();
					break;
				case "runter":
					a.bulletBackward();
					break;
				case "links":
					a.bulletLeft();
					break;
				case "rechts":
					a.bulletRight();
					break;
				}
				try {
					a.setImg(ImageIO.read(new File("Images/punkt.png")));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		//Tank 1 schiessen
		if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
			int zeit2 = timer2.getTime();
			if (zeit2 > 1) {
				timer2.setTime(0);
				Bullet a = (tank1.shoot(tank1));
				a.setRichtung(tank1.getRichtung());
				feld.addElement(a);
				switch (a.getRichtung()) {
				case "hoch":
					a.bulletForward();
					break;
				case "runter":
					a.bulletBackward();
					break;
				case "links":
					a.bulletLeft();
					break;
				case "rechts":
					a.bulletRight();
					break;
				}
				try {
					a.setImg(ImageIO.read(new File("Images/punkt.png")));
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
