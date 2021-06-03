package pruebaAvanceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import model.Paciente;
import utils.PersonaServiceImp;

public class PersonaTest {
	
	@Test
	public void testOne() {
		Paciente sujetoOne = new Paciente();
		Paciente sujetoTwo = new Paciente(0, "a", "name", "lastname", 21);
		List<Paciente> personas = new ArrayList<Paciente>(Arrays.asList(sujetoOne,sujetoTwo));
		Assert.assertEquals(2, personas.size());
		
	}
	
	@Test
	public void testNextIdSameValues() {
		PersonaServiceImp svc = new PersonaServiceImp();
		Paciente sujetoOne = new Paciente();
		Paciente sujetoTwo = new Paciente(0, "a", "name", "lastname", 21);
		List<Paciente> personas = new ArrayList<Paciente>(Arrays.asList(sujetoOne,sujetoTwo));
		System.out.println("size:" + personas.size());
		System.out.println();
		Assert.assertEquals(2, svc.siguienteId(personas));
	}
	
	@Test
	public void testNextIdNotExistentValues() {
		PersonaServiceImp svc = new PersonaServiceImp();
		Paciente sujetoOne = new Paciente();
		Paciente sujetoTwo = new Paciente(10, "a", "name", "lastname", 21);
		List<Paciente> personas = new ArrayList<Paciente>(Arrays.asList(sujetoOne,sujetoTwo));
		System.out.println("size:" + personas.size());
		System.out.println();
		Assert.assertEquals(11, svc.siguienteId(personas));
	}

}
