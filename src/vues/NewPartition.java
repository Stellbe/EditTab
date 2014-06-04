package vues;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewPartition extends JPanel {
	
	private JTextField tfNotes;
	private JButton bDo, bRe, bMi, bFa, bSo, bLa, bti, bDo1, bRe1,
					bMi1, bFa1, bSo1, bLa1, bti1, bDo2;
	
	public NewPartition() {
		add(tfNotes);
		add(bDo);
	}
}
