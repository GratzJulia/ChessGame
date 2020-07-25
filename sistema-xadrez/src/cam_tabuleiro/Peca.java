package cam_tabuleiro;

public abstract class Peca {
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
	
	public abstract boolean[][] movimentosPossiveis();
	
	public boolean podeMoverPara(Posicao pos) {
		//para saber se a peca pode ir para a posicao escolhida
		//faz conexao com a subclasse:
		return movimentosPossiveis()[pos.getLinha()][pos.getColuna()];
	}
	
	public boolean temMovimentosPossiveis() {
		boolean[][] mat = movimentosPossiveis();
		
		for(int l=0; l< mat.length; l++) {
			for(int c=0; c< mat.length; c++) {
				if(mat[l][c]) {
					return true;
				}
			}
			
		}
		return false;
	}
}
