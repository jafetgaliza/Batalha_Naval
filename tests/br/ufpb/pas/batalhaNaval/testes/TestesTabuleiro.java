package br.ufpb.pas.batalhaNaval.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.pas.batalhaNaval.MeuErro;
import br.ufpb.pas.batalhaNaval.Tabuleiro;

public class TestesTabuleiro extends Tabuleiro{

	
	@Test
	public void tamanhoTabuleiro(){
		//Tabuleiro t = new Tabuleiro();
		try{
			criarJogo(2,3);
			}catch(MeuErro erro){
				throw erro;
		}
		
		
		//assertEquals(20, t.getLargura());
		//assertEquals(10, t.getAltura());
	}

}
