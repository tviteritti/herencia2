
public class Doctor extends Persona{

	private String titulacion;
	private int experiencia;
		
	public Doctor(String nombre, String apellido, int edad, String titulacion, int experiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.experiencia = experiencia;
	}


	public String getTitulacion() {
		return titulacion;
	}


	public int getExperiencia() {
		return experiencia;
	}


	@Override
	public String toString() {
		return "Doctor [titulacion=" + titulacion + ", experiencia=" + experiencia + "]";
	}
		
			
			
	}

