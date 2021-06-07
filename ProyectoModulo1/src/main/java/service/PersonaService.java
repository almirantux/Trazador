package service;

import java.io.IOException;
import java.util.List;

import model.Contacto;
import model.Diagnostico;
import model.Paciente;

public interface PersonaService {
	void listPersona(List<Paciente> pacientes);
	Paciente agregarPersona(List<Paciente> pacientes);
	Paciente getOne(List<Paciente>pacientes, int id);
	void eliminarPersona(List<Paciente> pacientes,int id);
	void modificarPersona(List<Paciente> pacientes,int id);
	int siguienteId(List<Paciente> pacientes);
	List<Contacto> agregarContactos();
	Diagnostico agregarDiagnosticos();
	void getQRData(List<Paciente> pacientes, int id) throws IOException;
//	Paciente agregarPrimeraPersona(Paciente Paciente); Ojo, este método espero que no sea necesario.
	//La gracia de esta interface es que indico que es lo que hará mi capa de servicio.
	//A medida que necesito agregar métodos, se puede agregar aquí que es lo que se desea hacer.
	//En la clase PersonaServiceImp, se indica el cómo realizo la acción indicada aquí.
	
}
