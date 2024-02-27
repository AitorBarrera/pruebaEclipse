package entidades;

public class EscalaCultural extends Escala{
	private float precioGuia;

	public EscalaCultural(String nombreCiudad, String horaBajada, String horaSubida, float precioGuia) {
		super(nombreCiudad, horaBajada, horaSubida);
		this.precioGuia = precioGuia;
	}

	public float getPrecioGuia() {
		return precioGuia;
	}

	public void setPrecioGuia(float precioGuia) {
		this.precioGuia = precioGuia;
	}

	@Override
	public String toString() {
		return "\nEscalaCultural [\n  precioGuia = " + precioGuia + " euros, \n  nombreCiudad = " + nombreCiudad
				+ ", \n  horaBajada = " + horaBajada + ", \n  horaSubida = " + horaSubida + "]";
	}
}