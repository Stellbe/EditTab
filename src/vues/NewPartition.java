package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class NewPartition extends JPanel {
	
	private JTextField tfNotes, tfName;
	private JButton bDo, bRe, bMi, bFa, bSo, bLa, bTi, bDo1, bRe1,
					bMi1, bFa1, bSo1, bLa1, bTi1, bDo2, btSave, btClear;
	
	JPanel panel1, panel2;
	
	private JLabel labelTest;
	private BufferedImage image;
	private GridLayout gridNote;
	int i = 0;
	int l = 1;
	
	public NewPartition() {
		setBackground(Color.ORANGE);
		
		panel1 = new JPanel();
			tfName = new JTextField();
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

        bDo2.setText("bDo2");
        bDo2.addActionListener(new ChiffreListener());

        btSave.setText("btSave");

        bLa1.setText("bLa1");
        bLa1.addActionListener(new ChiffreListener());

        bTi1.setText("bTi1");
        bTi1.addActionListener(new ChiffreListener());

        bFa1.setText("bFa1");
        bFa1.addActionListener(new ChiffreListener());

        bSo1.setText("bSo1");
        bSo1.addActionListener(new ChiffreListener());

        bRe1.setText("bRe1");
        bRe1.addActionListener(new ChiffreListener());

        bMi1.setText("bMi1");
        bMi1.addActionListener(new ChiffreListener());

        bRe.setText("bRe");
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

        bDo1.setText("bDo1");
        bDo1.addActionListener(new ChiffreListener());
        
        bSo.setText("bSo");
        bSo.addActionListener(new ChiffreListener());
        
        bFa.setText("bFa");
        bFa.addActionListener(new ChiffreListener());
        
        bMi.setText("bMi");
        bMi.addActionListener(new ChiffreListener());
        
        bDo.setText("bDo");
        bDo.addActionListener(new ChiffreListener());
        
        bTi.setText("bTi");
        bTi.addActionListener(new ChiffreListener());
        
        bLa.setText("bLa");
        bLa.addActionListener(new ChiffreListener());
        
        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(bLa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bTi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRe1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMi1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(bFa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btClear)
                                .addGap(18, 18, 18)
                                .addComponent(btSave))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(bLa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bTi1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDo2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfNotes, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(bRe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bFa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRe1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMi1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTi1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDo2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear)
                    .addComponent(btSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 469, Short.MAX_VALUE))
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
	}

	class ChiffreListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	    	
	    	
	    	String str = ((JButton)e.getSource()).getText();
	    	str = str.substring(1);
	    	
	    	String noteImg = new String();
	    	noteImg = str+".jpg";

	    	if(!(tfNotes.getText().length() == 0))
	    		str = tfNotes.getText() + " - "+ str;
	    	tfNotes.setText(str);
	    	
	    	
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
