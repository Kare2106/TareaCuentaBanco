
public abstract class CuentaBancaria {
	private String dueño;
	public double liquidación;
	
	public abstract void deposito(double dinero);
	
	public abstract void retiro(double dinero);
		
	
	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
	}
	public double getLiquidación() {
		return liquidación;
	}
	public void setLiquidación(double liquidación) {
		this.liquidación = liquidación;
	}


}
