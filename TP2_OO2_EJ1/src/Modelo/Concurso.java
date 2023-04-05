package Modelo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
	private String nombre;
	private LocalDate fInicioInscripcion;
	private LocalDate fFinInscripcion;
	private List<Participante> participantes;
	private Registro registro;
	private static int auxID = 1;
	private final int ID;

	public Concurso (String nombre,LocalDate fInicioInscripcion,LocalDate fFinInscripcion, Registro registro) {
		this.nombre = nombre;
		this.fInicioInscripcion = LocalDate.now();
		this.fFinInscripcion = LocalDate.now();
		this.participantes = new ArrayList<Participante>();
		this.registro = registro;
		this.ID = auxID;
		auxID ++;
	}

    public boolean inscribirParticipante(Participante participante) {
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isAfter(fFinInscripcion) || fechaActual.isBefore(fInicioInscripcion)) {
            return false;
        }
        if (fechaActual.equals(fInicioInscripcion)) {
            participante.sumarPuntos(10);
        }
        participantes.add(participante);
        String cadenaCaractares = LocalDateTime.now().toString() + "," + participante.getID() + "," + this.ID;
        this.registro.registrar(cadenaCaractares);
        return true;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
