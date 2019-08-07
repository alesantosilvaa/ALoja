package modelo;

public class Importadora {
	
	private String nomeImportadora;
	private String nomeDoResponsavel;
	private String telefone;
	private String cgc;
	
	public Importadora(String nomeImportadora, String nomeDoResponsavel, String telefone, String cgc) {
		this.nomeImportadora = nomeImportadora;
		this.nomeDoResponsavel = nomeDoResponsavel;
		this.telefone = telefone;
		this.cgc = cgc;
	}
	
	public String getNomeDoResponsavel() {
		return nomeDoResponsavel;
	}
	
	public void setNomeDoResponsavel(String nomeDoResponsavel) {
		this.nomeDoResponsavel = nomeDoResponsavel;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCgc() {
		return cgc;
	}
	
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public String getNomeImportadora() {
		return nomeImportadora;
	}

	public void setNomeImportadora(String nomeImportadora) {
		this.nomeImportadora = nomeImportadora;
	}
 
	
}
