package main;

import java.io.IOException;
import java.time.LocalDate;

import Modelo.Concurso;
import Modelo.Participante;
import persistencia.ArchivoTextoRegistro;
import persistencia.JdbcRegistro;

public class MainConcurso {

	public static void main(String[] args) {
		
//		try {
//			Participante participante1 = new Participante("Juan", 0);
//			Concurso concurso = new Concurso("Concurso de dibujo", LocalDate.now(), LocalDate.of(2022, 4, 30), new ArchivoTextoRegistro ("prueba"));
//			concurso.inscribirParticipante(participante1);
//		} catch (IOException e) {
//		}
		
		
		Participante participante1 = new Participante("Juan", 0);
		Concurso concurso = new Concurso("Concurso de dibujo", LocalDate.now(), LocalDate.of(2022, 4, 30), new JdbcRegistro ("jdbc:mysql://127.0.0.1/tp2_oo2", "root", ""));
		concurso.inscribirParticipante(participante1);

	}

}
