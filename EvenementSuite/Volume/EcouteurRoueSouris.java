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
		if(evenement.getWheelRotation()<0)
			this.fenetre.lePont(-1);
		else
			this.fenetre.lePont(1);
		System.out.println(evenement.getWheelRotation());
	}
}