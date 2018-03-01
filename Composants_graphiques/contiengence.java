import javax.swing.*;
import java.awt.*;

class contiengence {
	public static void main(String[] args){
		JFrame fen = new JFrame("TRUCCCCC");
		fen.setSize(500, 500);
    	fen.setLocation(100, 100);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JTextArea tex = new JTextArea();
    	JTextField tf = new JTextField();
    	JScrollPane pan = new JScrollPane(tex);
    	
    	Color vert = new Color(0,200,0);
    	Color gris = new Color(150,150,150);
    	Color noir = new Color(15,15,15);
    	Color autre = new Color(60,20,200);

    	pan.setVerticalScrollBarPolicy(pan.VERTICAL_SCROLLBAR_AS_NEEDED);
    	tex.setLineWrap(true);
    	tex.setForeground(vert);
    	tf.setForeground(autre);
    	tex.setBackground(noir);
    	tf.setBackground(gris);

    	fen.add(pan,BorderLayout.CENTER);
    	fen.add(tf,BorderLayout.SOUTH);
    	fen.setVisible(true);
	}
	
}