package xadrez;

import cam_tabuleiro.Tabuleiro;

public class Torre extends PecaDeXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		// identificador da pe�a q ser� apresentado no tabuleiro
		return "T";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		
		return null;
	}
}
