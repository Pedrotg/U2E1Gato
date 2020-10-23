package Main;

import java.util.Scanner;

public class Gato {
	
	boolean primerJugador = true, ganador = false;
	
	int posicion;
	
	Scanner leer = new Scanner (System.in);
	
	//Constructor
	public Gato() {
		
		int arreglo[] = {0,0,0,
						 0,0,0,
						 0,0,0};
		
		comienza(arreglo);
	}

	/*
	 * 0.- Mostrar el arreglo
	 * 
	 * 1.- verificar si es jugador 1 o jugador 2
	 * 
	 * 2.- pedir el dato
	 * 
	 * 3.- verificar si existe dato en la posición seleccionada
	 * 3.1.- Si está seleccionada, repetir paso 2
	 * 
	 * 4.- Si está libre, sustituir por nuevo valor
	 * 
	 * 5.- Verificar si el jugador X a ganado
	 * 5.1.- Muestra el mensaje de ganador y salir
	 * 
	 * 6.- Cambiar de turno
	 * 
	 * 7.- Volver a mandar el arreglo actualizado
	 */
	
	private void comienza(int[] arreglo) {
		
		//Paso 0
		System.out.println("*****Arreglo Inicial*****");
		for (int i = 0; i < arreglo.length; i++) {
			if(i == 3 || i == 6)
				System.out.print("\n"+arreglo[i]);
			else
				System.out.print(arreglo[i]);
		}
		
		System.out.println("");
		
		//Paso 1
		if(primerJugador) {
		
			//Paso 2
			System.out.println("Jugador 1, dame la posición 0-8");
			posicion = leer.nextInt();
			
			//Paso 3
			if(arreglo[posicion] == 0) {
				
				//Paso 4
				arreglo[posicion] = 1;
			
				ganador = verificaGanador(arreglo);
				
				if(!ganador) {
					
					//Paso 6
					primerJugador = false;
					
					//Paso 7
					comienza(arreglo);
				}
			
			}else { //Paso 3.1
				System.out.println("Casilla ya ocupada, selecciona otra posición");
				comienza(arreglo);
			}
			
		}else {
			
			//Paso 2
			System.out.println("Jugador 2, dame la posición 0-8");
			posicion = leer.nextInt();
			
			//Paso 3
			if(arreglo[posicion] == 0) {
				
				//Paso 4
				arreglo[posicion] = 2;
			
				ganador = verificaGanador(arreglo);
				
				if(!ganador) {
					
					//Paso 6
					primerJugador = true;
					
					//Paso 7
					comienza(arreglo);
				}
			
			}else { //Paso 3.1
				System.out.println("Casilla ya ocupada, selecciona otra posición");
				comienza(arreglo);
			}
		}
	}

	//Puntos 5 y 5.1
	private boolean verificaGanador(int[] arreglo) {
		
		//Verificar si es jugador 1 ó jugador 2 
		if(primerJugador) {
			
			if(arreglo[0] == 1 && arreglo[1] == 1 && arreglo[2] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[3] == 1 && arreglo[4] == 1 && arreglo[5] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[6] == 1 && arreglo[7] == 1 && arreglo[8] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[0] == 1 && arreglo[3] == 1 && arreglo[6] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[1] == 1 && arreglo[4] == 1 && arreglo[7] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[2] == 1 && arreglo[5] == 1 && arreglo[8] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[0] == 1 && arreglo[4] == 1 && arreglo[8] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}else if(arreglo[2] == 1 && arreglo[4] == 1 && arreglo[6] == 1) {
				System.out.println("Jugador 1, haz ganado");
				ganador = true;
			}
			
		}else {
			
			if(arreglo[0] == 2 && arreglo[1] == 2 && arreglo[2] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[3] == 2 && arreglo[4] == 2 && arreglo[5] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[6] == 2 && arreglo[7] == 2 && arreglo[8] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[0] == 2 && arreglo[3] == 2 && arreglo[6] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[1] == 2 && arreglo[4] == 2 && arreglo[7] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[2] == 2 && arreglo[5] == 2 && arreglo[8] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[0] == 2 && arreglo[4] == 2 && arreglo[8] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}else if(arreglo[2] == 2 && arreglo[4] == 2 && arreglo[6] == 2) {
				System.out.println("Jugador 2, haz ganado");
				ganador = true;
			}
		}
		
		return ganador;
	}
}
