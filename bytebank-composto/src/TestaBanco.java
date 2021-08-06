
public class TestaBanco {

	public static void main(String[] args) {
		Cliente rodrigo = new Cliente();
		rodrigo.cpf = "215.548.698-70";
		rodrigo.nome = "Rodrigo Sundfeld Batista de Moraes";
		rodrigo.profissao = "Estudante";
		
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.deposita(1000);
		
		contaDoRodrigo.titular = rodrigo;
		System.out.println(contaDoRodrigo.titular.nome);
		System.out.println(contaDoRodrigo.titular);
	}
}
