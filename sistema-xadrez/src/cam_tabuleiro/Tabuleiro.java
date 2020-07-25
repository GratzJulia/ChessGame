package cam_tabuleiro;

public class Tabuleiro {
	private int linha;
	private int coluna;
	private Peca[][] pecas;
	
	// construtor:
	public Tabuleiro(int linha, int coluna) {
		super();
		this.linha = 8;
		this.coluna = 8;
		this.pecas = new Peca[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public Peca peca(int linha, int col) {
		if(!posicaoExiste(linha, col)) {
			throw new TabException("Posição não encontrada no tabuleiro.");
		}
		return pecas[linha][col];
	}
	
	public Peca peca(Posicao pos) {
		if(!posicaoExiste(pos)) {
			throw new TabException("Posição não encontrada no tabuleiro.");
		}
		return pecas[pos.getLinha()][pos.getColuna()];
	}
	
	public void colocaPeca(Peca peca, Posicao pos) {
		pecas[pos.getLinha()][pos.getColuna()] = peca;
		peca.posicao = pos;
	}
	
	public Peca removePeca(Posicao pos) {
		if(!posicaoExiste(pos)) {
			throw new TabException("Posição não encontrada no tabuleiro.");
		}
		if(peca(pos) == null) {
			return null;
		}
		//retira referencia do tabuleiro na peca:
		Peca removida = peca(pos);
		removida.posicao = null;
		//retira referencia da peca no tabuleiro:
		pecas[pos.getLinha()][pos.getColuna()] = null;
		
		return removida;
	}
	
	public boolean posicaoExiste(int linha, int col) {
		//posicao existe se esta dentro do tabuleiro!
		return linha >= 0 && linha < 8 && col >= 0 && col < 8;
	}
	
	public boolean posicaoExiste(Posicao pos) {
		//posicao existe se esta dentro do tabuleiro!
		return posicaoExiste(pos.getLinha(), pos.getColuna());
	}
	
	public boolean temUmaPeca(Posicao pos) {
		if(!posicaoExiste(pos)) {
			throw new TabException("Posição não encontrada no tabuleiro.");
		}
		return peca(pos) != null;
	}
}
