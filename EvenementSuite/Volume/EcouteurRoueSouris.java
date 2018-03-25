import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EcouteurRoueSouris implements MouseWheelListener {
	private Fenetre fenetre;
	public EcouteurRoueSouris(Fenetre fen){
		super();
		this.fenetre=fen;
	}

	public void mouseWheelMoved(MouseWheelEvent evenement){
		this.fenetre.lePont(evenement.getWheelRotation());
		System.out.println(evenement.getWheelRotation());
	}
}