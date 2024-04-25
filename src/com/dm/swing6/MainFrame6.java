package com.dm.swing6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// see: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

// this is the Controller in the MVC
public class MainFrame6 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private TextPanel6 textPanel;
	private JButton btn;
	private Toolbar6 toolbar;
	
	public MainFrame6() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar6();
		btn = new JButton("Click Me!");
		textPanel = new TextPanel6();
		
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
