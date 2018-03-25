import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main {
	public static void main(String[] args) {		
		Fenetre fenetre = new Fenetre("Playlist");
		EcouteurSouris es = new EcouteurSouris(fenetre);
		for(int i=0;i<10;i++)
			fenetre.envoie(i).addMouseListener(es);
		fenetre.setVisible(true);
	}
}