package com.argprograma.tpf.DAO;

import com.argprograma.tpf.modelo.Mascota;
import java.util.List;

public interface MascotaDAO {

    Mascota obtenerPorId(long id);

    void guardar(Mascota mascota);

    void actualizar(Mascota mascota);

    void eliminar(long id);

    List<Mascota> obtenerTodos();
}
