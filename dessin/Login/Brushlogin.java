import java.awt.*;
import javax.swing.*;

class Brushlogin extends JComponent {
	private Image logi;

	/*public Brushlogin(){
		super();
		logi =  Toolkit.getDefaultToolkit().getImage("login.jpg");
	}
	@Override
	public void paintComponent(Graphics pinceau){
		Graphics sndPinceau = pinceau.create();
		if(this.isOpaque()){
		    sndPinceau.setColor(this.getBackground());
      		sndPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
			sndPinceau.drawImage(logi, 1, 1, null);
	}*/	
	
		@Override
	public void paintComponent(Graphics pinceau){
		ImageIcon icon = new ImageIcon("./login.jpg");//charge l'image dans l'icone afin de l'afficher
		Image img = icon.getImage();// crée un objet  image 
		Graphics sndpinceau = pinceau.create();
		if(this.isOpaque()){

      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}

    sndpinceau.drawImage(img,0,0,null);

	}
}