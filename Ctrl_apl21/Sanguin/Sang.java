//je pense pas que ce qoit la rep attendu 
class Sang  {
	int type;


	public Sang(int x){

		this.type = x;
	}
	public String toString(){
		if (this.type == 65 || this.type == 97 ) {
			return "A";
		}else if (this.type == 66 || this.type == 98 ) {
			return "B";
		}else if (this.type == 79 || this.type == 111 ) {
			return "O";
		}else{
			return "AB";
		}/* Je fais le choix que tout autre chose envoyer au constructeur autre que a,b,o soit du type AB */
	}
	public String peutRecevoir(){
		if (this.type == 65 || this.type == 97 ) {
			return ("Le groupe O peut être donneur !");
		}else if (this.type == 66 || this.type == 98 ) {
			return ("Le groupe O peut être donneur !");
		}else if (this.type == 79 || this.type == 111 ) {
			return ("Aucun autre groupe peut être donneur !");
		}else{
			return ("Tout les autres groupe peuvent être donneur !");
		}
	}
}