package cam_tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	// construtor:
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
