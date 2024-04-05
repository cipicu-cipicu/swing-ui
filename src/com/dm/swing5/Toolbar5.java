package com.dm.swing5;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar5 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton helloButton;
	private JButton goodbyeButton;
	
	public Toolbar5() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
}
