package com.editab.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import com.editab.models.Score;

public class MusicScorePanel extends JPanel implements Observer {

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
	
	private JButton [] buttons = new JButton[NOTE_NUMBER];
	private JButton bClear = new JButton("Clear");
	private JButton bSave = new JButton("Save");
	private JTextArea textNote = new JTextArea();
	
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
		
		score.addObserver(this);
		leftPanel.setLayout(new MigLayout("fillx, wrap 5, gap 10px 30px"));
//		leftPanel.setLayout(new GridLayout(3, 5));
		
		leftPanel.add(textNote, "span, growx, growy, wrap");	
		
		leftPanel.setBackground(Color.GRAY);
		rightPanel.setBackground(Color.GRAY);
		
		
		
		
		for(int i = 0; i < buttons.length; i++) {
			
//			buttons[i] = new JButton(note_label[i]);
			buttons[i] = new JButton();
			try {
				Image imgButton = ImageIO.read(getClass().getResource("/img/"+ note_label[i] +".png"));
	        	buttons[i].setIcon(new ImageIcon(imgButton));
	        	buttons[i].setFocusPainted(false);
	        }catch (IOException ex) {
	        }
			buttons[i].setName(note_label[i]);
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
			
//			score.addNote(source.getText());
			score.addNote(source.getName());
		}
		
	};


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (score.getNote() != null) {
			String tmp = "";
			JLabel labelNote;
			for (int i = 0; i < score.getNote().size(); i++) {
				tmp = tmp + score.getNote().get(i) + " - ";
				rightPanel.setLayout(new MigLayout("fillx, wrap 5, gap 10px 30px"));
				
				
				
				try {
					JOptionPane.showMessageDialog(null, score.getNote().get(score.getNote().size() - 1));
					JOptionPane.showMessageDialog(null, "/img/"+ score.getNote().get(i) +".jpg");
					Image image = ImageIO.read(getClass().getResource("/img/"+ score.getNote().get(i) +".jpg"));
					labelNote = new JLabel(new ImageIcon(image));
					rightPanel.add(labelNote);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				JLabel labelNote = new JLabel(new ImageIcon(image));
//		    	labelNote = new JLabel(new ImageIcon(image));
//		    	labelTest.setSize(100, 100);
			}
//			JLabel labelNote = new JLabel(new ImageIcon(image));
//			rightPanel.add(labelNote);
			textNote.setText(tmp);
			
//			JOptionPane.showMessageDialog(null, score.getNote().get(score.getNote().size() - 1));
		}
		
	}

}
