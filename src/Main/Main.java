package Main;

import clases.Medico;
import clases.Paciente;
import clases.PersonalAdministrativo;
import clases.Turno;



public class Main {
	public static void main(String[] args) {
		
		Paciente p1=new Paciente(4245717,1123343233,"Ogas","Augusto","Correo@gmail.com",false);
		Medico m1=new Medico(4521585,36945898,"Fernandez","Sergio","sergio@gmail.com","traumatologia","traumatologo");
		Turno t1=new Turno(24052018,1500,m1);
		Turno t2=new Turno(24072023,1530,m1);
		
		
		p1.AgregarTurnos(t1);
		p1.AgregarTurnos(t2);
		p1.verTurnos();
	}
}
