/*covertit en hexa les valeurs saisi en octal sur la ligne de commande*/
public class Into{
	public static void main(String[] args) {
		if (args.length <1) {
			System.out.println("Besoin de valeurs octales !");
		}
	
		int[] tab =new int [args.length] ;
		for (int i=0;i<args.length ;i++ ) {
			tab[i]=	Integer.parseInt(args[i],8);
			System.out.println(Integer.toHexString(tab[i]));
			/*pourquoi 19 de fonctionne pas ???????? parce que ça exite pas fdp */
		}
	}
}