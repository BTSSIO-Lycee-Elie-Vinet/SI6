/**
 * 
 */
package com.ymf.bts.slam;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 * @author yfontenoy
 *
 */
public class MonModele extends AbstractTableModel {

	private ArrayList<Personne> _mesDatas;
	
	String[] entetes = {"Prénom", "Nom", "Téléphone", "Terrien", "Section"};

	public MonModele() {
		_mesDatas = new ArrayList<Personne>();
		_mesDatas.add( new Personne("GODET", "Remy","06-00", true, Section.SLAM) );
		_mesDatas.add( new Personne("BAUDRY", "Kevin","06-01", true, Section.SLAM) );
		_mesDatas.add( new Personne("BERNARD", "Dimitri", "07-0", true, Section.SISR) );
		_mesDatas.add( new Personne("XAVIER", "Charles", "0X-55", false, Section.RIEN) );
	}
	
	public void add(Personne p) {
		_mesDatas.add(p);
		fireTableDataChanged();
		
	}
	
    @Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return entetes[arg0];
	}


	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		return _mesDatas.size();
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		switch (arg1) {
		case 0:
			return _mesDatas.get(arg0).getNom();
		case 1:
			return _mesDatas.get(arg0).getPrenom();
		case 2:
			return _mesDatas.get(arg0).getTelephone();
		case 3:
			return _mesDatas.get(arg0).isTerrien();
		case 4:
			return _mesDatas.get(arg0).getSection();
		}
		return null;
		
	}

}
