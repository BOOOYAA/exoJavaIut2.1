/*si il n'y a aucun argument de saisi l'a date sera 31/01/2018 soit la date de conception*/
public class Deta{
	public static void main(String[] args){
		
		int j,m,a;
		j=Integer.parseInt(args[0]);
		m=Integer.parseInt(args[1]);
		a=Integer.parseInt(args[2]);
		
		Date d = new Date(j,m,a);
		Date e = new Date(25,1,2018);

		//System.out.println(d.compare(e)+d.afficher()+" et le "+ e.afficher());
		System.out.println(d.jours(e));
	}
}