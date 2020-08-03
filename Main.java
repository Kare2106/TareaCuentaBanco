public class Main {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente ();
		CuentaAhorro ca = new CuentaAhorro ();
		
		cc.deposito(1000);
		System.out.println(cc.getLiquidación());
		
		ca.deposito(1000);
		System.out.println(ca.getLiquidación());
		
	}

}