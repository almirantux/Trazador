package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.google.common.primitives.Ints;

import model.Contacto;
import model.Diagnostico;
import model.Paciente;
import model.Paciente;

public class PersonaServiceImp implements PersonaService {

	public void listPersona(List<Paciente> pacientes) {
		// comentar en cuanto no sea explicable

		int size = pacientes.size();
		if (size == 0) {
			System.out.println("----Aún no existen registros----");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(pacientes.get(i)); // Puede quedar mejor estilizado.
			}
		}
	}

	public Paciente agregarPersona(List<Paciente> pacientes) {
		Scanner scan = new Scanner(System.in);
		Scanner numberScan = new Scanner(System.in);
		Paciente paciente = new Paciente();
		int id = siguienteId(pacientes);
		paciente.setId(id);

		System.out.print("Ingrese rut: ");
		String rut = scan.nextLine();
		paciente.setRut(rut);

		System.out.print("Ingrese nombre/s: ");
		String nombre = scan.nextLine();
		paciente.setNombre(nombre);

		System.out.print("Ingrese apellido/s: ");
		String apellido = scan.nextLine();
		paciente.setApellido(apellido);

		System.out.print("Ingrese edad: ");
		int edad = numberScan.nextInt();
		paciente.setEdad(edad);

		System.out.print("Ingrese estado: ");
		String estado = scan.nextLine();
		paciente.setEstado(estado);

		System.out.print("Ingrese región: ");
		String region = scan.nextLine();
		paciente.setRegion(region);

		System.out.print("Ingrese comuna de residencia: ");
		String comuna = scan.nextLine();
		paciente.setComuna(comuna);

		paciente.setContactos(agregarContactos());
		paciente.setDiagnostico(agregarDiagnosticos());
//		paciente.setContactos(contactos);
//		paciente.setDiagnostico(diagnostico);
		System.out.println("Se ha creado el paciente: " + paciente.toString());
		pacientes.add(paciente);
		return paciente;
//probar método de crear paciente.
	}

	public List<Contacto> agregarContactos() {
		Scanner scan = new Scanner(System.in);
		List<Contacto> contactos = new ArrayList<Contacto>();
		String opcion = "I";
		System.out.println("Ingrese Y/S para ingresar contacto/s, N para terminar: ");
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

	public void eliminarPersona(List<Paciente> pacientes, int id) {

		for (int i = 0; i < pacientes.size(); i++) {
			if (pacientes.get(i).getId() == id) {
				pacientes.remove(i);
				System.out.println("Paciente eliminado/a.");
				return;
			}
		}
		List<Integer> ids = new ArrayList<Integer>();
		for (int j = 0; j < pacientes.size(); j ++) {
			ids.add(pacientes.get(j).getId());
		}
		System.out.println("No se ha encontrado el registro. Intenta con la/s siguiente/s id: "  + ids.stream().map(i -> i.toString()).collect(Collectors.joining(",")));
		// revisar caso de borde donde la id no existe.
	}

	public void modificarPersona(List<Paciente> pacientes, int id) {
		Scanner scan = new Scanner(System.in);
		Scanner numberScan = new Scanner(System.in);
		for (int i = 0; i < pacientes.size(); i++) {
			if (pacientes.get(i).getId() == id) {
				System.out.print("¿Desea cambiar rut? Actual: " + pacientes.get(i).getRut()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique RUT: ");
					pacientes.get(i).setRut(scan.nextLine());
				System.out.print("¿Desea cambiar nombre? Actual: " + pacientes.get(i).getNombre()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique nombre: ");
					pacientes.get(i).setNombre(scan.nextLine());
				}
				System.out.print("¿Desea cambiar apellidos? Actual: " + pacientes.get(i).getApellido()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique apellidos: ");
					pacientes.get(i).setApellido(scan.nextLine());
				}
				System.out.print("¿Desea cambiar edad? Actual: " + pacientes.get(i).getEdad()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique edad: ");
					pacientes.get(i).setEdad(numberScan.nextInt());
				}
				System.out.print("¿Desea cambiar estado? Actual: " + pacientes.get(i).getEstado()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique estado: ");
					pacientes.get(i).setEstado(scan.nextLine());
				}
				System.out.print("¿Desea cambiar región? Actual: " + pacientes.get(i).getRegion()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique región: ");
					pacientes.get(i).setRegion(scan.nextLine());
				}
				System.out.print("¿Desea cambiar comuna? Actual: " + pacientes.get(i).getComuna()  +  " Y/N ");
				if (scan.nextLine().equals("Y") || scan.nextLine().equals("y")) {
					System.out.print("Indique comuna: ");
					pacientes.get(i).setComuna(scan.nextLine());
				}
//				System.out.println("¿Desea cambiar estado? Actual: " + pacientes.get(i).getEstado()  +  " Y/N ");
//				if (sc.next().equals("Y") || sc.next().equals("y")) {
//					pacientes.get(i).setEstado(sc.next());
//				}
				
					
				}
			}
		}


	}

	public int siguienteId(List<Paciente> pacientes) {
		List<Integer> ids = new ArrayList<Integer>();
		if (pacientes.size() == 0) {
			return 0;
		} else {

			for (Paciente Paciente : pacientes) {
				if (Paciente.getId() == 0) {
					ids.add(0);
				} else {
					ids.add(Paciente.getId());
				}
			}
			int otroMax = Collections.max(ids).intValue() + 1;
//			System.out.println(otroMax);
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
//			System.out.println(otroMax);
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

	public Paciente getOne(List<Paciente> pacientes, int id) {
		for (int i = 0; i < pacientes.size(); i ++) {
			if (pacientes.get(i).getId() == id) {
				System.out.println("--Registro encontrado--");
				System.out.println(pacientes.get(i));
				return pacientes.get(i);
			}
		}
		List<Integer> ids = new ArrayList<Integer>();
		for (int j = 0; j < pacientes.size(); j ++) {
			ids.add(pacientes.get(j).getId());
		}
		System.out.println("No se ha encontrado el usuario, intenta con la/s siguiente/s id: " + ids.stream().map(i -> i.toString()).collect(Collectors.joining(",")));
		return null;
	}

}
