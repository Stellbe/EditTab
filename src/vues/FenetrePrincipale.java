package vues;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FenetrePrincipale extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lCom, lIdentifiant, lMotPasse, lBienvenue;
	private JMenuBar menuBar;
	private JMenu mFichier, mAide;
	private JMenuItem miNouveau, miQuitter, miApropos, miInformation;
	private NewPartition np = null;
	
	private JTextField tfIdentifiant;
	
	public FenetrePrincipale() throws HeadlessException {

	}

	public FenetrePrincipale(GraphicsConfiguration gc) {
		super(gc);
	}

	public FenetrePrincipale(String title) throws HeadlessException {
		super(title);
	}

	public FenetrePrincipale(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

	protected void frameInit() {
		super.frameInit();
		init();
	}

	public void init() {

		setTitle("Projet - EditTab");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(createMenuBar());
		setLocation(150, 150);
		setSize(400, 400);
		setVisible(true);
	}
	
	public void removePanneau() {
		getContentPane().removeAll();
	}
	
	private JMenuBar createMenuBar() {
		menuBar = new JMenuBar();
		
		mFichier = new JMenu("Fichier");
		mFichier.setMnemonic('F');
		mFichier.add(getMiNouveau());
		mFichier.add(getMiQuitter());
		menuBar.add(mFichier);
		
		mAide = new JMenu("Aide");
		mAide.setMnemonic('A');
		menuBar.add(mAide);
		
		return menuBar;
	}
	
	protected JMenuItem getMiNouveau(){
		if (miNouveau == null) {
			miNouveau = new JMenuItem("Nouvelle partition");
			miNouveau.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					removePanneau();
					getContentPane().add(getNewPartition());
					setSize(530, 380);
				}
			});
		}
		return miNouveau;
	}
	
	protected JMenuItem getMiQuitter(){
		if (miQuitter == null) {
			miQuitter = new JMenuItem("Quitter");
			miQuitter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
		}
		return miQuitter;
	}
	
	private NewPartition getNewPartition(){
		np = new NewPartition();
		return np;
	}

	public void dispose() {
		super.dispose();
	}
	
}