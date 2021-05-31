package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.primitives.Ints;

import model.Persona;

public class PersonaServiceImp implements PersonaService {

	public void listPersona(List<Persona> personas) {
		//comentar en cuanto no sea explicable
		int size = personas.size();
		for (int i = 0; i < size; i++) {
			System.out.println(personas.get(i));
		}
	}

	public Persona agregarPersona(List<Persona> personas,Persona persona) {
		personas.add(persona);
		return persona;
	}

	public void eliminarPersona(List<Persona> personas, int id) {
		personas.remove(id);
		//revisar
	}

	public Persona modificarPersona(List<Persona> personas,int id) {
		//revisar que campos serán editables
		return null;
	}

	public int siguienteId(List<Persona> personas) {
		List<Integer> ids = new ArrayList<Integer>();
		int nextId;
		for (Persona persona : personas) {
			if(persona.getId()==0) {
				ids.add(0);
			}
			else {
				ids.add(persona.getId());
			}
			
		}
		

		//int otroMax = Collections.max(ids);

		int maximo = ids.size();
		

		return maximo;
	}



}
