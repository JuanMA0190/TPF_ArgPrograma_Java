package com.argprograma.tpf.repositorios;

import com.argprograma.tpf.DAO.GatoDAO;
import com.argprograma.tpf.entidades.Gato;
import com.argprograma.tpf.persistencia.GatoJpaController;
import com.argprograma.tpf.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class GatoRepository implements GatoDAO {
    
    public GatoJpaController controllerGatoJpa;
    
    public GatoRepository() {
        this.controllerGatoJpa = new GatoJpaController();
    }
    
    @Override
    public Gato obtenerPorId(long id) {
        return controllerGatoJpa.findGato(id);
    }

    @Override
    public void guardar(Gato gato) {
        controllerGatoJpa.create(gato);
    }

    @Override
    public void actualizar(Gato gato) {
        try {
            controllerGatoJpa.edit(gato);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(long id) {
         try {
            controllerGatoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public List<Gato> obtenerTodos() {
        return controllerGatoJpa.findGatoEntities();
    }
}
