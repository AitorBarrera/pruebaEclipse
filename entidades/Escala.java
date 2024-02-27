package entidades;

public class Escala {
	protected String nombreCiudad;
	protected Hora horaBajada;
	protected Hora horaSubida;
	
	public Escala(String nombreCiudad, String horaBajada, String horaSubida) {
		this.nombreCiudad = nombreCiudad;
		this.horaBajada = new Hora(horaBajada);
		this.horaSubida = new Hora(horaSubida);
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public Hora getHoraBajada() {
		return horaBajada;
	}

	public void setHoraBajada(String horaBajada) {
		this.horaBajada = new Hora(horaBajada);
	}

	public Hora getHoraSubida() {
		return horaSubida;
	}

	public void setHoraSubida(String horaSubida) {
		this.horaSubida = new Hora(horaSubida);
	}

	@Override
	public String toString() {
		return "\nEscala [\n  nombreCiudad = " + nombreCiudad + ", \n  horaBajada = " + horaBajada
				+ ", \n  horaSubida = " + horaSubida + "]";
	}
}
