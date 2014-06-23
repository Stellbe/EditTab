package com.editab.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import com.editab.models.Score;

public class MusicScorePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final Dimension PANEL_SIZE = new Dimension(1024, 800);
	private static final short NOTE_NUMBER = 15; 
	
	private static final String [] note_label = new String [] {
		"Do", "Re", "Mi", "Fa", "So", "La", "Ti", "Do1", "Re1", "Mi1", "Fa1",
		"So1", "La1", "Ti1", "Do2"
	};
	
	/**
	 * GUI Elements
	 */
	
	private JTextField nameScore = new JTextField(30);
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
		
		leftPanel.setLayout(new MigLayout("fillx, wrap 5, gap 10px 30px"));
//		leftPanel.setLayout(new GridLayout(3, 5));
		
		leftPanel.add(new JLabel("Nom de la partition :"));
		leftPanel.add(nameScore, "wrap");
		leftPanel.setBackground(Color.GRAY);
		rightPanel.setBackground(Color.GRAY);
		
		
		
		
		for(int i = 0; i < buttons.length; i++) {
			
			buttons[i] = new JButton(note_label[i]);
			
			buttons[i].addActionListener(noteListener);
			
			leftPanel.add(buttons[i], "width 70:70:70, height 120:120:120, growx");
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
