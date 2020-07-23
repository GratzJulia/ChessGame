package xadrez;

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
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.PRETO), new TabPosicao('A', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.PRETO), new TabPosicao('H', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new King(tabuleiro, Cor.PRETO), new TabPosicao('E', 8).converteParaMatriz());;
		tabuleiro.colocaPeca(new Queen(tabuleiro, Cor.PRETO), new TabPosicao('D', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.PRETO), new TabPosicao('B', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.PRETO), new TabPosicao('G', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.PRETO), new TabPosicao('C', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.PRETO), new TabPosicao('F', 8).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('A', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('B', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('C', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('D', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('E', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('F', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('G', 7).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.PRETO), new TabPosicao('H', 7).converteParaMatriz());

		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('A', 2).converteParaMatriz());		
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('B', 2).converteParaMatriz());		
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('C', 2).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('D', 2).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('E', 2).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('F', 2).converteParaMatriz());	
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('G', 2).converteParaMatriz());
		tabuleiro.colocaPeca(new Peao(tabuleiro,  Cor.BRANCO), new TabPosicao('H', 2).converteParaMatriz());
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.BRANCO), new TabPosicao('C', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.BRANCO), new TabPosicao('F', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.BRANCO), new TabPosicao('G', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new Bispo(tabuleiro, Cor.BRANCO), new TabPosicao('B', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new Queen(tabuleiro, Cor.BRANCO), new TabPosicao('D', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new King(tabuleiro, Cor.BRANCO),  new TabPosicao('E', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.BRANCO), new TabPosicao('A', 1).converteParaMatriz());
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.BRANCO), new TabPosicao('H', 1).converteParaMatriz());
	}
}
