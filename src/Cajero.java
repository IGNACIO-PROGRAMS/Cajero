import java.time.LocalDateTime;

public class Cajero {

	private String idCajero;
	private final int MEM_SIZE = 100;
	private final int LIST_SIZE = 10;
	private int ultMov = 0;
	private Movimiento[] mov = new Movimiento[MEM_SIZE];
	
	public enum tipoOperacion {INGRESO, RETIRADA, TRANSFERENCIA, SALDO, ULTMOV};
	
	public boolean RegistrarMovimiento(Movimiento m) {
		boolean result=true;		
		this.mov [this.ultMov] = m;
		this.ultMov++;
		if (this.ultMov==MEM_SIZE) {this.ultMov=0;}
		return result;
	};
	public void ListarMovimiento() {};	
	public void RealizarOperacion() {}
	
	public Cajero(String idCajero) {
		super();
		this.idCajero = idCajero;
	};
	
}
