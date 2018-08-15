package br.com.senai.teste;

public class TesteLogico {
	public static void main(String[] args) {

		int mes = 2;
		if ((mes == 12) || (mes == 1))
			;
		{
			System.out.println("Férias");
		}
		{
			if ((mes > 1) && (mes < 12))
				;
		}
		{
			if ((mes != 2))
				;
		}
		{
			System.out.println("Não tem carnaval");
		}
	}
}
