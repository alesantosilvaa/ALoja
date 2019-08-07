package execucao;

import modelo.Estoque;
import modelo.Importadora;
import modelo.VideoGame;

public class Principal {
 public static void main(String[] args) {
	 Importadora importadora = new Importadora("IF Games", "Alessandra", "4002-8922", "548.762.565/0001-60" );
	 VideoGame videoGame = new VideoGame("GTA", 100.00, 30, 2, importadora);
	 VideoGame videoGame1 = new VideoGame("Super Barbie", 200.00, 25, 5, importadora);
	 VideoGame videoGame2 = new VideoGame("Cinema Panic", 150.00, 20, 4, importadora);
	 Estoque estoque = new Estoque();
	 
	 estoque.cadastrarImportadora(importadora);
	 estoque.cadastrarvideoGame(videoGame);
	 estoque.cadastrarvideoGame(videoGame1);
	 estoque.cadastrarvideoGame(videoGame2);
	 estoque.listarGamesQueEstaoNoMinimo();
	 estoque.pesquisarGamePeloNome("GTA");
}
}
