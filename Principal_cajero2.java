package Cajero;

import java.util.Scanner;

public class Principal_cajero2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
	
	Cliente usur  = new Cliente("j", "tipo_cuenta");
//Arreglo 1
		// String[][] Clientenuevo = new String [10][6];
	 
		int op,op2 = 0, deposito = 0;
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
			
		} while (op < 1 || op > 3);
		
		//System.out.println("INGRESE ALTERNATIVA CORRECTA");
		
		
		switch (op) {
		
		case 1:
			System.out.println("Administrador");
			
			System.out.println("Ingrese usuario : ");
			adm=sc.next();
			System.out.println("Ingrese password : ");
			pass=sc.next();
			
			if (adm=="root" && pass=="root") {
				System.out.println("============OPERACI�N A REALIZAR============\n");
				System.out.println("Seleccione una opci�n : ");
				System.out.println("1.Crear nuevo cliente\n"
									+ "2.Girar\n"
									+ "3.Consulta saldo\n"
									+ "4.Movimientos recientes\n"
									+ "5.Salir\n");
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
			System.out.println("============OPERACI�N A REALIZAR============\n");
			System.out.println("Seleccione una opci�n : ");
			System.out.println("1.Deposito\n"
								+ "2.Girar\n"
								+ "3.Consulta saldo\n"
								+ "4.Movimientos recientes\n"
								+ "5.Salir\n");
			op2 = sc.nextInt();
			// mientras op2 sea menor a 1 o op2 mayor 4 me repetira menu cliente
			} while (op2 <1 || op2 >4);
			
			//System.out.println("Intentalo denuevo");
			
		}
			
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

