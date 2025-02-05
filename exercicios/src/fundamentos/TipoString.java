package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hello World".charAt(6)); // chama o a letra do numero
		
		String boa = "Boa Tarde";
		System.out.println(boa.concat("!!!"));
		System.out.println(boa + "!!!");
		
		System.out.println(boa.startsWith("Boa")); //começa com 
		System.out.println(boa.toLowerCase().startsWith("boa")); //
		System.out.println(boa.endsWith("Tarde"));//termina com 
		System.out.println(boa.toUpperCase().endsWith("TARDE"));
		
		System.out.println(boa.length()); //Tamanho da palavra
		System.out.println(boa.equals("Boa Tarde"));//Se é igual
		System.out.println(boa.equalsIgnoreCase("bOa TarDe"));//ignora maiusculas e minusculas
		
		var nome = "pedro";
		var sobrenome = "santos";
		var idade = 33;
		var salario = 1234.897;
		
		
		String maisUmaFrase = "Nome: "+ nome + "\nSobrenome: " + sobrenome +
				" \nIdade: " + idade + " \nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		
		System.out.println("Nome: "+ nome + "\nSobrenome: " + sobrenome +
				" \nIdade: " + idade + " \nSalario: " + salario + "\n\n");
		
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario); // %s => string 
												 //%d => numeros int  
												 //%f => numeros float ou double [(.2) numeros de casas decimais]
		
		String frase = String.format("\nNome: %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		System.out.println("Frase qualquer".indexOf("qual")); //onde esta o "qual"
		System.out.println("Frase qualquer".substring(6)); //comeca pelo 6 caractere
		System.out.println("frase qualquer".substring(6,10)); // comeca pelo 6 e termina no 10
		
		

	}

}
