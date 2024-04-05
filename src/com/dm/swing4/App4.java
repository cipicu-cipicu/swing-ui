package com.dm.swing4;

import javax.swing.SwingUtilities;

public class App4
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame4();
			}
		});
	}
}
