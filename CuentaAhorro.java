
	public class CuentaAhorro extends CuentaBancaria{
		public void deposito(double dinero) {
			if (dinero>0 &&  dinero<=1000) {
				dinero += (dinero*0.02);
				liquidaci�n += dinero;
				
			}else {
				liquidaci�n += dinero;
			}

	}

		@Override
		public void retiro(double dinero) {
			// TODO Auto-generated method stub
			
		}
	}

