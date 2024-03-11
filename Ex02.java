import java.util.Scanner;

public class Ex02 {
	/*
	 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
	 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
	 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
	 * avisando se o número informado pertence ou não a sequência.
	 * 
	 * 
	 */
	
	static boolean isFibonacci(long n) {
		if(n < 0)
			return false;
		long a = 0;
		long b = 1;
		while(a <= n) {
			long temp = a + b;
			a = b;
			b = temp;
			if(a == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			long n = in.nextLong();
			if(isFibonacci(n))
				System.out.println("O numero pertence a sequencia de fibonacci.");
			else
				System.out.println("O numero nao pertence a sequencia.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
