package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		//adicionando um novo aluno
		
		 System.out.println(alunos.size());
		 alunos.add("Pedro");
		 System.out.println(alunos.size());
		 
		 
		 boolean adicionou = alunos.add("Pedro");
		 System.out.println("Pedro foi adicionado ao Set? " + adicionou);
		 System.out.println(alunos.size());
		 
		 
		 
		//usando foreach para  lista de alunos
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
	}
}
