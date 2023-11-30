package com.argprograma.tpf.DAO;

import com.argprograma.tpf.entidades.Gato;
import java.util.List;

public interface GatoDAO {

    Gato obtenerPorId(long id);

    void guardar(Gato gato);

    void actualizar(Gato gato);

    void eliminar(long id);

    List<Gato> obtenerTodos();
}
