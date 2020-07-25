package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.JogoException;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.TabPosicao;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		PartidaDeXadrez partida = new PartidaDeXadrez();
		
		while(true) {
			try {
				UI.limpaTela();
				UI.printTab(partida.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				TabPosicao o = UI.readTabPosicao(entrada);
				
				System.out.print("Destino: ");
				TabPosicao d = UI.readTabPosicao(entrada);
				
				PecaDeXadrez cap = partida.mover(o, d);	
				
			} catch (JogoException e) {
				System.out.println(e.getMessage());
				entrada.nextLine();
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				entrada.nextLine();
			}
		}
	}
}
