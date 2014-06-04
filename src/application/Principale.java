package application;

import javax.swing.SwingUtilities;

import vues.FenetrePrincipale;

public class Principale {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new FenetrePrincipale();
			}
		});

	}
}
