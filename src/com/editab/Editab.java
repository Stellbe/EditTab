package com.editab;

import javax.swing.SwingUtilities;

import com.editab.views.MainFrame;

public class Editab {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MainFrame();
			}
			
		});

	}
}
