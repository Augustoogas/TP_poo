package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Paciente extends Persona {
	
	private boolean tarjetaCredito;
	
	private ArrayList<Turno> listaTurnos=new ArrayList<Turno>();;
	private int contador=1;
	
	public Paciente() {}
	
	

	public Paciente(int dni, int telefono, String nombre, String apellido, String correoElectronico,boolean tarjetaCredito) {
		super(dni, telefono, nombre, apellido, correoElectronico);
		this.tarjetaCredito = tarjetaCredito;
		// TODO Auto-generated constructor stub
	}



	
		
	
	
	
	
	
	public void AgregarTurnos(Turno t) 
	{
		
		listaTurnos.add(t);
	}
	
	public void verTurnos() {
		
		
		System.out.println("Nombre y apellido:"+this.getNombre() +" "+ this.getApellido() );
		
		
		listaTurnos.forEach((t) -> System.out.println("\n"+"\n"+
		"Fecha:"+t.getFecha()+ "\n" +
		"Hora:"+t.getHora()+"\n"+
		"Nombre medico:"+t.getRefMedico().getNombre()+" "+t.getRefMedico().getApellido()+"\n")  );
		
	}

	
	
}
