package xadrez;

import cam_tabuleiro.Posicao;

public class TabPosicao {
	private char coluna;
	private int linha;
	
	public TabPosicao(char coluna, int linha) {
		if(linha<1 || linha >8 || coluna < 'A' || coluna > 'H') {
			throw new JogoException("Inicialização inválida! Valores válidos são: de A1 até H8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao converteParaMatriz() {
		/* PADRAO DE CONVERSAO: encoding do char 'A'
		   'A'-'A' = 0
		   'B'-'A' = 1
		    (...)
		 */
		return new Posicao(8-linha, coluna-'A');
	}
	
	protected static TabPosicao converteParaTabPos(Posicao pos) {
		return new TabPosicao((char)('A'-pos.getColuna()), 8-pos.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
