package com.editab.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.editab.models.Score;

public class MusicScorePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final Dimension PANEL_SIZE = new Dimension(1024, 800);
	private static final short NOTE_NUMBER = 15; 
	
	private static final String [] note_label = new String [] {
		"Do","Re","Mi","Fa","Sol","Je","Connais","Pas","Les","Autres","","","","",""
	};
	
	/**
	 * GUI Elements
	 */
	private JButton [] buttons = new JButton[NOTE_NUMBER];
	private JButton bClear = new JButton("Clear");
	private JButton bSave = new JButton("Save");
	
	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	
	/**
	 * Model(s)
	 */
	private Score score = new Score ();
	
	public MusicScorePanel () {
		
		setLayout(new GridLayout(1, 2, 5, 5));
		setPreferredSize(PANEL_SIZE);
		
		initPanel();
		// Useless right ?
		setVisible(true);
	}
	
	public void initPanel () {
		
		leftPanel.setLayout(new GridLayout(8,8));
		
		leftPanel.setBackground(Color.GRAY);
		rightPanel.setBackground(Color.GRAY);
		
		
		for(int i = 0; i < buttons.length; i++) {
			
			buttons[i] = new JButton(note_label[i]);
			
			buttons[i].addActionListener(noteListener);
			
			leftPanel.add(buttons[i]);
		}
		
		add(leftPanel);
		add(rightPanel);
	}
	
	private final ActionListener noteListener = new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton source = (JButton) e.getSource();
			
			score.addNote(source.getText());
		}
		
	};

}
