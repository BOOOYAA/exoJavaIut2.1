import javax.swing.*;
import java.awt.*;
class Main {
	public static void main(String[] args){
		Fenetre fenetre = new Fenetre("Ecris pas nimp !");
		Fond observateur = new Fond(fenetre.pan,fenetre);
		fenetre.jtf.addActionListener(observateur);

		fenetre.setVisible(true);

	} 
}