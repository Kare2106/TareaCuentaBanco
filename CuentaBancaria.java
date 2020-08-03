
public abstract class CuentaBancaria {
	private String due�o;
	public double liquidaci�n;
	
	public abstract void deposito(double dinero);
	
	public abstract void retiro(double dinero);
		
	
	public String getDue�o() {
		return due�o;
	}
	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}
	public double getLiquidaci�n() {
		return liquidaci�n;
	}
	public void setLiquidaci�n(double liquidaci�n) {
		this.liquidaci�n = liquidaci�n;
	}


}
