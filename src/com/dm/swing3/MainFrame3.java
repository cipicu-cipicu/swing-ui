package com.dm.swing3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

// see: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

public class MainFrame3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame3() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click Me!");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello\n");
			}
		});
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
