import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fenetre {
	public static void main(String[] args){
		JFrame fen = new JFrame("Le Fond de ...");

		JPanel pan = new JPanel();
		Fond observateur =new Fond(pan);
		Dimension dim = new Dimension(300,220);
		JButton bCyan = new JButton("Cyan");
		JButton bMagenta = new JButton("Magenta");
		JButton bJaune = new JButton("Jaune");
		
	

		pan.add(bCyan);
		pan.add(bMagenta);
		pan.add(bJaune);
		fen.add(pan,BorderLayout.CENTER);
		bCyan.addActionListener(observateur);
		bMagenta.addActionListener(observateur);
		bJaune.addActionListener(observateur);
		fen.setMinimumSize(dim);
		fen.setPreferredSize(dim);
    	fen.setLocation(0,0);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    	fen.setVisible(true);

	}
}