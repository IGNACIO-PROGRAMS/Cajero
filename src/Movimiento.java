
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Definir formato de fecha
 * DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 *  Obtener fecha actual
 * LocalDateTime ahora = LocalDateTime.now();
 * System.out.println(ahora.format(fmt));
 * Especificar una fecha hora determinada
 * String miFechaHora = "2024-01-01 00:00:00";
 * LocalDateTime fechaFija = LocalDateTime.parse(miFechaHora, fmt);
 * 
 * 
 */


public class Movimiento {
	private LocalDateTime Fecha;
	private Cuenta CuentaOrigen;
	private Cuenta CuentaDestino;	
	private String operacion;
	private float Importe;
	
	public LocalDateTime getFecha() 					{		return Fecha;					}
	public void setFecha(LocalDateTime fecha) 			{		Fecha = fecha;					}
	public Cuenta getCuentaOrigen() 					{		return CuentaOrigen;			}
	public void setCuentaOrigen(Cuenta cuentaOrigen) 	{		CuentaOrigen = cuentaOrigen;	}
	public Cuenta getCuentaDestino() 					{		return CuentaDestino;			}
	public void setCuentaDestino(Cuenta cuentaDestino) 	{		CuentaDestino = cuentaDestino;	}
	public String getOperacion() 						{		return operacion;				}
	public void setOperacion(String operacion) 			{		this.operacion = operacion;		}
	public float getImporte() 							{		return Importe;					}
	public void setImporte(float importe) 				{		Importe = importe;				}
	
	public Movimiento(LocalDateTime fecha, Cuenta cuentaOrigen, Cuenta cuentaDestino, String operacion, float importe) {
		super();
		Fecha = fecha;
		CuentaOrigen = cuentaOrigen;
		CuentaDestino = cuentaDestino;
		this.operacion = operacion;
		Importe = importe;
	}
	
	@Override
	public String toString() {
		return "Movimiento [Fecha=" + Fecha + ", CuentaOrigen=" + CuentaOrigen + ", CuentaDestino=" + CuentaDestino
				+ ", operacion=" + operacion + ", Importe=" + Importe + "]";
	}
	
	
	

}
