
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais.");

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc? pode entrar pois tem mais de 18 anos.");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Apesar de menor de 18 anos, " + "voc? pode entrar pois esta acompanhado.");
			} else {

				System.out.println("Infelizmente voc? n?o pode entrar pois tem menos de 18 anos.");
			}
		}
	}
}
