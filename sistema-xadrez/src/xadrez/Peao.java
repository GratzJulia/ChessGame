package xadrez;

import cam_tabuleiro.Tabuleiro;

public class Peao extends PecaDeXadrez {

	public Peao(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "P";
	}
}
