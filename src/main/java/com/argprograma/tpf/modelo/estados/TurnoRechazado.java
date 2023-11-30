package com.argprograma.tpf.modelo.estados;

import com.argprograma.tpf.modelo.TurnoMedico;

public class TurnoRechazado implements Estado {

    @Override
    public String procesarTurno(TurnoMedico tm) {
        return "Turno Rechazado";
    }
    
}
