package xadrez;

import cam_tabuleiro.Peca;
import cam_tabuleiro.Posicao;
import cam_tabuleiro.Tabuleiro;

public abstract class PecaDeXadrez extends Peca {

	private Cor cor;

	public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	protected boolean temOponente(Posicao pos) {
		//verifica se tem oponente na posicao:
		PecaDeXadrez oponente = (PecaDeXadrez) getTabuleiro().peca(pos);
		return oponente != null && oponente.getCor() != this.cor;
	}
}
