package com.dm.swing5;

import javax.swing.SwingUtilities;

public class App5
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame5();
			}
		});
	}
}
