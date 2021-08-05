
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais.");

		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {

			System.out.println("Infelizmente você nao pode entrar pois tem menos de 18 anos e está desacompanhado");
		}
	}
}
