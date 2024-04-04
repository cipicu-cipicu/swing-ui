package com.dm.swing2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

// see: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

public class MainFrame2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame2() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Clieck Me!");
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
