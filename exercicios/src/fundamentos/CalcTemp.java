package fundamentos;

public class CalcTemp {
	public static void main(String[] args) {
		final double div = 5/9.0;
		final int sub = 32;
		
		double TempF = 86;
		double TempC = (TempF - sub)*div;
		
		System.out.println("o resultado e: °C" + TempC);
		
		TempF = 150;
		TempC = (TempF - sub)*div;
		
		System.out.println("o resultado e: °C" + TempC);
	}

} 
