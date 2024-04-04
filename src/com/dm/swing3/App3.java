package com.dm.swing3;

import javax.swing.SwingUtilities;

public class App3
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame3();
			}
		});
	}
}
