package bytebank;

public class criaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 1000;
		
		System.out.println("A primeira conta tem de saldo R$" + primeiraConta.saldo);
		System.out.println("A segunda conta tem de saldo R$" + segundaConta.saldo);
		System.out.println("A terceira conta tem de saldo R$" + terceiraConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(terceiraConta);
	}
}
