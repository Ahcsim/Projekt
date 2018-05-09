package net.ictcampus.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.ictcampus.view.ChoseTank;
import net.ictcampus.view.GameField;
import net.ictcampus.view.Start;

public class ButtonListener implements ActionListener{
	private String tankFarbe;
	private String tankFarbep2;
	Start start;
	ChoseTank choseT;
	ChoseTank ct; 
	ChoseTank ct2; 
	public ButtonListener(Start s) {
		start = s;
	}
	
	public ButtonListener(ChoseTank ct) {
		choseT = ct;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Start")) {
			start.dispose();
			ct = new ChoseTank(this);
			ct.choose();
			
			
		}
		
		//Schaut welcher Button geklickt wurde
		if(e.getActionCommand().equals("t1")) {
			
			tankFarbe = "grau";
			//g.setF1(tankFarbe);
			ct.dispose();
			ct2 = new ChoseTank(this);
			//Der zweite Tank wird erstellt und kann ausgew�hlt werden
			ct2.chooseSecond();
		}
		if(e.getActionCommand().equals("t2")) {

			tankFarbe = "gr�n";
			//g.setF1(tankFarbe);
			ct.dispose();
			ct2 = new ChoseTank(this);
			ct2.chooseSecond();
		}
		if(e.getActionCommand().equals("t3")) {

			tankFarbe = "gelb";
			//g.setF1(tankFarbe);
			ct.dispose();
			ct2 = new ChoseTank(this);
			ct2.chooseSecond();
		}
		if(e.getActionCommand().equals("t4")) {

			tankFarbe = "rot";
			//g.setF1(tankFarbe);
			ct.dispose();
			ct2 = new ChoseTank(this);
			ct2.chooseSecond();
		}
		//Hier wird der zweite Tank gew�hlt
		if(e.getActionCommand().equals("t1p2")) {

			tankFarbep2 = "grau";
			//Der Panzer wird erstellt
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			ct2.dispose();
		}
		if(e.getActionCommand().equals("t2p2")) {

			tankFarbep2 = "gr�n";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			ct2.dispose();
		}
		if(e.getActionCommand().equals("t3p2")) {

			tankFarbep2 = "gelb";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			ct2.dispose();
		}
		if(e.getActionCommand().equals("t4p2")) {

			tankFarbep2 = "rot";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			ct2.dispose();
		}
		
	}

	public ChoseTank getChoseT() {
		return choseT;
	}

	public void setChoseT(ChoseTank choseT) {
		this.choseT = choseT;
	}

}
