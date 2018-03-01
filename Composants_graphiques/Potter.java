import javax.swing.*;
import java.awt.*;
public class Potter{
	public static void main(String[] args) {
		JFrame fen =new JFrame();
		fen.setSize(500, 500);
    	fen.setLocation(100, 100);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	JRadioButton Gryffondor = new JRadioButton("Gryffondor");
    	JRadioButton Serdaigle = new JRadioButton("Serdaigle");
    	JRadioButton Serpentard = new JRadioButton("Serpentard");
    	ButtonGroup poudlar = new ButtonGroup();

    	poudlar.add(Gryffondor);
    	poudlar.add(Serdaigle);
    	poudlar.add(Serpentard);

    	fen.add(Gryffondor, BorderLayout.NORTH);
    	fen.add(Serpentard, BorderLayout.SOUTH);
    	fen.add(Serdaigle, BorderLayout.WEST);
    	fen.setVisible(true);
	}
}