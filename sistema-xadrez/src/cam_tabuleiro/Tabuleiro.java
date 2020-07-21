package cam_tabuleiro;

public class Tabuleiro {
	private int linha;
	private int coluna;
	private Peca[][] pecas;
	
	// construtor:
	public Tabuleiro(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
		this.pecas = new Peca[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public Peca peca(int linha, int col) {
		return pecas[linha][col];
	}
	
	public Peca peca(Posicao pos) {
		return pecas[pos.getLinha()][pos.getColuna()];
	}
}
