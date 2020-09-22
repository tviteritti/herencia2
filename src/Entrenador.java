
public class Entrenador extends Persona{
	private String formacion;

	public Entrenador(String nombre, String apellido, int edad, String formacion) {
		super(nombre, apellido, edad);
		this.formacion = formacion;
	}

	public String getFormacion() {
		return formacion;
	}

	@Override
	public String toString() {
		return "Datos del Entrenador ["+super.toString()+"\nformacion=" + formacion + "]";
	}



}
