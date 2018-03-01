import javax.swing.*;
import java.awt.*;

class Text{
	public static void main(String[] args){
		JFrame fenetre = new JFrame();
		Color gris = new Color(0,0,0);
		Color vert = new Color(0,200,0);
		Color noir = new Color(150,150,150);
		JTextArea textar1=new JTextArea();
		JTextField textar2=new JTextField();
		
		fenetre.setSize(500,500);
		fenetre.setLocation(200,300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textar1.setBackground(gris);
		textar2.setBackground(noir);
		textar1.setForeground(vert);
		textar2.setForeground(vert);
		
		fenetre.add(textar1);
		fenetre.add(textar2,BorderLayout.SOUTH);


		fenetre.setVisible(true);//!\ Rend la fenetre visible /!\

	}
}