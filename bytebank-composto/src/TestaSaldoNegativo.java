
public class TestaSaldoNegativo {

		public static void main(String[] args) {
			
			Conta contaDaPriscilla = new Conta();
			contaDaPriscilla.deposita(100);
			System.out.println(contaDaPriscilla.getSaldo());
			System.out.println(contaDaPriscilla.saca(200));
			System.out.println(contaDaPriscilla.getSaldo());
			
			
			contaDaPriscilla.getSaldo();
			System.out.println(contaDaPriscilla.getSaldo());
			
	}
		}
		
