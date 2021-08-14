package br.com.anaalice.sorteio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {

	public static List<String> sortear(List<String> nomes, int quantidadeContemplados) {
		if(quantidadeContemplados >nomes.size()) {
			throw new RuntimeException("quantidade contemplados maior que o permitido");
		}
		
		
		List<String>  candidatos = new ArrayList(nomes);
		List<String> contemplados = new ArrayList();
		
		Random gerador = new Random();
		
		for(int contador =0;contador < quantidadeContemplados;contador++){
			int contemplado = gerador.nextInt(candidatos.size());
			
			contemplados.add(candidatos.get(contemplado));
			candidatos.remove(contemplado);
			
		}
		
		return contemplados;
	}

}
