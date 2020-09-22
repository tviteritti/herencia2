
public class Futbolista extends Persona {

	private int dorsal;
	private String posicion;
	
	public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
		super(nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}
	
	
	public int getDorsal() {
		return dorsal;
	}

	public String getPosicion() {
		return posicion;
	}


	@Override
	public String toString() {
		return "Datos del Futbolista ["+super.toString() +"\ndorsal=" + dorsal + "\nposicion=" + posicion + "]";
	}
	
	
	
}
