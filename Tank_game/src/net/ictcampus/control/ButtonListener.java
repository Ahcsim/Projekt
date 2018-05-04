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
	Game g = new Game();
	ChoseTank ct = new ChoseTank();
	public ButtonListener(Start s) {
		start = s;
	}
	
	public ButtonListener(ChoseTank ct) {
		choseT = ct;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Start")) {
			start.dispose();
			ct.choose();
			
			
		}
		if(e.getActionCommand().equals("t1")) {

			tankFarbe = "gray";
			choseT.dispose();
			ct.chooseSecond();
		}
		if(e.getActionCommand().equals("t2")) {

			tankFarbe = "green";
			choseT.dispose();
			ct.chooseSecond();
		}
		if(e.getActionCommand().equals("t3")) {

			tankFarbe = "yellow";
			choseT.dispose();
			ct.chooseSecond();
		}
		if(e.getActionCommand().equals("t4")) {

			tankFarbe = "red";
			choseT.dispose();
			ct.chooseSecond();
		}
		if(e.getActionCommand().equals("t1p2")) {

			tankFarbep2 = "grayp2";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			choseT.dispose();
		}
		if(e.getActionCommand().equals("t2p2")) {

			tankFarbep2 = "greenp2";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			choseT.dispose();
		}
		if(e.getActionCommand().equals("t3p2")) {

			tankFarbep2 = "yellowp2";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			choseT.dispose();
		}
		if(e.getActionCommand().equals("t4p2")) {

			tankFarbep2 = "redp2";
			GameField gf = new GameField(tankFarbe, tankFarbep2);
			choseT.dispose();
		}
		
	}

}
