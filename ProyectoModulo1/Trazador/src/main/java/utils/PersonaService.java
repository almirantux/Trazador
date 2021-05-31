package utils;

import java.util.List;

import model.Contacto;
import model.Diagnostico;
import model.Persona;

public interface PersonaService {
	void listPersona(List<Persona> personas);
	Persona agregarPersona(List<Persona> personas);
	void eliminarPersona(List<Persona> personas,int id);
	Persona modificarPersona(List<Persona> personas,int id);
	int siguienteId(List<Persona> personas);
	List<Contacto> agregarContactos();
	Diagnostico agregarDiagnosticos();
//	Persona agregarPrimeraPersona(Persona persona); Ojo, este método espero que no sea necesario.
	//La gracia de esta interface es que indico que es lo que hará mi capa de servicio.
	//A medida que necesito agregar métodos, se puede agregar aquí que es lo que se desea hacer.
	//En la clase PersonaServiceImp, se indica el cómo realizo la acción indicada aquí.
	
}
