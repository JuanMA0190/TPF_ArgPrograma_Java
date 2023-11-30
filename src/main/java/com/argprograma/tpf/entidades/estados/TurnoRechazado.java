package com.argprograma.tpf.entidades.estados;

import com.argprograma.tpf.entidades.TurnoMedico;

public class TurnoRechazado implements Estado {

    @Override
    public String procesarTurno(TurnoMedico tm) {
        return "Turno Rechazado";
    }
    
}
