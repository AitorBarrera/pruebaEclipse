package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Crucero {
	protected int codigo;
	protected String nombreComercial;
	protected String nombreBarco;
	protected Date fechaPartida;
	protected Date fechaRegreso;
	protected ArrayList<Escala> listaEscalas;
	
	public Crucero(int codigo, String nombreComercial, String nombreBarco) {
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = new Date();
		this.fechaRegreso = new Date();
		listaEscalas = new ArrayList<Escala>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public Date getFechaSalida() {
		return fechaPartida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaPartida = fechaSalida;
	}

	public Date getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(Date fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public ArrayList<Escala> getListaEscalas() {
		return listaEscalas;
	}

	public void setListaEscalas(Escala escala) {
		listaEscalas.add(escala);
	}
	
	public float coste() {
		float costeFinal = 0f;
		
		for (Escala escalaActual : listaEscalas) {
			costeFinal += 600f;
			
			if (escalaActual instanceof EscalaOcio)
				costeFinal += 100f;
			
			if (escalaActual instanceof EscalaCultural)
				costeFinal += 100f + ((EscalaCultural) escalaActual).getPrecioGuia();
		}
		
		return costeFinal;
	}
		
	@Override
	public String toString() {
		return "\nCrucero [\n  codigo = " + codigo + ", \n  nombreComercial = " + nombreComercial
				+ ", \n  nombreBarco = " + nombreBarco + ", \n  fechaSalida = " + fechaPartida + ", \n  fechaRegreso = "
				+ fechaRegreso + ", \n  listaEscalas = " + listaEscalas + "]";
	}

	

}
