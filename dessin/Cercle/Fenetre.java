import javax.swing.*;
import java.awt.*;

class Fenetre {
	public static void main(String[] args){
		JFrame fen = new JFrame("cercle");
		GridLayout gest = new GridLayout(5,5);
    	fen.setLayout(gest);
		fen.setSize(200,200);
    	fen.setLocation(0,0);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i=51; i<=255; i=i+51) {
			for (int j=51; j<=255; j=j+51) {
				fen.add(new Cercle(0,i,j));
			}
		}
    	fen.setVisible(true);
	}	
}