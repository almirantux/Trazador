package pruebaAvanceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import model.Persona;
import utils.PersonaServiceImp;

public class PersonaTest {
	
	@Test
	public void testOne() {
		Persona sujetoOne = new Persona();
		Persona sujetoTwo = new Persona(0, "a", "name", "lastname", 21);
		List<Persona> personas = new ArrayList<Persona>(Arrays.asList(sujetoOne,sujetoTwo));
		Assert.assertEquals(2, personas.size());
		
	}
	
	@Test
	public void testNextIdSameValues() {
		PersonaServiceImp svc = new PersonaServiceImp();
		Persona sujetoOne = new Persona();
		Persona sujetoTwo = new Persona(0, "a", "name", "lastname", 21);
		List<Persona> personas = new ArrayList<Persona>(Arrays.asList(sujetoOne,sujetoTwo));
		System.out.println("size:" + personas.size());
		System.out.println();
		Assert.assertEquals(2, svc.siguienteId(personas));
	}
	
	@Test
	public void testNextIdNotExistentValues() {
		PersonaServiceImp svc = new PersonaServiceImp();
		Persona sujetoOne = new Persona();
		Persona sujetoTwo = new Persona(10, "a", "name", "lastname", 21);
		List<Persona> personas = new ArrayList<Persona>(Arrays.asList(sujetoOne,sujetoTwo));
		System.out.println("size:" + personas.size());
		System.out.println();
		Assert.assertEquals(11, svc.siguienteId(personas));
	}

}
