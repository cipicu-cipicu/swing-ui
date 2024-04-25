package com.dm.swing6;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel6 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;
	
	public TextPanel6() {
		textArea = new JTextArea();
		textArea.setBackground(Color.PINK);
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}

	public void appendText(String text) {
		textArea.append(text);
	}
}
