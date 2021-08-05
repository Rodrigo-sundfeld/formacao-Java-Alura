package bytebank;

public class testaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.saldo = 1000;
		contaDoRodrigo.deposita(500);
		System.out.println("O saldo da conta do Rodrigo � R$" + contaDoRodrigo.saldo);
		boolean conseguiuRetirar = contaDoRodrigo.saca(20);
		System.out.println("O novo saldo da conta do Rodrigo � R$" + contaDoRodrigo.saldo);
		System.out.println("O saque foi realizado com sucesso? " + conseguiuRetirar );
		
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 10000;
		contaDoLucas.deposita (800);
		System.out.println("\n" + "O saldo da conta do Lucas � R$" + contaDoLucas.saldo);
				
		Conta contaDaPriscilla = new Conta();
		contaDaPriscilla.deposita(5000);
		
		if (contaDaPriscilla.transfere(11500, contaDoLucas)) {
			System.out.println("Transferencia realizada com sucesso!");
		} else {
			System.out.println("Transferencia n�o realizada, saldo insuficiente!");
		}
		
		System.out.println("\n" + "O saldo atual da conta da Prisilla � R$" + contaDaPriscilla.saldo);
		System.out.println("O saldo da conta do Lucas � R$" + contaDoLucas.saldo);
	}

}
