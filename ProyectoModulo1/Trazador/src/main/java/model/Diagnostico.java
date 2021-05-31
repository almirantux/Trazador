package model;

public class Diagnostico {
	
	private boolean previousPCR;
	private int duracionSintomas;
	private boolean enfermedadStatus;
	private String sospecha;
	private String medidas;
	
	public Diagnostico(boolean previousPCR, int duracionSintomas, boolean enfermedadStatus, String sospecha,
			String medidas) {
		super();
		this.previousPCR = previousPCR;
		this.duracionSintomas = duracionSintomas;
		this.enfermedadStatus = enfermedadStatus;
		this.sospecha = sospecha;
		this.medidas = medidas;
	}
	public Diagnostico() {
		super();
	}
	public boolean isPreviousPCR() {
		return previousPCR;
	}
	public void setPreviousPCR(boolean previousPCR) {
		this.previousPCR = previousPCR;
	}
	public int getDuracionSintomas() {
		return duracionSintomas;
	}
	public void setDuracionSintomas(int duracionSintomas) {
		this.duracionSintomas = duracionSintomas;
	}
	public boolean isEnfermedadStatus() {
		return enfermedadStatus;
	}
	public void setEnfermedadStatus(boolean enfermedadStatus) {
		this.enfermedadStatus = enfermedadStatus;
	}
	public String getSospecha() {
		return sospecha;
	}
	public void setSospecha(String sospecha) {
		this.sospecha = sospecha;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}
	@Override
	public String toString() {
		return "Diagnostico [previousPCR=" + previousPCR + ", duracionSintomas=" + duracionSintomas
				+ ", enfermedadStatus=" + enfermedadStatus + ", sospecha=" + sospecha + ", medidas=" + medidas + "]";
	}
	
	

}
