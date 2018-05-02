package net.ictcampus.view;

import net.ictcampus.model.Element;

public class PowerUp extends Element{
	private int zufallPos;
	private int zufallPow;
	private double ugZufallPos;
	private double ugZufallPow;
	
	public PowerUp(){
		super(posX, posY, width, height, pic);
	}
	
	public int zufallPosition() {
		ugZufallPos = Math.random()*4;
		ugZufallPos =(Math.round(ugZufallPos));
		zufallPos = (int)(ugZufallPos);
		if(zufallPos == 1) {
			return
		}
	}
	public int zufallPowerUp() {
		ugZufallPos = Math.random()*4;
		ugZufallPos =(Math.round(ugZufallPos));
		zufallPos = (int)(ugZufallPos);
		
	}
}
