package ymf.bts.ppe2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Woody1Fenetre extends JFrame{
	public Woody1Fenetre(){
	    this.setTitle("Ma première fenêtre Woody");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	   
	    

/*	        //Instanciation d'un objet JPanel
	        JPanel pan = new JPanel();
	        //Définition de sa couleur de fond
	        pan.setBackground(Color.ORANGE);        
	        //On prévient notre JFrame que notre JPanel sera son content pane
	        this.setContentPane(pan);
*/	        
	    	JPanel pan = new JPanel();
	    	
	    	pan.setLayout(new GridLayout(10, 10));
	        for (int i = 0; i < 100; i++) {
	        	pan.add(new JButton(""));
			}
	        this.setLayout(new BorderLayout());
	        this.getContentPane().add(pan,BorderLayout.CENTER);
	        this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
	        
	        this.setVisible(true);
	    this.setVisible(true);
	  }
}
