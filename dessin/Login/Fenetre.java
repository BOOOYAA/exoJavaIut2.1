import javax.swing.*;
import java.awt.*;

class Fenetre {
	public static void main(String[] args){
		JFrame fen = new JFrame("Connectez-vous !");
		//fen.setLayout(null);
		Dimension dim = new Dimension(300,220);
		Brushlogin img = new Brushlogin();
		JTextField tfU = new JTextField();//Textfield du nom de compte
		JPasswordField tfM = new JPasswordField();//Textfield avec camouflage 
		JPanel pan = new JPanel();

		tfU.setLocation(99,90);
		tfU.setSize(170,30);
		tfM.setLocation(99,130);
		tfM.setSize(170,30);
		
		fen.setMinimumSize(dim);
		fen.setPreferredSize(dim);
    	fen.setLocation(0,0);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	fen.add(tfU);
    	fen.add(tfM);
    	fen.add(img);
    	fen.setVisible(true);

	}
}