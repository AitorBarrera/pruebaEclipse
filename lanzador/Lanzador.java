package lanzador;

import entidades.*;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Crucero crucero1 = new Crucero(1,"SAFR2314","Calavera");
		Crucero crucero2 = new Crucero(2,"MBVH9271","Titanic");
		
		Escala escala1 = new Escala("Murcia","14:15", "19:00");
		Escala escala2 = new Escala("Cadiz","08:00", "12:30");
		Escala escala3 = new Escala("Lisboa","16:45", "22:15");
		EscalaOcio escalaOcio1 = new EscalaOcio("Roma","11:20", "18:10");
		EscalaCultural escalaCultural1 = new EscalaCultural("Barcelona","09:00", "15:30", 43.35f);
		EscalaCultural escalaCultural2 = new EscalaCultural("Napoles","23:50", "05:15", 120.02f);
		EscalaOcio escalaOcio2 = new EscalaOcio("Chipre","04:50", "08:25");
		
		crucero1.setListaEscalas(escala1);
		crucero1.setListaEscalas(escala2);	
		
		crucero2.setListaEscalas(escala3);
		crucero2.setListaEscalas(escalaOcio1);
		crucero2.setListaEscalas(escalaCultural1);
		crucero2.setListaEscalas(escalaOcio2);
		crucero2.setListaEscalas(escalaCultural2);
		
//		System.out.println(crucero1);
//		System.out.println(crucero2);
//		
//		escala1.mostraHoraBajada();
		
		
//		System.out.println(crucero2);
		
		System.out.println(crucero2);
		System.out.println("El coste final es: " + crucero2.coste() + " euros.");
	}

}
