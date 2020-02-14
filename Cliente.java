package Cajero;

public class Cliente extends Cuenta {
	private String rut;
	private String nombre;
	private String apellidos;
	private String clave;
	private int saldo;
	private int retiro;
	
	
   

	public Cliente(String n_cuenta, String tipo_cuenta) {
		super(n_cuenta, tipo_cuenta);
	}

	public Cliente(String n_cuenta, String tipo_cuenta,String rut,String nombre, String apellidos,String clave,int saldo,int retiro) {
	super(n_cuenta, tipo_cuenta);

	this.rut= rut ;
	this.nombre=nombre;
	this.apellidos= apellidos;
	this.clave=clave;
	this.saldo= saldo;
	this.setRetiro(retiro);
	
	}

	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getRetiro() {
	    return retiro;
    }

	public void setRetiro(int retiro) {
		this.retiro = retiro;
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
	public void girarDinero(int giro) {
			if (giro>saldo ) {
			this.saldo=saldo-giro;
			System.out.println("Lo sentimos, no cuenta con saldo suficiente. "
									+saldo+".");
		}
	}
	
}
