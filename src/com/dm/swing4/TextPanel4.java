package com.dm.swing4;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel4 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;
	
	public TextPanel4() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}

	public void appendText(String text) {
		textArea.append(text);
	}
}
