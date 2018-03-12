
import javax.swing.*;
import java.awt.*;
/*!!!!!On doit redimmenssioner la page pour afficher le degrader!!!!!! Parce que c'est pas opti mais bon ça fonctionne */
class Fenetre {
	public static void main(String[] args){
		JFrame fen = new JFrame("Question4");
		GridLayout gest = new GridLayout(1,255);
    	fen.setLayout(gest);
		fen.setSize(200,200);
    	fen.setLocation(0,0);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i=0; i<=255; i++) {
			fen.add(new Degrade(i),BorderLayout.CENTER);
		}
    	fen.setVisible(true);
	}	
}