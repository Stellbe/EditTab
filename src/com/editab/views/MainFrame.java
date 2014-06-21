package com.editab.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

// TODO : Do not allow resize for now
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static final String FRAME_TITLE = "Projet Editab";
	private static final Dimension FRAME_SIZE = new Dimension(1024, 800);
	
	private JMenuBar menu = new JMenuBar();
	
	private JMenu mFile = new JMenu("Fichier");
	
	private JMenuItem iNew = new JMenuItem("Nouveau");
	private JMenuItem iQuit = new JMenuItem("Quitter");
	
	private JPanel fMusicScore = null;
	
	public MainFrame () {
		super();
		init();
	}
	
	private void init () {
		
		setTitle(FRAME_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLACK);

		setSize(FRAME_SIZE);
		
		setJMenuBar(initializeMenu());
		
		setVisible(true);
		
	}
	
	/**
	 * Initialize the menu bar and binds the different JMenuItem
	 * 
	 * @return 
	 */
	private JMenuBar initializeMenu() {
		
		iNew.setMnemonic('N');
		iQuit.setMnemonic('Q');
		
		iNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(newMusicScoreFrame());
				pack();
			}
			
		});
		
		iQuit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		
		mFile.setMnemonic('F');
		
		mFile.add(iNew);
		mFile.add(iQuit);
		
		menu.add(mFile);
		
		return menu;
	}

	/**
	 * Returns a new musicScore Panel
	 * 
	 * @return
	 */
	public JPanel newMusicScoreFrame () {
		
		fMusicScore = new MusicScorePanel();
		
		return fMusicScore;
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}

}
