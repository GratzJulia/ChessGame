package xadrez;

import cam_tabuleiro.Tabuleiro;;

public class PartidaDeXadrez {
	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}
	
	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] matriz = new PecaDeXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		
		for(int l=0; l< tabuleiro.getLinha(); l++) {
			for(int c=0; c< tabuleiro.getColuna(); c++) {
				matriz[l][c] = (PecaDeXadrez) tabuleiro.peca(l, c);
			}
		}
		
		return matriz;
	}
}
