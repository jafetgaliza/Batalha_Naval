package br.ufpb.pas.batalhaNaval;

public class Tabuleiro {
	private int[][] tabuleiro; 
	private int QuantidadeDeBarcos = 0;
	private static final int MIN_LAG = 2;
	private static final int MIN_COMP = 2;
	private int largura;
	private int comprimento;
	
	public Tabuleiro(){
		this.setLargura(MIN_LAG);
		this.setComprimento(MIN_COMP);
		this.tabuleiro = new int[MIN_LAG][MIN_COMP];
	}
	public Tabuleiro(int lag, int comp){
		this.setLargura(lag);
		this.setComprimento(comp);
		this.tabuleiro = new int[lag][comp];
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getQuantidadeDeBarcos() {
		return QuantidadeDeBarcos;
	}
	public void setQuantidadeDeBarcos(int quantidadeDeBarcos) {
		QuantidadeDeBarcos = quantidadeDeBarcos;
	}
	public int[][] getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(int[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	public void criarJogo(int largura, int comprimento) throws MeuErro{
		
		
		if (largura < MIN_LAG || comprimento < MIN_COMP)
			throw new MeuErro("Largura e Altura devem ser maiores que 2");
		else{
		int[][] t = new int[20][10];
		}
	}
}