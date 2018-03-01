import java.awt.*;
import javax.swing.*;

class Dessin extends JComponent {
	@Override
	public void paintComponent(Graphics pinceau){

		Graphics sndpinceau = pinceau.create();
		if(this.isOpaque()){
			sndpinceau.setColor(Color.CYAN);
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());/*methob getWigth/Height correspond à
      		 la largeur et hauteur de "this" element*/
		}
			int[] tabx ={0, this.getWidth(),0,this.getHeight()};//fill ou draw Polygon a besoin de tab car^pls coordonée
			int[] taby ={0, this.getWidth(),this.getHeight(),0};

			sndpinceau.setColor(Color.GREEN);
      		sndpinceau.fillPolygon(tabx,taby,4);//4 corespond au nombre de pts dans les tableaux
			}
}