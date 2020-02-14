package Cajero;

public class Cuenta {
	//atributos

	private String n_cuenta;
	private String tipo_cuenta;

	public Cuenta(String n_cuenta, String tipo_cuenta) {
		

		this.n_cuenta = n_cuenta;
		this.tipo_cuenta = tipo_cuenta;
		
		
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
	@Override
	public String toString() {
		return "Cuenta [n_cuenta=" + n_cuenta + ", tipo_cuenta=" + tipo_cuenta + "]";
	}
		
	}

