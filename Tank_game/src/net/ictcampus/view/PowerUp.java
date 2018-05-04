package net.ictcampus.view;

import net.ictcampus.model.Element;

public class PowerUp extends Element{
	
	//Definition
	private int lives;
	private int PowerUp;
	private int xPos;
	private int yPos;
	private int zufallPos;
	private int zufallPow;
	private double ugZufallPos;
	private double ugZufallPow;
	
	//Element wird erstellt
	public PowerUp(int posX, int posY, int width, int height, String pic){
		super(posX, posY, width, height, pic);
	}
	
	//Die Position wird zufällig bestimmt
	public void zufallPosition() {
		PowerUp = zufallPowerUp();
		ugZufallPos = Math.random()*4;
		ugZufallPos =(Math.round(ugZufallPos));
		zufallPos = (int)(ugZufallPos);
		switch(zufallPos) {
		case 1:
			setxPos(63);
			setyPos(590);
			break;
		case 2:
			setxPos(632);
			setyPos(64);
			break;
		case 3:
			setxPos(460);
			setyPos(370);
			break;
		case 4:
			setxPos(406);
			setyPos(595);
			break;
		default:
			zufallPosition();
		}
	}
	
	//Es wird ein zufälliges PowerUp gewählt
	public int zufallPowerUp() {
		ugZufallPow = Math.random()*4;
		ugZufallPow =(Math.ceil(ugZufallPow));
		zufallPow = (int)(ugZufallPow);
		return zufallPow;
	}
	
	public void powerUps(Tank tank){
		
		switch(zufallPow) {
		case 1:
			lives = tank.getLives()+1;
			tank.setLives(lives);
		}
			
	}
	
	//Getter und Setter
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getPowerUp() {
		return PowerUp;
	}
	
}
