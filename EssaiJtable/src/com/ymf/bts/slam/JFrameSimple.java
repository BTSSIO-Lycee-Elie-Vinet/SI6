/**
 * 
 */
package com.ymf.bts.slam;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JTable;

/**
 * @author yfontenoy
 *
 */
public class JFrameSimple extends JFrame {

	public JFrameSimple() throws HeadlessException {
		super();
		setTitle("JTable simple dans un JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"GODET", "Remi", "06-00", true, Section.SLAM},
                {"BERNARD", "Dimitri", "07-0", true, Section.SISR},
                {"XAVIER", "Charles", "0X-55", false, Section.RIEN}
        };
 
        String[] entetes = {"Prénom", "Nom", "Téléphone", "Terrien", "Section"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        getContentPane().add(tableau, BorderLayout.CENTER);
 
        pack();
	}

}
