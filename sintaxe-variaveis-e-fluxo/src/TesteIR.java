
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.00;

		if (salario >= 1900 && salario <= 2800.00) {
			System.out.println("A sua aliquota de imposto � de 7.5% e voc� pode deduzir at� R$142,00");
		}

		if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("A sua aliquota de imposto � de 15% e voc� pode deduzir at� R$350,00");
		} 
		
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("A sua aliquota de imposto � de 22.5% e voc� pode deduzir at� R$636,00");
		}
	}
}
