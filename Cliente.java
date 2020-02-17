package Cajero;

	public class Cliente {
		
		private String n_cuenta;
		private String tipo_cuenta;
		private int saldo=0;
		
//constructor vacio 
		public Cliente() {
			super();
		}
		public String getN_cuenta() {
			return n_cuenta;
		}
		public void setN_cuenta(String n_cuenta) {
			this.n_cuenta = n_cuenta;
		}
		public String getTipo_cuenta() {
			return tipo_cuenta;
		}
		public void setTipo_cuenta(String tipo_cuenta) {
			this.tipo_cuenta = tipo_cuenta;
		}
		public int getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}
		//metodo para girar dinero
		public void girarDinero(int giro) {
			if (giro>saldo ) {
				saldo= saldo-giro;
				System.out.println("Lo sentimos, no cuenta con saldo suficiente. "
									+saldo+".");
			}
		}
		// metodo abono
		public void depositoDinero(int deposito) {
			// Si abono es mayor a cero
			if (deposito > 0) {
				// sumar abono a saldo
				this.saldo = saldo + deposito;
				// Me imprime lo abonado y el saldo final
				System.out.println("se ha realizado un deposito de : " + deposito + " a su tarjeta. " + "Saldo final $" + saldo + ".");
				
			}
		}
		
		public void consultaSaldo() {
			System.out.println("Saldo actual es : "+saldo+".");
		}
		//metodo para cambiar clave
		String aux, claveactual;
			int rep, cont=0;
			//metodo cambio de clase
		public void CambiarClave() {
			//Variables método
			String aux, clave;
			//variable y contador para ciclo de repeticion
			int rep, cont=0;
	}
		
