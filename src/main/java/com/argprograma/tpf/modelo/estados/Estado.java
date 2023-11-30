package com.argprograma.tpf.modelo.estados;

import com.argprograma.tpf.modelo.TurnoMedico;


public interface Estado {
    public String procesarTurno(TurnoMedico tm);
}
