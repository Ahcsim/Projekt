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
import javax.swing.JPanel;
import javax.swing.Timer;
import net.ictcampus.model.Element;

public class Frame extends JPanel {

	ArrayList<Element> elements = new ArrayList<>();
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
		timer = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(Iterator<Element> iteratorBullets=elements.iterator();iteratorBullets.hasNext();) {
					Element el =iteratorBullets.next();
					if(el instanceof Bullet) {
						Bullet bullet = (Bullet) el;
						bullet.moveObject(bullet.getRichtung());
						if(bullet.getX()<0||bullet.getX()>700) {
							iteratorBullets.remove();
						}
						if(bullet.getY()<0||bullet.getY()>700) {
							iteratorBullets.remove();
						}
						if(bullet.collision(t1)) {
							t1.setLives(t1.getLives()-1);
							System.out.println(t1.getLives()+"Spieler 1");
							System.out.println("GETROFFEN!");
							iteratorBullets.remove();
						}
						if(bullet.collision(t2)) {
							t2.setLives(t2.getLives()-1);
							System.out.println(t2.getLives()+"Spieler 2");
							System.out.println("GETROFFEN!");
							iteratorBullets.remove();
						}
					}
					t1.moveObject(t1.getRichtung());
					t2.moveObject(t2.getRichtung());
					repaint();
					//t1.tankStop();
					//t2.tankStop();
					Thread panzer = new Thread();
					Thread panzer2= new Thread();
					
					
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
