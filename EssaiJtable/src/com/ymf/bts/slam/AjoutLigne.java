/**
 * 
 */
package com.ymf.bts.slam;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author yfontenoy
 *
 */
public class AjoutLigne extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AjoutLigne() {
		super("Ajouter une Ligne");
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Ajout d'une ligne dans la table");
    	JFrameScrollModele.datas.add(new Personne("Megan", "Sami", "05-", false, Section.RIEN));

	}


}
