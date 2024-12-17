import java.time.LocalDateTime;
import java.util.Scanner;

public class AppMain {
	Scanner sc = new Scanner(System.in);
	public Cuenta cejemplo[] = {
			new Cuenta ("ES001"),
			new Cuenta ("ES002"),
			new Cuenta ("ES003"),
			new Cuenta ("ES004")
	};
	
	public Cuenta eligeCuenta () {
		int n = 0;		
		System.out.println("Elige numero de cuenta (1,2,3,4): ");
		n = sc.nextInt();
		return cejemplo[(n-1)];
	}
	
	public float eligeImporte () {
		System.out.println("Indica importe € : ");				
		float valor = sc.nextInt();
		return valor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppMain doBank = new AppMain();
		doBank.runApp();
		System.out.println("Aplicacion terminada.");
		
	}

	public void runApp() {
		cejemplo[0].ingreso(5000);
		cejemplo[1].ingreso(5000);
		cejemplo[2].ingreso(5000);
		cejemplo[3].ingreso(5000);
		
		String[] op_cajero = {"INGRESO", "RETIRADA", "TRANSFERENCIA", "SALDO", "ULTMOV"};
		
		Menu m1 = new Menu("CAJERO: Opciones disponibles: ",op_cajero);
		//System.out.println(m1);
		Cajero miCajero = new Cajero("Paloma");
		
		
		
		Cuenta op;
		Cuenta opDest;
		float valor ;
		boolean operacion;
		boolean salir=false;
		do {
			m1.mostrar();
			int opcElegida = m1.seleccionaOpc();	
			
		switch(opcElegida) {  // abre switch
			case 1:			// INGRESO cuenta origen y valor
				System.out.println("");
				//System.out.println("Opcion : "+opcElegida + " no implementada.");				
				op = eligeCuenta();								
				valor = eligeImporte();
				operacion=op.ingreso(valor);
				if (operacion) {
					Movimiento m = new Movimiento(LocalDateTime.now(),op,null,"INGRESO",valor);
					miCajero.RegistrarMovimiento(m);
					System.out.println("Operacion realizada con exito");
					};
				break;
			case 2:			// RETIRADA cuenta origen y valor
				System.out.println("");
				//System.out.println("Opcion : "+opcElegida + " no implementada.");
				op = eligeCuenta();								
				valor = eligeImporte();
				operacion=op.retirada(valor);
				if (operacion) {
					Movimiento m = new Movimiento(LocalDateTime.now(),op,null,"RETIRADA",valor);
					miCajero.RegistrarMovimiento(m);
					System.out.println("Operacion realizada con exito");
					}
				else {System.out.println("Operacion denegada");}
				break;
			case 3:			// TRANSFERENCIA cuenta origen y destino y valor
				System.out.println("");
				//System.out.println("Opcion : "+opcElegida + " no implementada.");
				System.out.println("Elige cuenta ORIGEN");
				op = eligeCuenta();
				System.out.println("Elige cuenta DESTINO");
				opDest = eligeCuenta();
				valor = eligeImporte();
				operacion=op.Trasferencia(opDest, valor);
				if (operacion) {
					Movimiento m = new Movimiento(LocalDateTime.now(),op,opDest,"TRANFERENCIA",valor);
					miCajero.RegistrarMovimiento(m);
					System.out.println("Operacion realizada con exito");
					}
				else {System.out.println("Operacion denegada");}
				break;
			case 4:			// SALDO cuenta origen
				System.out.println("");
				//System.out.println("Opcion : "+opcElegida + " no implementada.");
				op = eligeCuenta();
				System.out.println("El saldo es de :" + op.getSaldo()+" €.");
				break;
			case 5:			// ULTMOV cuenta origen
				System.out.println("");
				System.out.println("Opcion : "+opcElegida + " no implementada.");
				break;	
			case 0:
				System.out.println("");
				//System.out.println("Opcion : "+opcElegida + " no implementada.");
				System.out.println("Saliendo del cajero.");
				salir = true;
				break;	
		}  // cierra switch
		
		} while (!salir);
		
	}	// cierra MAIN
	
}	// cierra CLASS
