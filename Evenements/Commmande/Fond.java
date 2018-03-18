import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fond implements ActionListener {
	private	Fenetre fen;
	private JPanel panneau;

	public Fond(JPanel pan,Fenetre f){
	 	this.panneau=pan;
	 	this.fen=f;
	}
	public void actionPerformed(ActionEvent evenement){
		String txt=evenement.getActionCommand();
		fen.jtf.setText("");//pour "refresh" le textfield
	 	if (txt.equals("cyan")){//.equals() set de == pour des objet comme des stings 
	 		panneau.setBackground(Color.CYAN);
	 	}else if (txt.equals("jaune")){
	 			panneau.setBackground(Color.YELLOW);
	 	}else if(txt.equals("magenta")){
	 		panneau.setBackground(Color.MAGENTA);
	 	}else if (txt.equals("nimp")){//petit truc qui sert a rien easter eggs quoi 
          	panneau.add(new JLabel("T'ecoute pas quand on te parle ?"),BorderLayout.SOUTH);	
	 	}
	}
}