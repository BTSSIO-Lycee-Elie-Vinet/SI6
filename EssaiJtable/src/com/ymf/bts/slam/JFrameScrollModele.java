/**
 * 
 */
package com.ymf.bts.slam;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author yfontenoy
 *
 */
public class JFrameScrollModele extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6639865556234000060L;
	public static MonModele datas = new MonModele();
	
	public JFrameScrollModele() throws HeadlessException {
		super();
		setTitle("JFrameScrollModele  dans un JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JTable tableau = new JTable(datas);
 
        //getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
        
        JPanel boutons = new JPanel();
        JButton toto = new JButton("Toto");
        toto.setEnabled(true);
        //toto.addActionListener( new AddAction() );
        
        boutons.add(new JButton(new AjoutLigne()));
        boutons.add( toto );
 
        getContentPane().add(boutons, BorderLayout.SOUTH);
        
        
        pack();
	}
	
}
