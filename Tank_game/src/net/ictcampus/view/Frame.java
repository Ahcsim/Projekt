package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import net.ictcampus.model.Element;
/**
In dieser Klasse wird ein Timer erstellt und bei einer Action die Kollisionen gecheckt und die Schüsse/Panzer bewegt
**/
public class Frame extends JPanel {

	private ArrayList<Element> elements = new ArrayList<>();
	private Timer timer;
	private Tank t1;
	private Tank t2;

	public Frame(ArrayList<Element> e, Tank t1, Tank t2) {
		elements = e;
		this.t1 = t1;
		this.t2 = t2;
		update();
		start();
	}

	private void update() {
		//
		timer = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean removed = false;
				//Eine for schleife die durch die Elemente geht
				for (Iterator<Element> iteratorBullets = elements.iterator(); iteratorBullets.hasNext();) {
					Element el = iteratorBullets.next();
					if (el instanceof Bullet) {
						Bullet bullet = (Bullet) el;
						bullet.moveObject(bullet.getRichtung());
						//Falls der Schuss aus dem Spielfeld geht, wird er entfernt
						if (bullet.getX() < 0 || bullet.getX() > 700) {
							iteratorBullets.remove();
							System.out.println("You missed everything");
						}
						if (bullet.getY() < 0 || bullet.getY() > 700) {
							iteratorBullets.remove();
							System.out.println("You missed everything");
						}
						Iterator<Element> iteratorBarrier = elements.iterator();
						while (iteratorBarrier.hasNext() && !removed) {
							Element a = iteratorBarrier.next();
							if (a instanceof Barrier) {
								//Wenn der schuss eine Barriere berührt, wird er entfernt
								if (bullet.collision(a)) {
									iteratorBullets.remove();
									System.out.println("Barrierhit");
									removed = true;
								}
							}
						}
						//Wenn ein Spieler vom schuss des anderen getroffen wird, wird im ein Leben abgezogen und der Schuss wird entfernt
						if (bullet.collision(t1)&&bullet.getOwner()!="Tank1") {
							t1.setLives(t1.getLives() - 1);
							System.out.println("GETROFFEN!");
							System.out.println(" Spieler 1 hat " + t1.getLives() + " Leben übrig");
							iteratorBullets.remove();
							if(t1.getLives()<=0) {
								end1();
							}
						}
						if (bullet.collision(t2)&&bullet.getOwner()!="Tank2") {
							t2.setLives(t2.getLives() - 1);
							System.out.println("GETROFFEN!");
							System.out.println("Spieler 2 hat " + t2.getLives() + " Leben übrig");
							iteratorBullets.remove();
							if(t2.getLives()<=0) {
								end2();
							}
						}
					}
					Iterator<Element> iterator2Barrier = elements.iterator();
					while (iterator2Barrier.hasNext()) {
						Element b = iterator2Barrier.next();
						//Wenn ein ein Panzer eine Barriere berührt wird er umgedreht
						if (b instanceof Barrier) {
							if (t1.collision(b)) {
								String richtung = t1.getRichtung();
								switch (richtung) {
								case "hoch":
									t1.changeImg(7);
									t1.setHeight(60);
									t1.setWidth(32);
									t1.tankBackward();
									break;
								case "runter":
									t1.changeImg(5);
									t1.setHeight(60);
									t1.setWidth(32);
									t1.tankForward();
									break;
								case "links":
									t1.changeImg(6);
									t1.setHeight(32);
									t1.setWidth(60);
									t1.tankRight();
									break;
								case "rechts":
									t1.changeImg(8);
									t1.setHeight(32);
									t1.setWidth(60);
									t1.tankLeft();
									break;
								}
							}
							if (t2.collision(b)) {
								String richtung = t2.getRichtung();
								switch (richtung) {
								case "hoch":
									t2.changeImg(3);
									t2.setHeight(60);
									t2.setWidth(32);
									t2.tankBackward();
									break;
								case "runter":
									t2.changeImg(1);
									t2.setHeight(60);
									t2.setWidth(32);
									t2.tankForward();
									break;
								case "links":
									t2.changeImg(2);
									t2.setHeight(32);
									t2.setWidth(60);
									t2.tankRight();
									break;
								case "rechts":
									t2.changeImg(4);
									t2.setHeight(32);
									t2.setWidth(60);
									t2.tankLeft();
									break;
								}
							}
						}
					}
					//Falls ein Panzer aus dem Spielfeld fährt wird er umgedreht
					if (t1.getX() < -15 || t1.getX() > 715 -t1.getWidth()|| t1.getY() < -15 || t1.getY() > 710-t1.getHeight()) {
						String richtung = t1.getRichtung();
						switch (richtung) {
						case "hoch":
							t1.changeImg(7);
							t1.setHeight(60);
							t1.setWidth(32);
							t1.tankBackward();
							break;
						case "runter":
							t1.changeImg(5);
							t1.setHeight(60);
							t1.setWidth(32);
							t1.tankForward();
							break;
						case "links":
							t1.changeImg(6);
							t1.setHeight(32);
							t1.setWidth(60);
							t1.tankRight();
							break;
						case "rechts":
							t1.changeImg(8);
							t1.setHeight(32);
							t1.setWidth(60);
							t1.tankLeft();
							break;
						}
					}
					if (t2.getX() < -15 || t2.getX() > 715-t2.getWidth() || t2.getY() < -15 || t2.getY() > 710-t2.getHeight()) {
						String richtung = t2.getRichtung();
						switch (richtung) {
						case "hoch":
							t2.changeImg(3);
							t2.setHeight(60);
							t2.setWidth(32);
							t2.tankBackward();
							break;
						case "runter":
							t2.changeImg(1);
							t2.setHeight(60);
							t2.setWidth(32);
							t2.tankForward();
							break;
						case "links":
							t2.changeImg(2);
							t2.setHeight(32);
							t2.setWidth(60);
							t2.tankRight();
							break;
						case "rechts":
							t2.changeImg(4);
							t2.setHeight(32);
							t2.setWidth(60);
							t2.tankLeft();
							break;
						}
					}
					//und zum Schluss werden die Panzer bewegt
					t1.moveObject(t1.getRichtung());
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					t2.moveObject(t2.getRichtung());
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					repaint();
				}
			}
		});
	}

	private void start() {
		timer.start();
	}

	public void pause() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void end1() {
		JOptionPane.showMessageDialog(null, "Spieler 1 ist gestorben, glückwunsch Spieler 2","Ende",JOptionPane.OK_OPTION);
		timer.stop();
	}
	public void end2() {
		JOptionPane.showMessageDialog(null, "Spieler 2 ist gestorben, glückwunsch Spieler 1","Ende",JOptionPane.OK_OPTION);
		timer.stop();
	}
	//Hier werden die Objekte und der Hintergrund auf das Spielfeld gezeichnet
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0, 200, 300);
		BufferedImage back = null;
		try {
			back = ImageIO.read(new File("Images/Map1.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		g.drawImage(back, 0, 0, null);
		for (Element e : elements) {
			g.drawImage(e.getImg(), e.getX(), e.getY(), e.getWidth(), e.getHeight(), null);
		}
	}

}
