import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main {
	public static void main(String[] args) {
		Fenetre f = new Fenetre("Attend !!!");
		Peinture s = new Peinture();
		Ecouteur observateur=new Ecouteur(f,s);
		f.addWindowListener(observateur);
		f.add(s);
		f.setVisible(true);
	}

}