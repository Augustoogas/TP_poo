package clases;

public class Persona {
	private int dni;
	private int telefono;
	private String nombre;
	private String apellido;
	private String correoElectronico;

	
	
	public Persona() {}



	public Persona(int dni, int telefono, String nombre, String apellido, String correoElectronico) {
		this.dni = dni;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCorreoElectronico() {
		return correoElectronico;
	}



	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
		
	
	
	
}
