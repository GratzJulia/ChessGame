package xadrez;

import cam_tabuleiro.Tabuleiro;

public class Queen extends PecaDeXadrez {

	public Queen(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		// identificador da pe�a q ser� apresentado no tabuleiro
		return "Q";
	}
}
