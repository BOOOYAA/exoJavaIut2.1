public class grille {

	public static void main(String[] args){
		if (args.length !=1) {
			System.err.println("<Taille de grille>");
			System.exit(1);
		}
		
		int a=0;
		a = Integer.parseInt(args[0]);
			if (a ==0) {
			System.out.println("Grosse grille !");
			System.exit(0);
		}
		for (int j=0;j<a ;j++ ) {
			

			System.out.print("+-+");
			if(a>1){
				for (int i=0;i<(a-1);i++ ) {
					System.out.print("-+");
				}
			}
			System.out.print("\n");
			System.out.print("| |");
			if(a>1){
				for (int i=0;i<(a-1);i++ ) {
					System.out.print(" |");
				}

			}

			System.out.print("\n");
		}
		System.out.print("+-+");
		if(a>1){
			for (int i=0;i<(a-1);i++ ) {
				System.out.print("-+");
			}

		}
		System.out.print("\n");
		System.exit(0);
	}
}