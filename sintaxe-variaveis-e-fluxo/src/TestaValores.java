
public class TestaValores {

	public static void main(String[] args) {
		int primeiroNumero = 5;
		int segundoNumero = 7;
		
		segundoNumero = primeiroNumero;
		
		primeiroNumero = 10;
		
		System.out.println(segundoNumero);
		System.out.println(primeiroNumero);
		System.out.println(primeiroNumero + segundoNumero);
	}
}
