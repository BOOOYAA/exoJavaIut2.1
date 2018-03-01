public class progression{
	public static void main(String[] args) {
		
		Compteur cmp = new Compteur();
		int i;
		for (i=0;i<4 ;i++ ) {
			cmp.plusUn();
		}
		for (i=5;i<10 ;i++ ) {
			cmp.plusUn();
			System.out.println(i+":"+cmp);
		}
		
	}
}