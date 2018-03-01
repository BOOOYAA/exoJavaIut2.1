/*Crée une fenetre qui affiche du gris utilise la classe gris qui herite de la class Color*/
import javax.swing.*;
import java.awt.*;

public class Nuance {
	
	public static void main(String[] args) {
		if(args.length<1){
			System.out.println("entrez un valeur !");
					}
		int x =Integer.parseInt(args[0]);
		JFrame fen = new JFrame("Nuance !");
		fen.setSize(400,400);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gris 	g 	= new Gris(x);
		JPanel pan 	= new JPanel();
		pan.setBackground(g);
		fen.add(pan);
		fen.setVisible(true);
	}
}