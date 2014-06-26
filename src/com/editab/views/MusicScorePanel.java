package com.editab.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import com.editab.models.PageFormat;
import com.editab.models.Score;

public class MusicScorePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;

	private static final Dimension PANEL_SIZE = new Dimension(1024, 800);
	private static final short NOTE_NUMBER = 16; 
	
	private static final String [] note_label = new String [] {
		"Do", "Re", "Mi", "Fa", "So", "La", "Ti", "Do1", "Re1", "Mi1", "Fa1",
		"So1", "La1", "Ti1", "Do2", "__"
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
		rightPanel.setLayout(new MigLayout("fillx, wrap 12, gap 10px 30px, width 13:13:13"));
		
		leftPanel.add(textNote, "span, growx, growy, wrap");	
		
		leftPanel.setBackground(Color.GRAY);
		rightPanel.setBackground(Color.GRAY);
		
		
		
		
		for(int i = 0; i < buttons.length; i++) {
			
			buttons[i] = new JButton();
			buttons[i].setName(note_label[i]);
			if (buttons[i].getName() == "__") {
				buttons[i].setText("__");
			} else {
				try {
					Image imgButton = ImageIO.read(getClass().getResource("/img/"+ note_label[i] +".png"));
		        	buttons[i].setIcon(new ImageIcon(imgButton));
		        	buttons[i].setFocusPainted(false);
		        }catch (IOException ex) {
		        }
			}
			
			buttons[i].addActionListener(noteListener);
			leftPanel.add(buttons[i], "width 70:70:70, height 120:120:120, growx");
		}
		
		JButton clearButton = new JButton("Clear");
		clearButton.setName("clear");
		clearButton.addActionListener(noteListener);
		leftPanel.add(clearButton);
		
		JButton saveButton = new JButton("Save");
		saveButton.setName("save");
		saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePartition();
            }
        });
		saveButton.addActionListener(noteListener);
		leftPanel.add(saveButton);
		
		add(leftPanel);
		add(rightPanel);
	}
	
	private final ActionListener noteListener = new ActionListener () {

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton source = (JButton) e.getSource();
			
			if (source.getName() == "clear") {
				score.clearNote();
			} else {
				score.addNote(source.getName());
			}
		}
		
	};


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (!(score.getNote().isEmpty())) {
			String tmp = "";
			JLabel labelNote;
			
			tmp = tmp + score.getNote();
			

			if (score.getNote().get(score.getNote().size() -1) == "__") {
				labelNote = new JLabel();
				rightPanel.add(labelNote);
			} else {
				try {
					Image image = ImageIO.read(getClass().getResource("/img/"+ score.getNote().get(score.getNote().size() - 1) +".jpg"));
					labelNote = new JLabel(new ImageIcon(image));
					rightPanel.add(labelNote);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			textNote.setText(tmp);
		} else {
			textNote.setText("");
			rightPanel.removeAll();
			rightPanel.repaint();
		}
		
	}
	
	public void savePartition() {
		PrinterJob pj = PrinterJob.getPrinterJob();
		pj.setJobName("Print Component");
		
		pj.setPrintable(new Printable() {
			
			
			@Override
			public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
					throws PrinterException {
				// TODO Auto-generated method stub
				if (pageIndex > 0) {
					return Printable.NO_SUCH_PAGE;
				}
				
				Graphics2D g2 = (Graphics2D) graphics;
				g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
				rightPanel.paint(g2);
				return Printable.PAGE_EXISTS;
				
			}
		});
		
		if (pj.printDialog() == false)
			return;
		
		try {
			pj.print();
		} catch (PrinterException ex) {
			// handle exception
		}
	}

}
