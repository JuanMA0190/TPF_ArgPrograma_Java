package com.argprograma.tpf.DAO;

import com.argprograma.tpf.entidades.Perro;
import java.util.List;

public interface PerroDAO {
    
    Perro obtenerPorId(long id);

    void guardar(Perro perro);

    void actualizar(Perro perro);

    void eliminar(long id);

    List<Perro> obtenerTodos();
}
