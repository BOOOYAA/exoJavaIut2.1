import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	public static void main(String[] args) {
		Fenetre fen=new Fenetre("Volume");
		EcouteurRoueSouris ers = new EcouteurRoueSouris(fen);
		fen.addMouseWheelListener(ers);
		fen.setVisible(true);
	}
}