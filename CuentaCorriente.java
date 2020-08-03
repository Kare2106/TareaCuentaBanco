
public class CuentaCorriente extends CuentaBancaria{
	public void deposito(double dinero) {
		if (dinero>0 &&  dinero<=1000) {
			dinero += (dinero*0.01);
			liquidación += dinero;
			
		}else {
			liquidación += dinero;
		}
		
		
	}

	@Override
	public void retiro(double dinero) {
		
		
	}
	
	
	

}
