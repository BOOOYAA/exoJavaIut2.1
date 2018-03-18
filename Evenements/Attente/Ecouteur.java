import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ecouteur implements WindowListener {
	public void windowClosed(WindowEvent evenement){}         // après fermeture
	public void windowClosing(WindowEvent evenement){}        // avant fermeture
	public void windowDeiconified(WindowEvent evenement){}    // restauration
	public void windowIconified(WindowEvent evenement){}      // minimisation
	public void windowOpened(WindowEvent evenement){}         // après ouverture
	
	private Fenetre fenetre;
	private  Peinture art;	 
	public Ecouteur(Fenetre fen,Peinture x){
	 	this.fenetre=fen;
	 	this.art=x;
	 }
	public void windowActivated(WindowEvent evenement){
		art.etat_de(false);//envoit linformation au "peintre" que la fenetre est en 1 plan
		fenetre.repaint();
	}  // premier plan

	public void windowDeactivated(WindowEvent evenement){
			art.etat_de(true);//envoit linformation au "peintre" que la fenetre est en 2 plan
			fenetre.repaint();//apelle la metthode Paintcomponent avec les nouvel informations	
	 	}// arrière-plan
	public void getWindow(){}
	public void getOppositeWindow (){}

}
