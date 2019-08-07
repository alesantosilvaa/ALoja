package modelo;

public class VideoGame {
	private String titulo;
	private double precoDeVenda;
	private int quantidadeEmEstoque;
	private int quantidadeMinimaParaSeComprar;
	private Importadora importadora;
	
	
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
	
	public int getQuantidadeMinimaParaSeComprar() {
		return quantidadeMinimaParaSeComprar;
	}
	
	public void setQuantidadeMinimaParaSeComprar(int quantidadeMinimaParaSeComprar) {
		this.quantidadeMinimaParaSeComprar = quantidadeMinimaParaSeComprar;
	}
	
	public Importadora getImportadora() {
		return importadora;
	}
	
	public void setImportadora(Importadora importadora) {
		this.importadora = importadora;
	}

}

