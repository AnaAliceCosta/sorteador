package br.com.anaalice.sorteio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.anaalice.sorteio.dominio.Sorteio;

public class ClasseInicial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nome="";
		int quantidade=0;
		List<String> nomes = new ArrayList();		
		
		while(!nome.equals("terminar")) {
			System.out.println("Digite o proximo nome ou terminar:");
			nome = s.nextLine();
			if(!nome.equals("terminar"))
				nomes.add(nome);
		}
		
		System.out.println("Digite quantos nomes você deseja sortear:");
		quantidade = s.nextInt();
		
		List<String> sorteados = Sorteio.sortear(nomes, quantidade);
		System.out.println(sorteados);
		
		
		
	
	}
}
