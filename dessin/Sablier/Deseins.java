import javax.swing.*;
import java.awt.*;

class Deseins {
	public static void main(String[] args){
		JFrame fen = new JFrame("Damier diagonal");
		fen.setSize(500,500);
    	fen.setLocation(50,50);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	GridLayout gest = new GridLayout(5,5);
    	fen.setLayout(gest);
    	for(int i = 0;i<25;i++){
    		 new Dessin();
    		fen.add(new Dessin());
    	}
    	
    	fen.setVisible(true);
	}	
}