import javax.swing.*;
import java.awt.*;
class Main {
	public static void main(String[] args){
		Fenetre fenetre = new Fenetre("check check check !");
		Fond observateur = new Fond(fenetre.pan,fenetre);
		fenetre.bCyan.addItemListener(observateur);
		fenetre.bMagenta.addItemListener(observateur);
		fenetre.bJaune.addItemListener(observateur);

		fenetre.setVisible(true);

	} 
}