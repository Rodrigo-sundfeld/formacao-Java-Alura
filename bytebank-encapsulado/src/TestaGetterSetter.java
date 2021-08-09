
public class TestaGetterSetter {

	public static void main(String[] args) {
		Conta contaTeste = new Conta(1, 1000);
		contaTeste.setNumero(1000);
		System.out.println(contaTeste.getNumero());
		
		Cliente sundfeld = new Cliente();
		sundfeld.setNome("Rodrigo Sundfeld");		
		
		contaTeste.setTitular(sundfeld);
		
		System.out.println(contaTeste.getTitular().getNome());
		
		contaTeste.getTitular().setProfissao("Estudante");
		//agora em duas linhas
		Cliente titularDaConta = contaTeste.getTitular();
		titularDaConta.setProfissao("Estudante");
		
		System.out.println(titularDaConta);
		System.out.println(sundfeld);
		System.out.println(contaTeste.getTitular());
		
	}
}
