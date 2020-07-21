package application;

import xadrez.PartidaDeXadrez;

public class Main {

	public static void main(String[] args) {
		PartidaDeXadrez partida = new PartidaDeXadrez();
		UI.printTab(partida.getPecas());

	}
}
