package com.dm.swing6;

import javax.swing.SwingUtilities;

public class App6
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame6();
			}
		});
	}
}
