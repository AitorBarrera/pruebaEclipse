package entidades;

public class Hora {
	private int soloHora;
	private int soloMinutos;
	
	public Hora(String horaString) {
		String hString = horaString.substring(0,2);
		String mString = horaString.substring(3);
		
		this.soloHora = Integer.valueOf(hString);
		this.soloMinutos = Integer.valueOf(mString);
	}

	public int getSoloHora() {
		return soloHora;
	}

	public void setSoloHora(int soloHora) {
		this.soloHora = soloHora;
	}

	public int getSoloMinutos() {
		return soloMinutos;
	}

	public void setSoloMinutos(int soloMinutos) {
		this.soloMinutos = soloMinutos;
	}
	
	public static Hora diferenciaHora(Hora tiempo1, Hora tiempo2) {
		int horaTiempo1 = tiempo1.getSoloHora();	
		int minutosTiempo1 = tiempo1.getSoloMinutos();

		int horaTiempo2 = tiempo2.getSoloHora();	
		int minutosTiempo2 = tiempo2.getSoloMinutos();	
		
		int minutosDiferencia = 0;
		int horaDiferencia = 0;
		boolean llevaResto = false;
		
		if (minutosTiempo1 > minutosTiempo2) {
			minutosDiferencia = 60-minutosTiempo1 + minutosTiempo2;
			llevaResto = true;
		}else {
			minutosDiferencia = minutosTiempo2 - minutosTiempo1;
		}
		
		if (llevaResto) {
			horaDiferencia = horaTiempo2 - (horaTiempo1 + 1);
		}else {
			horaDiferencia = horaTiempo2 - horaTiempo1;
		}
		
		Hora tiempoDiferencia = new Hora((horaDiferencia < 10 ? "0" + horaDiferencia : horaDiferencia) + ":" + minutosDiferencia);
		
		return tiempoDiferencia;
	}

	@Override
	public String toString() {
		return (soloHora < 10 ? "0" + soloHora : soloHora) + ":" + (soloMinutos == 0 ? "00" : soloMinutos);
	}
}
