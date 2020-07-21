package xadrez;

import cam_tabuleiro.Tabuleiro;

public class Cavalo extends PecaDeXadrez {

	public Cavalo(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		// identificador da pe�a q ser� apresentado no tabuleiro
		return "C";
	}
}
