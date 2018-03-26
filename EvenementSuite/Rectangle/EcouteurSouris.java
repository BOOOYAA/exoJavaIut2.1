import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EcouteurSouris implements MouseMotionListener {
	private Fenetre fenetre;
	private int posX;
    private int posY;
    private int largeur;
    private int longeur;
	public EcouteurSouris(Fenetre fen){
		super();
		this.fenetre=fen;
	}
	public void mouseDragged(MouseEvent evenement){

		System.out.println("X: "+evenement.getX());
		System.out.println("Y: "+evenement.getY());
		fenetre.ajoutRect(evenement.getX(),evenement.getY(),80,80);
	}          // mouvement appuyé
	public void mouseMoved(MouseEvent evenement){
		/*System.out.print("start X: "+evenement.getX());
		System.out.println("start Y: "+evenement.getY());	
*/
	}            // mouvement libre
		

}