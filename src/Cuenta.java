
public class Cuenta {
	private String NumeroCuenta;
	private float Saldo;
	
	
	public Cuenta(String numeroCuenta, float saldo) {
		super();
		this.NumeroCuenta = numeroCuenta;
		if (saldo<0) {saldo = 0;}
		this.Saldo = saldo;
	}

	public boolean ingreso(float cantidad) {
		boolean operacion=false;
		if (cantidad>0) {this.Saldo+=cantidad; operacion=true;}
		return operacion;
	}
	
	public boolean retirada(float cantidad) {
		boolean operacion=false;
		if (cantidad>0 && cantidad<=this.Saldo) {this.Saldo-=cantidad; operacion=true;}
		return operacion;		
	}
	
	public boolean Trasferencia(Cuenta CuentaDestino, float cantidad) {
		boolean operacion=false;
		//if (!validarCuenta(CuentaDestino)) {return false;}
		operacion=this.retirada(cantidad);		
		if (operacion) {
		CuentaDestino.ingreso(cantidad);}
		if (!operacion) {this.ingreso(cantidad);}
		return operacion;		
	}

	public String getNumeroCuenta() 					{		return NumeroCuenta;			}
	//public void setNumeroCuenta(String numeroCuenta) 	{		NumeroCuenta = numeroCuenta;	}
	public float getSaldo() 							{		return Saldo;					}
	//public void setSaldo(float saldo) 				{		Saldo = saldo;					}

	public Cuenta(String numeroCuenta) {
		super();
		NumeroCuenta = numeroCuenta;
	}

	
}
