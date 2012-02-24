package br.ufpb.pas.batalhaNaval;

public class Tabuleiro {
	private int largura;
	private int altura;
	private int QuantidadeDeBarcos;
	
	public Tabuleiro(){
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void criarJogo(int largura, int altura) throws MeuErro{
		this.largura = largura;
		this.altura = altura;
		if (largura < 2 || altura < 2){
			throw new MeuErro("Largura e Altura devem ser maiores que 2");
		}if(largura < 0 || altura < 0){
	
		}
	
	
}
}