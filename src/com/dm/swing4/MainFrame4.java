package com.dm.swing4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// see: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

public class MainFrame4 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private TextPanel4 textPanel;
	private JButton btn;
	
	public MainFrame4() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		btn = new JButton("Click Me!");
		textPanel = new TextPanel4();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("Hello\n");
			}
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
