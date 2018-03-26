import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EcouteurSouris implements MouseListener {
	private Fenetre fenetre;
	private int compteur;
	public EcouteurSouris(Fenetre fen){
		super();
		this.fenetre=fen;
		this.compteur=0;
	}

public void mouseClicked(MouseEvent evenement){
	if (this.compteur ==0) {
	JLabel boutton =(JLabel)evenement.getSource();//getSource retourne un objet sachant que c'est un jlabel on le convertit 
		if(boutton.getBackground().equals(Color.WHITE))
			boutton.setBackground(new Color(200,200,200));
		else
			boutton.setBackground(Color.WHITE);
		this.compteur=1;
	}else{
		fenetre.cleaning();
		this.compteur=0;
	}

}          // un bouton cliqué
public void mouseEntered(MouseEvent evenement){
	JLabel boutton =(JLabel)evenement.getSource(); 
		if(!boutton.getBackground().equals(new Color(200,200,200))){//Verifie si il y a déja une couleur pour pouvoir changer
			boutton.setBackground(Color.CYAN);
		}
}          // debut du survol
public void mouseExited(MouseEvent evenement){
		JLabel boutton =(JLabel)evenement.getSource();
		if(!boutton.getBackground().equals(new Color(200,200,200))){
			boutton.setBackground(Color.WHITE);
		}
}           // fin du survol
public void mousePressed(MouseEvent evenement){}          // un bouton appuyé
public void mouseReleased(MouseEvent evenement){}         // un bouton relâché
}