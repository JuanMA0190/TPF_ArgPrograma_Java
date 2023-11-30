package com.argprograma.tpf.DAO;

import com.argprograma.tpf.modelo.TurnoMedico;
import java.util.List;

public interface TurnoMedicoDAO {
    
    TurnoMedico obtenerPorId(long id);

    void guardar(TurnoMedico tm);

    void actualizar(TurnoMedico tm);

    void eliminar(long id);

    List<TurnoMedico> obtenerTodos();
}
