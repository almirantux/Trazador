package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.google.common.primitives.Ints;

import model.Contacto;
import model.Diagnostico;
import model.Paciente;
import model.Persona;

public class PersonaServiceImp implements PersonaService {

	public void listPersona(List<Persona> personas) {
		// comentar en cuanto no sea explicable

		int size = personas.size();
		if (size == 0) {
			System.out.println("----Aún no existen registros----");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(personas.get(i)); // Puede quedar mejor estilizado.
			}
		}
	}

	public Persona agregarPersona(List<Persona> personas) {
		Scanner scan = new Scanner(System.in);
		Paciente paciente = new Paciente();
		int id = siguienteId(personas);
		paciente.setId(id);

		System.out.print("Ingrese rut: ");
		String rut = scan.next();
		paciente.setRut(rut);

		System.out.print("Ingrese nombre/s: ");
		String nombre = scan.next();
		paciente.setNombre(nombre);

		System.out.print("Ingrese apellido/s: ");
		String apellido = scan.next();
		paciente.setApellido(apellido);

		System.out.print("Ingrese edad: ");
		int edad = scan.nextInt();
		paciente.setEdad(edad);

		System.out.print("Ingrese estado: ");
		String estado = scan.next();
		paciente.setEstado(estado);

		System.out.print("Ingrese región: ");
		String region = scan.next();
		paciente.setRegion(region);

		System.out.print("Ingrese comuna de residencia: ");
		String comuna = scan.next();
		paciente.setComuna(comuna);

		paciente.setContactos(agregarContactos());
		paciente.setDiagnostico(agregarDiagnosticos());
//		paciente.setContactos(contactos);
//		paciente.setDiagnostico(diagnostico);
		System.out.println("Se ha creado el paciente: " + paciente.toString());
		personas.add(paciente);
		return paciente;
//probar método de crear paciente.
	}

	public List<Contacto> agregarContactos() {
		Scanner scan = new Scanner(System.in);
		List<Contacto> contactos = new ArrayList<Contacto>();
		String opcion = "I";
		System.out.println("Ingrese Y/S para ingresar usuario, N para terminar: ");
		opcion = scan.next();
		while ((opcion.equals("Y") || opcion.equals("y") || opcion.equals("I"))
				&& !(opcion.equals("n") || opcion.equals("N"))) {

			Contacto contacto = new Contacto();
			System.out.print("Ingrese rut: ");
			String rut = scan.next();
			System.out.print("Ingrese nombre: ");
			String nombre = scan.next();
			System.out.print("Ingrese apellido: ");
			String apellido = scan.next();
			System.out.print("Ingrese edad: ");
			int edad = scan.nextInt();
			System.out.print("Ingrese correo: ");
			String correo = scan.next();
			System.out.print("Ingrese el tipo de contacto: ");
			String tipoContacto = scan.next();
			System.out.print("Ingrese el nexo con el contacto: ");
			String nexo = scan.next();
			contacto.setId(siguienteIdContactos(contactos)); // corregir
			contacto.setRut(rut);
			contacto.setNombre(nombre);
			contacto.setApellido(apellido);
			contacto.setEdad(edad);
			contacto.setCorreo(correo);
			contacto.setTipoContacto(tipoContacto);
			contacto.setNexo(nexo);
			contactos.add(contacto);
			System.out.println("Ingrese Y/S para ingresar usuario, N para terminar: ");
			opcion = scan.next();
		}
		return contactos;
	}

	public void eliminarPersona(List<Persona> personas, int id) {
		personas.remove(id);
		// revisar caso de borde donde la id no existe.
	}

	public Persona modificarPersona(List<Persona> personas, int id) {
		// revisar que campos serán editables
		return null;
	}

	public int siguienteId(List<Persona> personas) {
		List<Integer> ids = new ArrayList<Integer>();
		if (personas.size() == 0) {
			return 0;
		} else {

			for (Persona persona : personas) {
				if (persona.getId() == 0) {
					ids.add(0);
				} else {
					ids.add(persona.getId());
				}
			}
			int otroMax = Collections.max(ids).intValue() + 1;
			System.out.println(otroMax);
			int maximo = ids.size();
			if (maximo > otroMax) {
				return maximo;
			} else {
				return otroMax;
			}
		}
	}

	public int siguienteIdContactos(List<Contacto> contactos) {
		List<Integer> ids = new ArrayList<Integer>();
		if (contactos.size() == 0) {
			return 0;
		} else {

			for (Contacto contacto : contactos) {
				if (contacto.getId() == 0) {
					ids.add(0);
				} else {
					ids.add(contacto.getId());
				}
			}
			int otroMax = Collections.max(ids).intValue() + 1;
			System.out.println(otroMax);
			int maximo = ids.size();
			if (maximo > otroMax) {
				return maximo;
			} else {
				return otroMax;
			}
		}
	}

	public Diagnostico agregarDiagnosticos() {
		Scanner sc = new Scanner(System.in);
		Diagnostico diag = new Diagnostico();
		String respuesta = "I";
		while (!respuesta.equals("Y") || respuesta.equals("y") || respuesta.equals("n") || respuesta.equals("N")) {
			System.out.print("Indique con Y para PCR positivo, N para PCR negativo: ");
			respuesta = sc.next();
			if (respuesta.equals("Y") || respuesta.equals("y")) {
				diag.setPreviousPCR(true);
			} else if (respuesta.equals("N") || respuesta.equals("n")) {
				diag.setPreviousPCR(false);
			}
		}
		System.out.print("Indique, en días, la duración aproximada de sus síntomas: ");
		int duracionSintomas = sc.nextInt();
		diag.setDuracionSintomas(duracionSintomas);

		String res = "I";
		while (!res.equals("Y") || res.equals("y") || res.equals("n") || res.equals("N")) {
			System.out.println("¿Se le ha indicado COVID positivo? Y/N: ");
			res = sc.next();
			if (res.equals("Y") || res.equals("y")) {
				diag.setEnfermedadStatus(true);
			} else if (res.equals("N") || res.equals("n")) {
				diag.setEnfermedadStatus(false);
			}
		}
		diag.setSospecha("CAMBIAME");
		diag.setMedidas("CAMBIAR2");

		return diag;
	}

}
