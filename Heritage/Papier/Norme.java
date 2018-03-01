import java.awt.print.Paper;

class Norme extends Paper {
	
	private static double toMilimetre(double x){//Besoins de pouce !
		return 25.4/72*x;
	}
	private static double toInch(double x){//Besoin milimetre
		return 0.0393701*x;
	}
	public Norme(){/*constructeur de papier A4*/
		super();
		this.setSize(this.toInch(210.0),this.toInch(290.7));
	}
	@Override
	public double getHeight(){
		return toMilimetre(super.getHeight());
	}
	//public getImageableHeight(){}
	//public getImageableWidth(){}
	//public getWidth(){}
	
}