import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static Scanner teclado =new Scanner(System.in);  
		
	public static void main(String[] args) {
		
		int opcion=0;
		
		do {
		System.out.println("1-viaje de equipo ");
		System.out.println("2-entrenamiento ");
		System.out.println("3-partido de futbol");
		System.out.println("4-planificar entrenamiento");
		System.out.println("5-entrevista");
		System.out.println("6-curar lesion");
		System.out.println("0-Salir");
		System.out.print("opcion a ejecutar:");
		
		opcion=teclado.nextInt();
		switch (opcion) {
		case 1:
			viajeDeEquipo();
			break;
		case 2:
			entrenar();
			break;
		case 3:
			partido();
			break;
		case 4:
			planificarEntrenamiento();
			break;
		case 5:
			entrevista();
			break;
		case 6:
			curarLecion();
			break;
		case 0:
			break;

		default:
			System.out.println("intentelo nuevamente");
			break;
		}
		}while(opcion!=0);
		

	}
	public static void viajeDeEquipo(){
		System.out.println("Donde sera el viaje");
		String lugar=teclado.next();
		System.out.println("El equipo viajara a "+lugar);
		
		
	}
	public static void entrenar(){
		System.out.println("nombre del entrenador");
		String nombre = teclado.next();
		System.out.println("apellido del entrenador");
		String apellido = teclado.next();
		System.out.println("edad del entrenador");
		int edad = teclado.nextInt();
		System.out.println("formacion del entrenador");
		String formacion = teclado.next();
		
		Entrenador e=new Entrenador(nombre, apellido, edad, formacion);
		
		System.out.println(e.getNombre()+" "+e.getApellido()+"el entrenador de "+e.getEdad()+", entreno hoy con su equipo con una formacion:"+e.getFormacion());
		
		
	}
	public static void partido(){
		System.out.println("equipo");
		String equipo1 = teclado.next();
		System.out.println("rival");
		String equipo2 = teclado.next();
		
		System.out.println(equipo1+" "+(int)Math.random()*7+"-"+(int)Math.random()*7+" "+equipo2 );
		
	}
	public static void planificarEntrenamiento(){
		System.out.println("Dia");
		int dia = teclado.nextInt();
		System.out.println("Mes");
		String mes = teclado.next();
		
		System.out.println("habra un entrenamiento el: "+dia+" de "+mes);
		
	}	
	public static void entrevista(){
		System.out.println("nombre del jugador");
		String nombre = teclado.next();
		System.out.println("apellido del jugador");
		String apellido = teclado.next();
		System.out.println("edad del jugador");
		int edad = teclado.nextInt();
		System.out.println("dorsal del jugador");
		int dorsal = teclado.nextInt();
		System.out.println("posicion del jugador");
		String posicion = teclado.next();
		
		Futbolista f =new Futbolista(nombre, apellido, edad, dorsal, posicion);
		
		System.out.println("El "+f.getPosicion()+ ", "+f.getNombre()+" "+f.getApellido()+" Dara una entrevista");
		
		
	}	
	public static void curarLecion(){
		System.out.println("nombre del doctor");
		String nombre = teclado.next();
		System.out.println("apellido del doctor");
		String apellido = teclado.next();
		System.out.println("edad del doctor");
		int edad = teclado.nextInt();
		System.out.println("titulacion del doctor");
		String titulacion = teclado.next();
		System.out.println("experiencia del doctor");
		int experiencia = teclado.nextInt();
		
		Doctor d =new Doctor(nombre, apellido, edad, titulacion, experiencia);
		
		System.out.println("El doctor "+d.getApellido()+", Con una experiencia de "+d.getExperiencia()+" se encargara de la recuperacion del jugador");
		
	}
}
