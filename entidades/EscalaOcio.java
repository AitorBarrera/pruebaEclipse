package entidades;

public class EscalaOcio extends Escala {
	private Hora horasParada = new Hora("00:00");

	public EscalaOcio(String nombreCiudad, String horaBajada, String horaSubida) {
		super(nombreCiudad, horaBajada, horaSubida);
		horasParada = Hora.diferenciaHora(this.horaBajada, this.horaSubida);
	}
	
	public Hora getHorasParada() {
		return horasParada;
	}
	
	public Hora setHorasParada(Hora tiempo1, Hora tiempo2) {
		return Hora.diferenciaHora(tiempo1, tiempo2);
	}


	@Override
	public String toString() {
		return "\nEscalaOcio [\n  horasParada = " + horasParada + ", \n  nombreCiudad = " + nombreCiudad
				+ ", \n  horaBajada = " + horaBajada + ", \n  horaSubida = " + horaSubida + "]";
	}
}
