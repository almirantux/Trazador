package pruebaAvanceTest;

//import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import model.Paciente;
import net.glxn.qrgen.javase.QRCode;
import service.PersonaServiceImp;

public class PersonaTest {
	
	@Test
	public void testOne() throws IOException {
		Paciente sujetoOne = new Paciente();
		Paciente sujetoTwo = new Paciente(0, "a", "name", "lastname", 21);
		List<Paciente> personas = new ArrayList<Paciente>(Arrays.asList(sujetoOne,sujetoTwo));
		File copia = new File("src/test/resources/copiedWithApacheCommons.png");
		File file = QRCode.from(personas.get(0).toString()).file();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		FileUtils.copyFile(file, copia);
		String pos = QRCode.from(personas.get(0).toString()).file().getAbsolutePath();
		System.out.println(pos);
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
