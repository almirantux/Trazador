package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;
import service.PersonaServiceImp;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PersonaServiceImp svc = new PersonaServiceImp();
		List<Paciente> pacientes = new ArrayList<Paciente>();
		// Inicialización de Scanner, clase servicio y listado de personas.
//		System.out.println(personas.size());
//		System.out.println("Siguiente" + svc.siguienteId(personas));
		Paciente paciente = new Paciente();
		pacientes.add(paciente);

		
		
		
		int opcion = 0;
		System.out.println("Bienvenido/a a Traza COVID\nSelecciona una de las siguientes opciones: ");
		while(opcion != 8) {
			menuPrincipal();
			
			opcion = sc.nextInt();
			if (opcion == 1) {
				svc.agregarPersona(pacientes);
			}
			else if (opcion == 2) {
				svc.listPersona(pacientes);
			}
			else if (opcion == 3) {
				System.out.print("Ingrese id: ");
				svc.getOne(pacientes, sc.nextInt());
			}
			else if (opcion == 4) {
				System.out.print("Ingrese id: ");
				svc.eliminarPersona(pacientes, sc.nextInt());
			}
			else if (opcion == 5) {
				System.out.print("Ingrese id: ");
				svc.modificarPersona(pacientes, sc.nextInt());
			}
			else if (opcion == 6) {
				System.out.println("Implementar (tomar todos los datos)");
			}
			else if (opcion == 7) {
				System.out.print("Ingrese id: ");
				svc.getQRData(pacientes, sc.nextInt());
			}
		}
		System.out.println("Fin del programa");
		


	}
	
	public static void menuPrincipal() {
		String menu = "______________________________________\n"+"|1) Registro de pacientes             |\r\n" + 
				"|2) Listar todos los datos            |\r\n" + 
				"|3) Obtener datos paciente dados      |\r\n" + 
				"|4) Eliminar paciente                 |\r\n" + 
				"|5) Editar datos paciente             |\r\n" + 
				"|6) Trazabilidad general              |\r\n" + 
				"|7) Generación de certificado         |\r\n" +
				"|8) Salir                             |" + "\n|_____________________________________|\n\nOpcion: ";
		System.out.print(menu);
	}
//	public static Paciente crearPaciente(int id, String rut, String nombre, String apellido, int edad, String estado, String region, String comuna, List<Contacto> contactos, Diagnostico diagnostico) {
//		Paciente paciente = new Paciente();
//		paciente.setId(id);
//		paciente.setRut(rut);
//		paciente.setNombre(nombre);
//		paciente.setApellido(apellido);
//		paciente.setEdad(edad);
//		paciente.setEstado(estado);
//		paciente.setRegion(region);
//		paciente.setComuna(comuna);
//		paciente.setContactos(contactos);
//		paciente.setDiagnostico(diagnostico);
//		System.out.println("Se ha creado el paciente: " + paciente.toString());
//		return paciente;
//	}
//	public static void listar(List<Persona> personas) {
//		for (int i = 0; i< personas.size(); i++) {
//			System.out.println(personas.get(i).toString());
//		}
//	}
}
//objetivo general, específicos, procesos, más de un rol
//alcance del proyecto, 'que se espera lograr'.
//planificación Gantt
