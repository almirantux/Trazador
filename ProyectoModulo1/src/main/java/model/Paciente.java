package model;

import java.util.List;

public class Paciente extends Persona {
	

	private String estado;
	private String region;
	private String comuna;
	private List<Contacto> contactos;
	private Diagnostico diagnostico;
	
	public Paciente(int id, String rut, String nombre, String apellido, int edad, String estado, String region,
			String comuna, List<Contacto> contactos, Diagnostico diagnostico) {
		super(id, rut, nombre, apellido, edad);
		this.estado = estado;
		this.region = region;
		this.comuna = comuna;
		this.contactos = contactos;
		this.diagnostico = diagnostico;
	}
	
	public Paciente(int id, String rut, String nombre, String apellido, int edad, String estado, String region,
			String comuna, List<Contacto> contactos ) {
		super(id, rut, nombre, apellido, edad);
		this.estado = estado;
		this.region = region;
		this.comuna = comuna;
		this.contactos = contactos;
		
	}
	
	public Paciente(int id, String rut, String nombre, String apellido, int edad, String estado, String region,
			String comuna ) {
		super(id, rut, nombre, apellido, edad);
		this.estado = estado;
		this.region = region;
		this.comuna = comuna;
		
	}

	public Paciente(int id, String rut, String nombre, String apellido, int edad) {
		super(id, rut, nombre, apellido, edad);
	}

	public Paciente() {
		// TODO Esbozo de constructor generado automáticamente
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "Paciente [id= " + super.getId() + ", rut=" + super.getRut() + ", nombre=" + super.getNombre() + 
				", apellido=" + super.getApellido() + ", edad=" + super.getEdad() +  ", estado=" + estado + ", region=" + region +
				", comuna=" + comuna + ", contactos=" + contactos
				+ ", diagnostico=" + diagnostico + "]";
	}
	
	
	

	
}
