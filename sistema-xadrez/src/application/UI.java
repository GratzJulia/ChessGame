package application;

import xadrez.PecaDeXadrez;

public class UI {
	public static void printTab(PecaDeXadrez[][] pecas) {
		
		for(int l=0; l< pecas.length; l++) {
			System.out.print(8-l + " ");
			for(int c=0; c< pecas.length; c++) {
				printPeca(pecas[l][c]);
			}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}
	
	public static void printPeca(PecaDeXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
	
	
}
