package com.argprograma.tpf.entidades.estados;

import com.argprograma.tpf.entidades.TurnoMedico;

public class TurnoAceptado implements Estado {

    @Override
    public String procesarTurno(TurnoMedico tm) {
        return "Turno aceptado";
    }
    
    
    
}
