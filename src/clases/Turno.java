package clases;

public class Turno {
	private int fecha;
	private int hora;
	private Medico refMedico;
	
	public Turno() {
		super();
	}

	public Turno(int fecha, int hora, Medico refMedico) {
		this.fecha = fecha;
		this.hora = hora;
		this.refMedico = refMedico;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Medico getRefMedico() {
		return refMedico;
	}

	public void setRefMedico(Medico refMedico) {
		this.refMedico = refMedico;
	}
	
	
	
	
}
