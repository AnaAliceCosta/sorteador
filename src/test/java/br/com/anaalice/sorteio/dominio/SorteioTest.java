package br.com.anaalice.sorteio.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SorteioTest {
	List<String> nomes;

	
	@BeforeEach
	void setup(){
		this.nomes = new ArrayList<String>();
		this.nomes.add("Ana Costa");
		this.nomes.add("Amanda Sacci");
		this.nomes.add("Abner Andrade");
		this.nomes.add("Erick Marques");
		this.nomes.add("Mateus Stain");
		this.nomes.add("Mateus Menezes");
		
		
	
	}

	@Test
	void deveSerPossivelSortearTresPessoas() {

		

		List<String> contemplados = Sorteio.sortear(nomes,3);
		
		assertEquals(3, contemplados.size());
		
		
		for(int i = 0; i <contemplados.size();i++) {
			assertTrue(this.nomes.contains(contemplados.get(i)));
		}
//		assertTrue(this.nomes.contains(contemplados.get(0)));
//		assertTrue(this.nomes.contains(contemplados.get(1)));
//		assertTrue(this.nomes.contains(contemplados.get(2)));
		
		assertNotEquals(contemplados.get(0), contemplados.get(1));
		assertNotEquals(contemplados.get(0), contemplados.get(2));
		assertNotEquals(contemplados.get(1), contemplados.get(2));
		
	}
		
	@Test
	void deveApresentarErroAoTentarSortearMaisNomesQueAListaPermite() {
		Assertions.assertThrows(RuntimeException.class, ()-> Sorteio.sortear(nomes, nomes.size()+1) );
	}
		
		
}
