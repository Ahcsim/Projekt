package net.ictcampus.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.ictcampus.view.ChoseTank;
import net.ictcampus.view.Start;

public class ButtonListener implements ActionListener{
	Start start;
	public ButtonListener(Start s) {
		start = s;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Start")) {
			start.dispose();
			ChoseTank ct = new ChoseTank();
		}
		
	}

}
