package ejercicioNumerosPares;

public class EjercicioNumerosPares {

	/**
	 * Los operadores lógicos se utilizan para combinar valores booleanos y nos devuelven un 
	 * resultado evrdadero, falso o nulo
	 * 
	 * && --> and (Y)
	 * || --> or (O)	(el caracter sale con alt+124
	 *  ! --> not (No)
	 */
	
	int a = 5;
	int b = 3;
	
	System.out.println("and: " + ((a == b) && (a > b)));
	System.out.println("or con not: " + (!(a == b) && (a > b)));
	System.out.println("or: " + ((a == b) || (a > b)));
	
	int numEvaluar = 115;
	
	if(numEvaluar % 2 == 0) {
		System.out.println("El numero ingresado: " + numEvaluar + " es par");
	} else {
		System.out.println("El numero ingresado: " + numEvaluar + " es impar");
	}
	
//	int numEvaluar2 = 100;
//	
//	if(numEvaluar % 2 != 0) {
//		System.out.println("El numero ingresado: " + numEvaluar + " es impar");
//	} else {
//		System.out.println("El numero ingresado: " + numEvaluar + " es par");
//	}

}

}
	
	
	
	

