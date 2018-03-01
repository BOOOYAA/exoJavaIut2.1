public class Date {
  	// attribut
	private int jour;
	private int mois;
	private int annee;
	//constucteur sans arguments
	public Date(){ 
		this.jour=3;
		this.mois=2;
		this.annee=2018;
	}
	//constucteur avec arguments
	public Date(int jour,int mois,int annee){ 
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
  	// méthode
	public String afficher() {
		if(this.jour<10 && this.mois<10){
			return ("0"+this.jour+"-"+0+this.mois+"-"+this.annee);
		}else if (this.jour<10) {
			return ("0"+this.jour+"-"+this.mois+"-"+this.annee);
		}else if (this.mois<10) {
			return (this.jour+"-"+0+this.mois+"-"+this.annee);
		}else{
			return (this.jour+"-"+this.mois+"-"+this.annee);
		}
	}
	//autre méthode
	public String Lendemain(){
		System.out.println("Demain nous serront:");
		if(this.jour==30 && (this.mois%2)==0 && this.mois!=8){
			return ("01"+"-"+(this.mois+1)+"-"+this.annee);
		}if (this.jour==31 && (this.mois%2)!=0 || this.mois==8) {
			return ("01"+"-"+(this.mois+1)+"-"+this.annee);
		}if (this.jour==31 && this.mois==12) {
			System.out.println("Bonne Annee !!!!!!!");
			return ("01"+"-"+"01"+"-"+(this.annee+1));
		}if(this.jour==28 || this.jour==29 && this.mois==2){
			return ("01"+"-"+(this.mois+1)+"-"+this.annee);
		}else{
			return ((this.jour+1)+"-"+this.mois+"-"+this.annee);
		}
	}
	public String compare(Date b){
		int difj=0,difm=0,difa=0;

		difj=this.jour-b.jour;
		difm=this.mois-b.mois;
		difa=this.annee-b.annee;
		
		if(difj < 0 ){
			difj= -difj;
		}if(difm < 0){

			difm= -difm;
		}if(difa < 0){
			difa= -difa;
		}
		
		return("Il y a "+difj+" jour, "+difm+" mois et "+difa+" annees entre le ");
	}
	public String jours(Date b){
		int difj=0,difm=0,difa=0;

		difj=this.jour-b.jour;
		difm=this.mois-b.mois;
		difa=this.annee-b.annee;
		
		if(difj < 0 ){
			difj= -difj;
		}if(difm < 0){

			difm= -difm;
		}if(difa < 0){
			difa= -difa;
		}
		difj=difj+(difm*30)+(difa*365);
		return("Il y a "+difj+" jour");	
	}
}