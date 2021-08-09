
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Conta numero " + this.numero + " pertecente a ag�ncia " + this.agencia + " criada com sucesso!");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
			return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O n�mero da ag�ncia deve ser maior que 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		 return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("O n�mero da ag�ncia dever ser maior que 0!");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}