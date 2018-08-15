package br.com.senai.teste;

public class nova {
	
	@SuppressWarnings("unused")
	static public void main(String[] args) {

		String disciplina = "Sistemas orientados a objetos I";
		String frase = "Fim dos tempos";

		
		System.out.println("diciplina " + disciplina);

		System.out.print("Primeiro caractere:");
		System.out.println(disciplina.charAt(0));
		System.out.print("Segundo caractere:");
		System.out.println(disciplina.charAt(1));
		
		char letra = disciplina.charAt(2);
	
		
		System.out.print("Primeiras 8 letras ");
		System.out.println(disciplina.substring(0, 8));
		System.out.print("Letras a partir da decima segunda ");
		System.out.println(disciplina.substring(12) +  frase.substring(1));
	}

}
