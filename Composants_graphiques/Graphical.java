import javax.swing.*;
import java.awt.*;

class Graphical {
	public static void main(String[] args){
		JFrame fenetre = new JFrame();
		fenetre.setSize(300,300);
		fenetre.setLocation(200,300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton but1=new JButton("1");
		JButton but2=new JButton("2");
		JButton but3=new JButton("je trouve que l'ont devrait eventuelement trouver un truc a ecrire d'un facon plus simple");
		JButton but4=new JButton("4");
		JButton but5=new JButton("5");

		fenetre.add(but1,BorderLayout.WEST);
		fenetre.add(but2,BorderLayout.NORTH);
		fenetre.add(but3,BorderLayout.EAST);
		fenetre.add(but4,BorderLayout.SOUTH);
		fenetre.add(but5,BorderLayout.CENTER);
		fenetre.setVisible(true);//!\ Rend la fenetre visible /!\

	}
		
}