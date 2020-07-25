package xadrez;

import cam_tabuleiro.Tabuleiro;

public class King extends PecaDeXadrez {

	public King(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		// identificador da peça q será apresentado no tabuleiro
		return "K";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		
		return null;
	}
}
