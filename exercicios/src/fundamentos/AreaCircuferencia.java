package fundamentos;

public class AreaCircuferencia {

	public static void main(String[] args) {
		
		double raio = 3.4;
		final double Pi = 3.14159;
		double area = Pi * raio * raio;
		
		
		System.out.println(area);
		raio = 10;
		area = Pi * raio * raio;
		System.out.println("area é igual =" + area);

		
	}
	
}
