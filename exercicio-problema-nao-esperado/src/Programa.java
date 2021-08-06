
public class Programa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
        pessoa.nome = "Rodrigo";
        pessoa.cpf = "215.548.698-70";
        pessoa.idade = 40;
             
        
        pessoa.endereco = new Endereco();
        pessoa.endereco.logradouro  = "Rua Cotia";
        
        System.out.println(pessoa.nome);
        System.out.println(pessoa.endereco.logradouro);
	}
}
