package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;
import utils.PersonaService;
import utils.PersonaServiceImp;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonaServiceImp svc = new PersonaServiceImp();
		
		//Lista de personas
		List<Persona> personas = new ArrayList<Persona>();
		Persona persona = new Persona();
		personas.add(persona);
		
		int opcion = 0;
		while(opcion != 6) {
			menuPrincipal();
			
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("Ruta 1");
				System.out.println("Ingrese id: ");
				int id = sc.nextInt(); //blablabla
			}
			else if (opcion == 2) {
				System.out.println("Ruta 2");
				System.out.println("Se presentarán los datos: ");
				svc.listPersona(personas);
				svc.siguienteId(personas);
			}
		}
		


	}
	
	public static void menuPrincipal() {
		String menu = "1) Registro de pacientes\r\n" + 
				"2) Listar datos \r\n" + 
				"3) Editar datos paciente\r\n" + 
				"4) Trazabilidad general\r\n" + 
				"5) Generación de certificado \r\n" +
				"6) Salir \r\n";
		System.out.println(menu);
	}
	public static Paciente crearPaciente(int id, String rut, String nombre, String apellido, int edad, String estado, String region, String comuna, List<Contacto> contactos, Diagnostico diagnostico) {
		Paciente paciente = new Paciente();
		paciente.setId(id);
		paciente.setRut(rut);
		paciente.setNombre(nombre);
		paciente.setApellido(apellido);
		paciente.setEdad(edad);
		paciente.setEstado(estado);
		paciente.setRegion(region);
		paciente.setComuna(comuna);
		paciente.setContactos(contactos);
		paciente.setDiagnostico(diagnostico);
		System.out.println("Se ha creado el paciente: " + paciente.toString());
		return paciente;
	}
	public static void listar(List<Persona> personas) {
		for (int i = 0; i< personas.size(); i++) {
			System.out.println(personas.get(i).toString());
		}
	}
}
//objetivo general, específicos, procesos, más de un rol
//alcance del proyecto, 'que se espera lograr'.
//planificación Gantt
