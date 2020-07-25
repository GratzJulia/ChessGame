package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import xadrez.PecaDeXadrez;
import xadrez.TabPosicao;

public class UI {
	public static void limpaTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void printTab(PecaDeXadrez[][] pecas) {
		
		for(int l=0; l< pecas.length; l++) {
			System.out.print(8-l + "|  ");
			for(int c=0; c< pecas.length; c++) {
				printPeca(pecas[l][c]);
			}
			System.out.println();
		}
		System.out.println("    _ _ _ _ _ _ _ _");
		System.out.println("    A B C D E F G H");
	}
	
	public static void printPeca(PecaDeXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
	
	public static TabPosicao readTabPosicao(Scanner scan) {
		String pos = scan.nextLine();
		
		try {
			char c = pos.charAt(0);
			int i = Integer.parseInt(pos.substring(1));
			
			return new TabPosicao(c,i);
		} catch (RuntimeException e) {
			throw new InputMismatchException("Erro na leitura da posição do tabuleiro!");
		}
	}
}
