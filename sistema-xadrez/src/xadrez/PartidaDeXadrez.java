package xadrez;

import cam_tabuleiro.Posicao;
import cam_tabuleiro.Tabuleiro;;

public class PartidaDeXadrez {
	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		iniciarPartida();
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
	
	public void iniciarPartida() {
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(0, 0));
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(0, 7));
		tabuleiro.colocaPeca(new King(tabuleiro, Cor.PRETO), new Posicao(0, 4));
		tabuleiro.colocaPeca(new Queen(tabuleiro, Cor.PRETO), new Posicao(0, 3));
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.PRETO), new Posicao(0, 1));
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.PRETO), new Posicao(0, 6));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.PRETO), new Posicao(0, 2));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.PRETO), new Posicao(0, 5));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,0));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,1));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,2));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,3));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,4));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,5));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,6));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new Posicao(1,7));
		
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,7));		
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,6));		
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,5));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,4));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,3));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,2));	
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,1));
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new Posicao(6,0));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.BRANCO), new Posicao(7, 5));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.BRANCO), new Posicao(7, 2));
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.BRANCO), new Posicao(7, 6));
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.BRANCO), new Posicao(7, 1));
		tabuleiro.colocaPeca(new Queen(tabuleiro, Cor.BRANCO), new Posicao(7, 3));
		tabuleiro.colocaPeca(new King(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7, 0));
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7, 7));
	}
}
