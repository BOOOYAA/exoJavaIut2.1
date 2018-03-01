import javax.swing.*;
import java.awt.*;

class Formi {
	public static void main(String[] args){
		JFrame fen = new JFrame("Je m'apelle henri");
		fen.setSize(500,500);
    	fen.setLocation(50,50);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Forme paneaux= new Forme();
    	fen.add(paneaux);
    	fen.setVisible(true);
	}	
}