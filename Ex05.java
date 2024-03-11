import java.util.Scanner;

public class Ex05 {
	/*
	 * ) Escreva um programa que inverta os caracteres de um string.
	 * 
	 * 
	 * IMPORTANTE:
	 * 
	 * a) Essa string pode ser informada atrav�s de qualquer entrada de sua
	 * prefer�ncia ou pode ser previamente definida no c�digo;
	 * 
	 * b) Evite usar fun��es prontas, como, por exemplo, reverse;
	 * 
	 */
	
	static String reverseString(String w) {
		StringBuilder b = new StringBuilder();
		
		for(int i = w.length()-1; i >= 0; i--) {
			b.append(w.charAt(i));
		}
		
		return b.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.println("Palavra normal " + word);
		word = reverseString(word);
		System.out.println("Palavra invertida " + word);

	}

}
