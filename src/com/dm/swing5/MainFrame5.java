package com.dm.swing5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// see: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

public class MainFrame5 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private TextPanel5 textPanel;
	private JButton btn;
	private Toolbar5 toolbar;
	
	public MainFrame5() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar5();
		btn = new JButton("Click Me!");
		textPanel = new TextPanel5();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("Hello\n");
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
