import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fond implements ItemListener {
	private	Fenetre fen;
	private JPanel panneau;
	public void itemStateChanged(ItemEvent evenement){
		boolean c=fen.bCyan.isSelected();
		boolean m=fen.bMagenta.isSelected();
		boolean j=fen.bJaune.isSelected();

	 	if (c){//On doit passer par des imbrecation de if les && ne marche pas
	 		panneau.setBackground(Color.CYAN);
	 		if (m){//on ne peu pas clicker sur 2 checkbox en meme temps
          	panneau.setBackground(Color.BLUE);
         		if (j) 
	 			panneau.setBackground(Color.BLACK);	 		
	 		}else if (j) 
	 			panneau.setBackground(Color.GREEN);
	 		
	 	}else if(m){
	 		panneau.setBackground(Color.MAGENTA);
	 		if(j)
	 			panneau.setBackground(Color.RED);
	 		
	 	}else if(j)
	 		panneau.setBackground(Color.YELLOW);
	 	else
	 		panneau.setBackground(Color.WHITE);
	 	
	 	System.out.println(c);
	 	System.out.println(m);
	 	System.out.println(j);

	 }
	 public Fond(JPanel pan,Fenetre f){
	 	this.panneau=pan;
	 	this.fen=f;
	 }
}