package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "bom dia X";
		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		
		System.out.println(s);
		
		System.out.println("leo".toUpperCase());
		var x = "leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "guri")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos nao tem operador pronto
		
		int A = 3;
		//A. não extiste
		System.out.println(A);
		
		
		
	}

}
