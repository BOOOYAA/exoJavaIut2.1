import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Volume extends JComponent{
	private int a;
	private int r;
    private int g;
    private int b;

	public Volume(){
		super();
		this.a=(int)(Math.random() * 10);
        this.r=158;
        this.g=14;
        this.b=64;
	}

	@Override
	public void paintComponent(Graphics pinceau){
		Graphics sndpinceau = pinceau.create();
		
		if(this.isOpaque()){
			 // on repeint toute la surface avec la couleur de fond
      		sndpinceau.setColor(this.getBackground());
      		sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
        int nuance=20;
		sndpinceau.setColor(new Color(nuance,nuance,nuance));
      	sndpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());	

    	for (int i=0;i<10;i++) {
           /* this.r=(int)(Math.random() * 255);
            this.g=(int)(Math.random() * 255);
            this.b=(int)(Math.random() * 255);*/ //sensations garentit
    		if (i<=this.a)
    			sndpinceau.setColor(new Color(r,g,b));
    		else
    			sndpinceau.setColor(Color.WHITE);
    		
    		sndpinceau.fillArc(((this.getWidth()/10)*i)+8, this.getHeight()/4, this.getWidth()/10,this.getHeight()/2,0,360);	
    	}
    }
    public void alteration(int x){
        
    	if(x<0){
            if(a>=0)
    		  this.a--;
        }
        else{
            if(a<9)
                this.a++;
        }
    	   
           this.repaint();
           System.out.println("a :"+this.a);
    }	
}