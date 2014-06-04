package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DropMode;

import java.awt.GridLayout;

public class NewPartition extends JPanel {
	
	private JTextField tfNotes;
	private JButton bDo, bRe, bMi, bFa, bSo, bLa, bti, bDo1, bRe1,
					bMi1, bFa1, bSo1, bLa1, bti1, bDo2;
	
	public NewPartition() {
		JPanel pan = new JPanel();
		tfNotes = new JTextField();
		tfNotes.setSize(50, 15);
		bDo = new JButton("Do");
		bRe = new JButton("bRe");
		bMi = new JButton("bMi");
		bFa = new JButton("bFa");
		bSo = new JButton("bSo");
		bLa = new JButton("bLa");
		bti = new JButton("bti");
		bDo1 = new JButton("bDo1");
		bRe1 = new JButton("bRe1");
		bMi1 = new JButton("bMi1");
		bFa1 = new JButton("bFa1");
		bSo1 = new JButton("bSo1");
		bLa1 = new JButton("bLa1");
		bti1 = new JButton("bti1");
		bDo2 = new JButton("bDo2");
		pan.add(tfNotes);
		pan.add(bDo);
		pan.setBackground(Color.black);
		
//		GroupLayout glLeft = new GroupLayout(pan);
//		pan.setLayout(glLeft);
//		pan.setBackground(Color.black);
		
		
//		glLeft.setHorizontalGroup(
//				glLeft.createSequentialGroup()
//				.addComponent(tfNotes)
//				.addGap(5)
//				.addComponent(bDo));
//		
//		glLeft.setVerticalGroup(
//				glLeft.createSequentialGroup()
//				.addComponent(tfNotes)
//				.addGap(15)
//				.addComponent(bDo));
//		add(pan);
	}
}
