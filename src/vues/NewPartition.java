package vues;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class NewPartition extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField tfNotes, tfName;
	private JTextArea textArea;
	private JButton bDo, bRe, bMi, bFa, bSo, bLa, bTi, bDo1, bRe1,
					bMi1, bFa1, bSo1, bLa1, bTi1, bDo2, btSave, btClear;
	
	JPanel panel1, panel2;
	
	private JLabel labelTest;
	private BufferedImage image;
	private GridLayout gridNote;
	int i = 0;
	int l = 1;
	
	public NewPartition() {
		setSize(new Dimension(1024, 800));
		setBackground(Color.ORANGE);
		
		panel1 = new JPanel();
			tfName = new JTextField();
			tfName.setHorizontalAlignment(SwingConstants.CENTER);
			tfNotes = new JTextField();
			
			
			
		
	        bDo2 = new JButton();
	        bLa1 = new JButton();
	        bTi1 = new JButton();
	        bFa1 = new JButton();
	        bSo1 = new JButton();
	        bRe1 = new JButton();
	        bMi1 = new JButton();
	        bRe = new JButton();
	        bDo1 = new JButton();
	        bSo = new JButton();
	        bFa = new JButton();
	        bMi = new JButton();
	        bDo = new JButton();
	        bTi = new JButton();
	        bLa = new JButton();
	        
	       
	        btClear = new JButton();
	        btSave = new JButton();
	        
        panel2 = new JPanel();
        
        gridNote = new GridLayout(1, 0);
        
        
        //-----------------------------------------------------
        panel1.setBackground(new java.awt.Color(247, 20, 20));

        bDo2.setName("bDo2");
        try {
        	Image imgbDo2 = ImageIO.read(getClass().getResource("../img/bDo2.png"));
        	bDo2.setIcon(new ImageIcon(imgbDo2));
        	bDo2.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bDo2.addActionListener(new ChiffreListener());

        btSave.setText("btSave");

        bLa1.setName("bLa1");
        try {
        	Image imgbLa1 = ImageIO.read(getClass().getResource("../img/bLa1.png"));
        	bLa1.setIcon(new ImageIcon(imgbLa1));
        	bLa1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bLa1.addActionListener(new ChiffreListener());
        
        bTi1.setName("bTi1");
        try {
        	Image imgbTi1 = ImageIO.read(getClass().getResource("../img/bTi1.png"));
        	bTi1.setIcon(new ImageIcon(imgbTi1));
        	bTi1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bTi1.addActionListener(new ChiffreListener());

        bFa1.setName("bFa1");
        try {
        	Image imgbFa1 = ImageIO.read(getClass().getResource("../img/bFa1.png"));
        	bFa1.setIcon(new ImageIcon(imgbFa1));
        	bFa1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bFa1.addActionListener(new ChiffreListener());

        bSo1.setName("bSo1");
        try {
        	Image imgbSo1 = ImageIO.read(getClass().getResource("../img/bSo1.png"));
        	bSo1.setIcon(new ImageIcon(imgbSo1));
        	bSo1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bSo1.addActionListener(new ChiffreListener());

        bRe1.setName("bRe1");
        try {
        	Image imgbRe1 = ImageIO.read(getClass().getResource("../img/bRe1.png"));
        	bRe1.setIcon(new ImageIcon(imgbRe1));
        	bRe1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bRe1.addActionListener(new ChiffreListener());

        bMi1.setName("bMi1");
        try {
        	Image imgbMi1 = ImageIO.read(getClass().getResource("../img/bMi1.png"));
        	bMi1.setIcon(new ImageIcon(imgbMi1));
        	bMi1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bMi1.addActionListener(new ChiffreListener());

        bRe.setName("bRe");
        try {
        	Image imgbRe = ImageIO.read(getClass().getResource("../img/bRe.png"));
        	bRe.setIcon(new ImageIcon(imgbRe));
        	bRe.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bRe.addActionListener(new ChiffreListener());
        
        btClear.setText("btClear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNotes.setText(null);
                panel2.removeAll();
                
                panel2.repaint();
                panel2.validate();
            }
        });
        
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDoc();
            }
        });

        bDo1.setName("bDo1");
        try {
        	Image imgbDo1 = ImageIO.read(getClass().getResource("../img/bDo1.png"));
        	bDo1.setIcon(new ImageIcon(imgbDo1));
        	bDo1.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bDo1.addActionListener(new ChiffreListener());
        
        bSo.setName("bSo");
        try {
        	Image imgbSo = ImageIO.read(getClass().getResource("../img/bSo.png"));
        	bSo.setIcon(new ImageIcon(imgbSo));
        	bSo.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bSo.addActionListener(new ChiffreListener());
        
        bFa.setName("bFa");
        try {
        	Image imgbFa = ImageIO.read(getClass().getResource("../img/bFa.png"));
        	bFa.setIcon(new ImageIcon(imgbFa));
        	bFa.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bFa.addActionListener(new ChiffreListener());
        
        bMi.setName("bMi");
        try {
        	Image imgbMi = ImageIO.read(getClass().getResource("../img/bMi.png"));
        	bMi.setIcon(new ImageIcon(imgbMi));
        	bMi.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bMi.addActionListener(new ChiffreListener());
        
        bDo.setName("bDo");
        try {
        	Image imgbDo = ImageIO.read(getClass().getResource("../img/bDo.png"));
        	bDo.setIcon(new ImageIcon(imgbDo));
        	bDo.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bDo.addActionListener(new ChiffreListener());
        
        bTi.setName("bTi");
        try {
        	Image imgbTi = ImageIO.read(getClass().getResource("../img/bTi.png"));
        	bTi.setIcon(new ImageIcon(imgbTi));
        	bTi.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bTi.addActionListener(new ChiffreListener());
        
        bLa.setName("bLa");
        try {
        	Image imgbLa = ImageIO.read(getClass().getResource("../img/bLa.png"));
        	bLa.setIcon(new ImageIcon(imgbLa));
        	bLa.setFocusPainted(false);
        }catch (IOException ex) {
        }
        bLa.addActionListener(new ChiffreListener());
        
        JTextArea textArea = new JTextArea();
        
        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1Layout.setHorizontalGroup(
        	panel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panel1Layout.createSequentialGroup()
        			.addGroup(panel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(panel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(panel1Layout.createSequentialGroup()
        							.addComponent(bLa, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bTi, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bDo1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bRe1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bMi1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        						.addGroup(panel1Layout.createSequentialGroup()
        							.addComponent(bFa1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bSo1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(panel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(panel1Layout.createSequentialGroup()
        									.addComponent(btClear)
        									.addGap(18)
        									.addComponent(btSave))
        								.addGroup(panel1Layout.createSequentialGroup()
        									.addComponent(bLa1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(bTi1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(bDo2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
        						.addGroup(panel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(tfNotes)
        							.addGroup(panel1Layout.createSequentialGroup()
        								.addComponent(bDo, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(bRe, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(bMi, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(bFa, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        								.addGap(6)
        								.addComponent(bSo, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(panel1Layout.createSequentialGroup()
        					.addGap(131)
        					.addComponent(tfName, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
        				.addGroup(panel1Layout.createSequentialGroup()
        					.addGap(58)
        					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(17, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
        	panel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tfNotes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(panel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(bDo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bRe, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bMi, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bFa, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bSo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bLa, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bTi, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bDo1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bRe1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bMi1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bFa1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bSo1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bLa1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bTi1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bDo2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btClear)
        				.addComponent(btSave))
        			.addGap(18)
        			.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        panel1.setLayout(panel1Layout);

//        panel2.setBackground(new java.awt.Color(13, 112, 241));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel2, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel2, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(183, Short.MAX_VALUE))
        );
        this.setLayout(layout);
	}

	class ChiffreListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	    	
	    	String str = ((JButton)e.getSource()).getName();
	    	str = str.substring(1);
	    	
	    	String noteImg = new String();
	    	noteImg = str+".jpg";

	    	if(!(tfNotes.getText().length() == 0))
	    		str = tfNotes.getText() + " - "+ str;
	    	tfNotes.setText(str);
	    	
	    	textArea.setText("test");
	    	
	    	if(!(textArea.getText().length() == 0))
	    		str = textArea.getText() + " - "+ str;
	    	textArea.setText(str);
	    	
	    	
	    	try {
				image = ImageIO.read(NewPartition.class.getResource("../img/"+noteImg));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	
	    	labelTest = new JLabel(new ImageIcon(image));
	    	labelTest.setSize(100, 100);
	    	
	    	
	    	if(i%2==0) {
	    		labelTest.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    	labelTest.setBackground(Color.BLACK);
		    	labelTest.setOpaque(true);
	    	}else {
	    		labelTest.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    	labelTest.setBackground(Color.BLUE);
		    	labelTest.setOpaque(true);
	    	}
	    	
	    	if(i >= 10) {
	    		l++;
//	    		JOptionPane.showMessageDialog(tfName, "i < 5, i="+i);
//	    		JOptionPane.showMessageDialog(tfName, "i="+i+", gridnote="+gridNote.getRows());
//	    		gridNote.setColumns(0);
	    		gridNote.setRows(l);
	    		i = 0;
	    		gridNote.setColumns(i);
	    	}else {
	    		
//	    		gridNote.setColumns(i);
//	    		gridNote.setRows(2);
//	    		JOptionPane.showMessageDialog(tfName, "i > 5, i="+i);
	    	}
	    	panel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		    panel2.applyComponentOrientation( ComponentOrientation.LEFT_TO_RIGHT);
	    	panel2.setLayout(gridNote);
	    	
	    	panel2.add(labelTest);

	    	i++;
	    	
	    	
//	    	if(noteImg.equals("Re.jpg")) {
//	    		labelTest.setLocation(150, 150);
//	    	}
//	    	else
//	    	{
//	    		labelTest.setLocation(10, 10);
//	    	}
	    	
	    	
//	    	panel2.add(new JButton("Button 1"));
//	    	panel2.add(new JButton("Button 2"));
//	    	panel2.add(new JButton("Button 3"));
//	    	panel2.add(new JButton("Long-Named Button 4"));
//	    	panel2.add(new JButton("5"));
	    	
//	    	panel2.add(labelTest);
            panel2.repaint();
            panel2.validate();
	   }
	 }
	
	public void actionPerformed(ActionEvent click)  {

		Object source = click.getSource();
    
		JOptionPane.showMessageDialog(tfName, "tetertert");
    }
	
	private void setContentPane(JPanel pan) {
		// TODO Auto-generated method stub
		
	}
	
	public void printDoc() {
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
				panel2.paint(g2);
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
