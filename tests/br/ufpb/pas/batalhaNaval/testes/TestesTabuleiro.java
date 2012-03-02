package br.ufpb.pas.batalhaNaval.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.pas.batalhaNaval.MeuErro;
import br.ufpb.pas.batalhaNaval.Tabuleiro;

public class TestesTabuleiro extends Tabuleiro{

	
	@Test
	public void tamanhoTabuleiro(){
		Tabuleiro t = new Tabuleiro();
		try{
			t.criarJogo(20,10);
			}catch(MeuErro erro){
				erro.printStackTrace();
		}
		
		assertEquals([20][10], t.getTabuleiro());
		

	}
	
}
