package Cajero;

import java.util.Scanner;

public class Principal_cajero {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
	
	Cliente usur  = new Cliente("String n_cuenta", " tipo_cuenta","rut","nombre", " apellidos"," clave",000000,0000000,000000);
//Arreglo 1
		// String[][] Clientenuevo = new String [10][6];
	 
		int op,op2, deposito = 0;
		String adm, pass;
		
		//menu principal
		do {
			System.out.println("|-----------------------------------------------------------|");
			System.out.println("|                   BIENVENIDO A SU BANCO                   |");
			System.out.println("|-----------------------------------------------------------|\n");
			System.out.println("                 SELECCIONE TIPO DE USUARIO :                \n");
			System.out.println("|    1.Admin                  |                 2.Cliente   |\n");
			System.out.println("                                                ~ 3 SALIR ~ ");
			op = sc.nextInt();
			
		} while (op > 4 || op < 0);
		
		//System.out.println("INGRESE ALTERNATIVA CORRECTA");
		
		
		switch (op) {
		
		case 1:
			System.out.println("Administrador");
			
			System.out.println("Ingrese usuario : ");
			adm=sc.next();
			System.out.println("Ingrese password : ");
			pass=sc.next();
			
			if (adm=="root" && pass=="root") {
				
				
				
			}
			// submenu admin	
				
			break;
			
		case 2:
			System.out.println("|                           CLIENTE                         |\n");
			
			
			System.out.println("Ingrese RUT : ");
			adm=sc.next();
			System.out.println("Ingrese password : ");
			pass=sc.next();
			
			
			//submenu cliente
			do {
			System.out.println("============OPERACIÓN A REALIZAR============\n");
			System.out.println("Seleccione una opción : ");
			System.out.println("1.Deposito\n"
								+ "2.Girar\n"
								+ "3.Consulta saldo\n"
								+ "4.Movimientos recientes\n");
			op2 = sc.nextInt();
			
			} while (op2 <4 || op2 > 0);
			System.out.println("Intentalo denuevo");
			
			switch (op2) {
			
			case 1:
				int saldo = 0;
				System.out.println("Ingrese monto a depositar : " + deposito +"." + "Saldo final $" + saldo + ".");
					deposito= sc.nextInt();
					usur.depositoDinero(deposito);
			
				break;
			case 2:
			
				break;
			//Retirar
				
			// consulta saldo
			// Mostrar ultimos movimientos

			
		case 3:
			System.out.println("SALIR");
			break;
			
		}
	}
}

}