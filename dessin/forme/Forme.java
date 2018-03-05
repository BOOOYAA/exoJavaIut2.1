import javax.swing.JComponent;
import java.awt.*;
import javax.swing.ImageIcon;

class Forme extends JComponent {
	@Override
	public void paintComponent(Graphics pinceau){
		Color bad = new Color(100,40,255);
		Color purple = new Color(255,0,255);
		Font corps = new Font("arial",Font.BOLD,24);//crée un font arial en gras de 24 pixel
		ImageIcon icon = new ImageIcon("./cercles.jpg");//charge l'image dans l'icone afin de l'afficher
		Image img = icon.getImage();// crée un objet  image 
		Graphics sndpinceau = pinceau.create();
		if(this.isOpaque()){
			// on repeint toute la surface avec la couleur de fond
			secondPinceau.setColor(this.getBackground());
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
	sndpinceau.setColor(bad);
    sndpinceau.drawRect(50,50,250,200);
    sndpinceau.setColor(Color.GREEN);
    sndpinceau.drawArc(60,60,25,25,0,360);
    sndpinceau.setColor(purple);
    sndpinceau.setFont(corps);
    sndpinceau.drawString(">0<",64,76);
    sndpinceau.drawImage(img,0,0,null);

	}
}