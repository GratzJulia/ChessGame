package xadrez;

import cam_tabuleiro.Tabuleiro;

public class Cavalo extends PecaDeXadrez {

	public Cavalo(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		// identificador da peça q será apresentado no tabuleiro
		return "C";
	}
}
