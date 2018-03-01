/*prend des entier sur la ligne de commande pour en ressortir la somme*/
public class somme {

	public static void main(String[] args){
		int a=0,b=0;
		for (int i=0;i<args.length ;i++ ) {
			
			a = Integer.parseInt(args[i]);
			b=b+a;
		}
		System.out.println(b);
	}
}