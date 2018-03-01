import javax.swing.*;
import java.awt.*;
public class Potter4{
	public static void main(String[] args) {
		JFrame fen =new JFrame("euh..");
        GridLayout grid = new GridLayout(4,1);
		fen.setSize(40, 90);
    	fen.setLocation(100, 100);
        fen.setMinimumSize(40,80);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setLayout(grid);


    	JRadioButton Gryffondor = new JRadioButton("Gryffondor");
    	JRadioButton Serdaigle = new JRadioButton("Serdaigle");
    	JRadioButton Serpentard = new JRadioButton("Serpentard");
        JRadioButton Poufsouffle = new JRadioButton("Poufsouffle");
    	ButtonGroup poudlar = new ButtonGroup();

    	poudlar.add(Gryffondor);
    	poudlar.add(Serdaigle);
    	poudlar.add(Serpentard);
        poudlar.add(Poufsouffle);

    	fen.add(Gryffondor);
    	fen.add(Serpentard);
    	fen.add(Serdaigle);
        fen.add(Poufsouffle);
    	fen.setVisible(true);
	}
}