package xadrez;

import cam_tabuleiro.Tabuleiro;

public class Bispo extends PecaDeXadrez {

	public Bispo(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		// identificador da pe�a q ser� apresentado no tabuleiro
		return "B";
	}
}
