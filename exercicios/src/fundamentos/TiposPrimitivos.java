package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//informação dos funcionarios 
		
		//tipos numericos inteiros 
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 503;
		int id = 56780;
		long pontosAcumulados = 3_234_845_221L;
		
		//tipos numericos reais 
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = true; // false
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("o Id " + id + "ganha: " + salario);
		System.out.println("ferias? " + estaDeFerias);
		
		System.out.println("status: " + status);
	}
}
