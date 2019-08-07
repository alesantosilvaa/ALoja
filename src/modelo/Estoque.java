package modelo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<VideoGame> gamesDisponiveis;
    private List<Importadora> importadoras;
    
    public Estoque() {
    	this.gamesDisponiveis = new ArrayList<>();
    	this.importadoras = new ArrayList<>();
    }
    
    public void cadastrarImportadora(Importadora importadora) {
    	this.importadoras.add(importadora);
    }
    
    public void cadastrarvideoGame(VideoGame videoGame) {
    	this.gamesDisponiveis.add(videoGame);
    }
    
    public void pesquisarGamePeloNome(String nomeDoGame) {
		for (VideoGame videoGame : gamesDisponiveis) {
			if(nomeDoGame == videoGame.getTitulo() ) {
				System.out.println("Faz parte do estoque!");
			}
		}
    }
    public void listarGamesQueEstaoNoMinimo() {
    	
    	
    	for (VideoGame videoGame : gamesDisponiveis) {
    		String nomeImportadora = videoGame.getImportadora().getNomeImportadora();
    		String nomeGame = videoGame.getTitulo();
			if(videoGame.getQuantidadeMinimaEstoque() <= 2) {
				System.out.println(nomeGame + " Esta no minimo e a importadora dele é : " + nomeImportadora);
			}
    }
    }
    
	public List<VideoGame> getGamesDisponiveis() {
		return gamesDisponiveis;
	}

	public void setGamesDisponiveis(List<VideoGame> gamesDisponiveis) {
		this.gamesDisponiveis = gamesDisponiveis;
	}

	public List<Importadora> getImportadoras() {
		return importadoras;
	}

	public void setImportadoras(List<Importadora> importadoras) {
		this.importadoras = importadoras;
	}
     
	
    
    
}
