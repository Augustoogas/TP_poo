package clases;

public class Medico extends Persona {
	private String areaMedica;
	private String especialidad;
	
	
	public Medico() {}

	

	public Medico(int dni, int telefono, String nombre, String apellido, String correoElectronico,String areaMedica, String especialidad) {
		super(dni, telefono, nombre, apellido, correoElectronico);
		this.areaMedica = areaMedica;
		this.especialidad = especialidad;
		// TODO Auto-generated constructor stub
	}



	
	
	

}
