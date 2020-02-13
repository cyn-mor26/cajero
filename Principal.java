package Cajero;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args ) {
	Scanner sc = new Scanner(System.in);	
	
	 Cliente usur  = new Cliente("n_cuenta", "tipo_cuenta", "rut", "nombre", "apellidos", "clave", 7888888 );

// Arreglo 1
		// String[][] Clientenuevo = new String [10][6];

		int op,abono;

		do {
			System.out.println("******************BIENVENIDO A SU BANCO******************");
			System.out.println("SELECCIONE TIPO DE USUARIO :\n");
			System.out.println("1.Admnistrador ");
			System.out.println("2.Cliente ");
			System.out.println("3.SALIR");
			op = sc.nextInt();
		} while (op >= 3 || op <= 1);
		System.out.println("INGRESE ALTERNATIVA CORRECTA");
		
		switch (op) {

		case 1:

			System.out.println("Administrador");
			System.out.println("Ingrese usuario : ");
			usur.getRut();
			
			break;

		case 2:

			System.out.println("Cliente");
			abono= sc.nextInt();
				usur.abonoDinero(abono);
			//Retirar 
			
			// consulta saldo 
			
			// Mostrar ultimos movimientos
			break;

		case 3:

			System.out.println("SALIR");

			break;

		case 4:
			System.out.println("SALIR");
			break;

		}
	}

}
	
