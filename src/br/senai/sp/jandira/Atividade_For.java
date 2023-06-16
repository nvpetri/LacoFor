package br.senai.sp.jandira;

public class Atividade_For {

	public static void main(String[] args) {
		
		int comValor, finValor, i, soma;
		comValor = 1;
		finValor = 50;
		soma = 0;
		for (i = comValor; i <= finValor; i ++) {
			if(i % 2 == 0)
				soma += i;
	
		} System.out.println(soma);
		
	}

}
