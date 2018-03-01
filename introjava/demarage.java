/**
* Cette classe est une simple coquille pour recevoir la méthode principale
*
* @version 1.1 09 March 2014
* @author Luc Hernandez
*/
public class demarage {
 
  /**
  * Affiche &laquo;Bonjour !&raquo;
  *
  * @param args la liste des arguments de la ligne de commande (inutilisée ici)
  */
  public static void main(String[] args) {
  	byte a=5;//8bits
  	short b=6;//16bits
  	int c=-58;//32bits
  	long d=4;//64bits
  	boolean e=true;//8bits
  	char f='e';//16bits
  	float g=3.5f;//32bits
  	double h=5.0d;//64bits
    System.out.println(a);
    System.out.print(b+"  ");
    System.out.println(c);
    System.out.print(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
  }
}