package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DropMode;

import java.awt.GridLayout;

public class NewPartition extends JPanel {
	
	private JTextField tfNotes;
	private JButton bDo, bRe, bMi, bFa, bSo, bLa, bti, bDo1, bRe1,
					bMi1, bFa1, bSo1, bLa1, bti1, bDo2;
	private JLabel label;
	JPanel panel;
	
	public NewPartition() {
		setBackground(Color.ORANGE);

		tfNotes = new JTextField();
		tfNotes.setPreferredSize(new Dimension(50, 24));
//		tfNotes.setColumns(50);
		
		
		add(tfNotes);
		
		bDo = new JButton("Do");
		bDo.setPreferredSize(new Dimension(100, 100));
		
		bRe = new JButton("Re");
		bRe.setPreferredSize(new Dimension(100, 100));
		
		bMi = new JButton("Mi");
		bMi.setPreferredSize(new Dimension(100, 100));
		
		bFa = new JButton("Fa");
		bFa.setPreferredSize(new Dimension(100, 100));
		
		bSo = new JButton("So");
		bSo.setPreferredSize(new Dimension(100, 100));
		
		bLa = new JButton("La");
		bLa.setPreferredSize(new Dimension(100, 100));
		
		bti = new JButton("ti");
		bti.setPreferredSize(new Dimension(100, 100));
		
		bDo1 = new JButton("Do1");
		bDo1.setPreferredSize(new Dimension(100, 100));
		
		bRe1 = new JButton("Re1");
		bRe1.setPreferredSize(new Dimension(100, 100));
		
		bMi1 = new JButton("Mi1");
		bMi1.setPreferredSize(new Dimension(100, 100));
		
		bFa1 = new JButton("Fa1");
		bFa1.setPreferredSize(new Dimension(100, 100));
		
		bSo1 = new JButton("So1");
		bSo1.setPreferredSize(new Dimension(100, 100));
		
		bLa1 = new JButton("La1");
		bLa1.setPreferredSize(new Dimension(100, 100));
		
		bti1 = new JButton("ti1");
		bti1.setPreferredSize(new Dimension(100, 100));
		
		bDo2 = new JButton("Do2");
		bDo2.setPreferredSize(new Dimension(100, 100));
		
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		gbc.gridx = gbc.gridy = 0;
		
		//La taille en hauteur et en largeur
	    gbc.gridheight = 1;
	    gbc.gridwidth = 1;
	    add(bDo, gbc);
	    
	    gbc.gridx = 1;
	    add(bRe, gbc);
	    
	    gbc.gridx = 2;
	    add(bMi, gbc);
	    
	    gbc.gridx = 3;
	    add(bFa, gbc);
	    
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    gbc.gridx = 4;
	    add(bSo, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 1;
	    gbc.gridheight = 1;
	    add(bLa, gbc);
	    
	    gbc.gridx = 1;
	    add(bti, gbc);
	    
	    gbc.gridx = 2;
	    add(bDo1, gbc);
	    
	    gbc.gridx = 3;
	    add(bRe1, gbc);
	    
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    gbc.gridx = 4;
	    add(bMi1, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    gbc.gridheight = 1;
	    add(bFa1, gbc);
	    
	    gbc.gridx = 1;
	    add(bSo1, gbc);
	    
	    gbc.gridx = 2;
	    add(bLa1, gbc);
	    
	    gbc.gridx = 3;
	    add(bti1, gbc);
	    
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    gbc.gridx = 4;
	    add(bDo2, gbc);

	}

	private void setContentPane(JPanel pan) {
		// TODO Auto-generated method stub
		
	}
}
