package model;

public class Contacto  {
	
	private int idContacto;
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String tipoContacto; //familia, trabajo, otros
	private String nexo; //hermano, padre, .colega, etc
	
	public Contacto(int idContacto, String rut, String nombre, String apellido, String correo, String tipoContacto,
			String nexo) {
		super();
		this.idContacto = idContacto;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.tipoContacto = tipoContacto;
		this.nexo = nexo;
	}

	public Contacto() {
		super();
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	
	

}
