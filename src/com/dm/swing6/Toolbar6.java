package com.dm.swing6;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar6 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton helloButton;
	private JButton goodbyeButton;
	
	public Toolbar6() {
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
	}
}
