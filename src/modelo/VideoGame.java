package modelo;

public class VideoGame {
	
	private String titulo;
	private double precoDeVenda;
	private int quantidadeEmEstoque;
	private int quantidadeMinimaEstoque;
	private Importadora importadora;
	
	public VideoGame(String titulo, double precoDeVenda, int quantidadeEmEstoque, int quantidadeMinimoEstoque,Importadora importadora) {
		this.titulo = titulo;
		this.precoDeVenda = precoDeVenda;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.importadora = importadora;
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getPrecoDeVenda() {
		return precoDeVenda;
	}
	
	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public int getQuantidadeMinimaEstoque() {
		return quantidadeMinimaEstoque;
	}
	
	public void setQuantidadeMinimaEstoque(int quantidadeMinimaEstoque) {
		this.quantidadeMinimaEstoque = quantidadeMinimaEstoque;
	}
	
	public Importadora getImportadora() {
		return importadora;
	}
	
	public void setImportadora(Importadora importadora) {
		this.importadora = importadora;
	}

}

