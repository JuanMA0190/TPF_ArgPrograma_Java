package com.argprograma.tpf.entidades.estados;

import com.argprograma.tpf.entidades.TurnoMedico;


public interface Estado {
    public Estado procesarTurno(TurnoMedico tm);
}
