package com.argprograma.tpf.repositorios;

import com.argprograma.tpf.DAO.MascotaDAO;
import com.argprograma.tpf.entidades.Mascota;
import com.argprograma.tpf.persistencia.MascotaJpaController;
import com.argprograma.tpf.persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class MascotaRepository implements MascotaDAO {
    
    public MascotaJpaController controllerMascotaJpa;
    
    public MascotaRepository() {
        this.controllerMascotaJpa = new MascotaJpaController();
    }
    
    @Override
    public Mascota obtenerPorId(long id) {
        return controllerMascotaJpa.findMascota(id);
    }

    @Override
    public void guardar(Mascota mascota) {
        controllerMascotaJpa.create(mascota);
    }

    @Override
    public void actualizar(Mascota mascota) {
        try {
            controllerMascotaJpa.edit(mascota);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(long id) {
         try {
            controllerMascotaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public List<Mascota> obtenerTodos() {
        return controllerMascotaJpa.findMascotaEntities();
    }
    
}
