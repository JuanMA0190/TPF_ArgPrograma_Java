package com.argprograma.tpf.modelo.estados;

import com.argprograma.tpf.modelo.TurnoMedico;

public class TurnoPendiente implements Estado {

    @Override
    public String procesarTurno(TurnoMedico tm) {
       return "Turno Pendiente";
    }


}
