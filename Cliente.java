package Cajero;

public class Cliente extends Cuenta {
	private String rut;
	private String nombre;
	private String apellidos;
	private String clave;
	private int saldo;

	public Cliente(String n_cuenta, String tipo_cuenta,String rut,String nombre, String apellidos,String clave,int saldo) {
	super(n_cuenta, tipo_cuenta);

	this.rut= rut ;
	this.nombre=nombre;
	this.apellidos= apellidos;
	this.clave=clave;
	this.saldo= saldo;
	
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

	// metodo abono
	public void abonoDinero(int abono) {
		// Si abono es mayor a cero
		if (abono > 0) {
			// sumar abono a saldo

			this.saldo = saldo + abono;
			// Me imprime lo abonado y el saldo final
			System.out.println("han recargado $" + abono + " a su tarjeta. " + "Saldo final $" + saldo + ".");

		}
	}
}
