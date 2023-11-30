package com.argprograma.tpf.repositorios;

import com.argprograma.tpf.DAO.PerroDAO;
import com.argprograma.tpf.modelo.Perro;
import com.argprograma.tpf.persistencia.PerroJpaController;
import com.argprograma.tpf.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class PerroRepository implements PerroDAO{
    
    public PerroJpaController controllerPerroJpa;
    
    public PerroRepository(){
        controllerPerroJpa = new PerroJpaController();
    }

    @Override
    public Perro obtenerPorId(long id) {
        return controllerPerroJpa.findPerro(id);
    }

    @Override
    public void guardar(Perro perro) {
        controllerPerroJpa.create(perro);
    }

    @Override
    public void actualizar(Perro perro) {
        try {
            controllerPerroJpa.edit(perro);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(long id) {
        try {
            controllerPerroJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Perro> obtenerTodos() {
        return controllerPerroJpa.findPerroEntities();
    }
    
    
}
