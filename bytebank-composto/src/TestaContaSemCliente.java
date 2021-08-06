
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDoLucas = new Conta();
		System.out.println(contaDoLucas.saldo);
	
		contaDoLucas.titular = new Cliente();
		System.out.println(contaDoLucas.titular);
		
		contaDoLucas.titular.nome = "Lucas";
		System.out.println(contaDoLucas.titular.nome);
	}
}
