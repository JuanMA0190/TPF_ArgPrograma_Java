package com.argprograma.tpf.entidades.estados;

import com.argprograma.tpf.entidades.TurnoMedico;

public class TurnoAceptado implements Estado {

    @Override
    public Estado procesarTurno(TurnoMedico tm) {
       return this;
    }

    @Override
    public String toString() {
       return "Turno Aceptado";
    }
}
