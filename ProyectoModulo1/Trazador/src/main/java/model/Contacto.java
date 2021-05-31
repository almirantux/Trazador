package model;

public class Contacto extends Persona {
	

	private String correo;
	private String tipoContacto; //familia, trabajo, otros
	private String nexo; //hermano, padre, .colega, etc
	public Contacto(int id, String rut, String nombre, String apellido, int edad, String correo, String tipoContacto,
			String nexo) {
		super(id, rut, nombre, apellido, edad);
		this.correo = correo;
		this.tipoContacto = tipoContacto;
		this.nexo = nexo;
	}
	
	public Contacto(int id, String rut, String nombre, String apellido, int edad) {
		super(id, rut, nombre, apellido, edad);
	}
	
	public Contacto() {
		super();
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTipoContacto() {
		return tipoContacto;
	}
	public void setTipoContacto(String tipoContacto) {
		this.tipoContacto = tipoContacto;
	}
	public String getNexo() {
		return nexo;
	}
	public void setNexo(String nexo) {
		this.nexo = nexo;
	}
	@Override
	public String toString() {
		return "Contacto [correo=" + correo + ", tipoContacto=" + tipoContacto + ", nexo=" + nexo + "]";
	}
	
	
	
	

}
