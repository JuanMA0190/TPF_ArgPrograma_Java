package com.argprograma.tpf.modelo.estados;

import com.argprograma.tpf.modelo.TurnoMedico;

public class TurnoAceptado implements Estado {

    @Override
    public String procesarTurno(TurnoMedico tm) {
        return "Turno aceptado";
    }
    
    
    
}
