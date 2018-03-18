import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fenetre {
	public static void main(String[] args){
		JFrame fen = new JFrame("Le Fond de ...");

		JPanel pan = new JPanel();
		Fond observateur =new Fond(pan);
		Dimension dim = new Dimension(300,220);
		JRadioButton bCyan = new JRadioButton("Cyan");
		JRadioButton bMagenta = new JRadioButton("Magenta");
		JRadioButton bJaune = new JRadioButton("Jaune");
		ButtonGroup bg = new ButtonGroup();
		bg.add(bCyan);
		bg.add(bMagenta);//Comme en html on crée un groupe,
		bg.add(bJaune);//pour qu'il n'y est que 1 but de cocher a la fois 

		pan.add(bCyan);//Impossible d'ajouté le bg au panel
		pan.add(bMagenta);//On doit donc les ajouter normalement 
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