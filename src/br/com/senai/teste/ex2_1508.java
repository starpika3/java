package br.com.senai.teste;

public class ex2_1508 {
	public static void main(String[] args) {
		
		double altura= 3;
		double h = altura;
		double baseMenor = 7;
		double b1 = baseMenor;
		double baseMaior = 2;
		double b2 = baseMaior;
		double area;
		
		area = (h*(b1+b2))/2;
		
		System.out.print("a area exata �: ");
		System.out.println(area);
		
		int t = (int) area;
				
		System.out.print("a area arredonda �: ");
		System.out.println(t);
		
	}

}
