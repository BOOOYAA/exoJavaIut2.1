import javax.swing.*;
import java.awt.*;

public class Try {
		public static int hexToDec(String k,boolean rang){
			int x=0;
		switch (k) {
			case "0":break;
			case "1":x=1;break;
			case "2":x=2;break;
			case "3":x=3;break;
			case "4":x=4;break;
			case "5":x=5;break;
			case "6":x=6;break;
			case "7":x=7;break;
			case "8":x=8;break;
			case "9":x=9;break;
			case "a":x=10;break;
			case "b":x=11;break;
			case "c":x=12;break;
			case "d":x=13;break;
			case "e":x=14;break;
			case "f":x=15;break;
		}
		if (rang) {
			return x*16;
		}else{
			return x;
		}
	}
	public static void main(String[] args){
		JFrame fen = new JFrame("trrre");
		FlowLayout gestionnaire = new FlowLayout(FlowLayout.CENTER);
		fen.setLayout(gestionnaire);
		Dimension dimension = new Dimension(105,105);
		fen.setMinimumSize(dimension);
		fen.pack();
    	fen.setLocation(100,200);
    	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	for(int i=0;i<args.length;i++){
    		String tmp=args[i].substring(1,2);
    		String tmp1=args[i].substring(2,3);
    		int a=hexToDec(tmp,true)+hexToDec(tmp1,false);
    		String tmp2=args[i].substring(3,4);
    		String tmp3=args[i].substring(4,5);
    		int b=hexToDec(tmp2,true)+hexToDec(tmp3,false);
    		String tmp4=args[i].substring(5,6);
    		String tmp5=args[i].substring(6,7);
    		int c=hexToDec(tmp4,true)+hexToDec(tmp5,false);
			fen.add(new Nuancier(a,b,c));
    		
	}

    	fen.setVisible(true);
	}	
}